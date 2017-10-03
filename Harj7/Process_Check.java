

import java.util.Scanner;

public class Process_Check {

 public static void main(String[] args) throws Exception {
        Processes.ALL_PROCESSES.listProcesses();
   }
 public static enum Processes implements IProcessListingStrategy {
        ALL_PROCESSES;

        private IProcessListingStrategy processListing = selectProcessListingStrategy();

        public void listProcesses() throws Exception {
            processListing.listProcesses();
        }

        private IProcessListingStrategy selectProcessListingStrategy() {
            //todo add support for mac ...
            return isWindows() ? new WinProcessListingStrategy() : new LinuxProcessListingStrategy();
        }

        private static boolean isWindows() {
            return System.getProperty("os.name").toLowerCase().indexOf("win") >= 0;

        }
    }

    static interface IProcessListingStrategy {
        void listProcesses() throws Exception;
    }

    static abstract class AbstractNativeProcessListingStrategy implements IProcessListingStrategy {
        public void listProcesses() throws Exception {
            Process process = makeProcessListingProcessBuilder().start();
            Scanner scanner = new Scanner(process.getInputStream());
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            process.waitFor();
        }

        protected abstract ProcessBuilder makeProcessListingProcessBuilder();
    }
    static class WinProcessListingStrategy extends AbstractNativeProcessListingStrategy {
        @Override
        protected ProcessBuilder makeProcessListingProcessBuilder() {
            return new ProcessBuilder("cmd", "/c", "tasklist");
        }
    }

    static class LinuxProcessListingStrategy extends AbstractNativeProcessListingStrategy {
        @Override
        protected ProcessBuilder makeProcessListingProcessBuilder() {
            return new ProcessBuilder("ps", "-e");
        }
    }
}