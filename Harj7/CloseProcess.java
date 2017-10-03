// PID is dynamic, code has to be changed as such too.

import java.io.IOException;

public class CloseProcess {
    
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("taskkill /F /PID 11412");
    }

}
