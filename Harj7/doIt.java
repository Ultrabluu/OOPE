/*
 * -> Takes screenshot 
 * -> makes an int[][] of it with RGB values 
 * -> Iterates through the int[][] until right colour is found, hands out coordinates
 * -> Simulates humanlike mousemovement to said point and presses MB1.
 *  UPGRADES: Make screenshotting native via JNA and colour indexing and detection via bits to cut down ms.
 *  */
import java.awt.geom.Point2D;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.awt.Point;
import java.awt.Rectangle;
import javax.imageio.ImageIO;


public class doIt {
    
    private static final int x = 910; //Middle screen X on 1920*1080
    private static final int y = 590; //...
    private static final Point2D middleScreen = new Point2D.Double( (double) x, (double) y );
   
 
    public static void main(String[] args) {  
       Point2D aimXYTest = new Point2D.Double((double) 1120, (double) 700);
       ArrayList<Point2D> curveArray = 
               generateCurve( middleScreen, aimXYTest, 150F, 0.5F ); // Test X,y's for aiming curve done
       for (int i = 0; i < curveArray.size(); i++) {    // Mouse movements
           try {
                   Robot robot = new Robot();
                   // To-do: Joko point2D takas pointiks muuntaminen kokonaisuudessaan ohjelmassa tai joku konversio intiks.
                   // Point2D getX(), getY() - metodeihin ei pääse käsiks.
           }
           catch(Exception e) {
               System.out.println("Error: " + e);
           }
       }
    }
        
    private static void useCoordinates(int[] coordinates) {
        
        int currentX = 910;
        int currentY = 590;
        
        // https://stackoverflow.com/questions/12131427/java-robot-class-simulating-human-mouse-movement
        if (coordinates != null) { 
            try {
                int aimX = coordinates[0];
                int aimY = coordinates[1];
                Robot robot = new Robot();
                // Overaim
                while ( currentX != aimX + 10 || currentY != aimY + 10 ) {
                    
                }
            }
            catch (Exception e) {
                System.out.println("Error in useCoordinates!");
                System.out.println(e);
            }
        }
        
    }
    // https://stackoverflow.com/questions/2912007/how-to-take-screenshots-fast-in-java
    // Make it faster, via not using robot.
    private static BufferedImage saveScreen() {
    // 1920x1080 resoluutiolle asetukset.
    // 1920 / 2 = 960, 1080 / 2 = 540
        final int width = 100;
        final int height = 100; 
        long startTime = System.nanoTime();
        Rectangle screenRect = new Rectangle( x, y, height, width);
        try {
            BufferedImage image = new Robot().createScreenCapture(screenRect);
            File outputfile = new File("test.jpg");
            ImageIO.write(image, "jpg", outputfile);
            long endTime = System.nanoTime();
            System.out.println("saveImage ms: "  + (endTime - startTime) / 1000000);
            return image;
            
        }
        catch (Exception e) {
            System.out.println("Error in saveScreen!");
            e.printStackTrace(System.out);
            return null;
        }
        
        
    }
    
    private static int[][] formPixelArray(BufferedImage image) {
        final int width = image.getWidth();
        final int height = image.getHeight();
        
        int[][] result = new int[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
               result[row][col] = image.getRGB(col, row);
            }
        }
            return result;
    }
    
    private static Point2D searchArray(int[][] pixelArray) { 
        int index = 0;
        long startTime = System.nanoTime();
        for (int i = 0; i < pixelArray[0].length; i++) {              
            for (int i2 = 0; i2 < pixelArray[1].length; i2++) {
                if (    pixelArray[i][i2] == -6930341 || 
                        pixelArray[i][i2] == -5555131 ||
                        pixelArray[i][i2] == -3848355 ||
                        pixelArray[i][i2] == -5819325 ||
                        pixelArray[i][i2] == -7655110 ) {;
                        Point2D aimXY = new Point2D.Double
                                ( (double) i, (double) i2 );
                        long endTime = System.nanoTime();
                        System.out.println("searchArray ms: "  + (endTime - startTime) / 1000000);
                        return aimXY;
                }
            }            
        }
        long endTime = System.nanoTime();
        System.out.println("searchArray ms: "  + (endTime - startTime) / 1000000);
        return null;
    }
    
    private static double getAngle(Point2D x, Point2D o, double R){
        double cosa = ( x.getX() - o.getX() ) / R;
        double sina = ( x.getY() - o.getY() ) / R;

        double angle = Math.acos(cosa);

        return Math.sin(angle)*sina >= 0 ? angle : 2*Math.PI - angle;
    }

    private static ArrayList<Point2D> generateCurve(Point2D pFrom,Point2D pTo,float pRadius,float pMinDistance){

        ArrayList<Point2D> pOutPut = new ArrayList<Point2D>();
        long startTime = System.nanoTime();
        double dist = pFrom.distance(pTo);
        double h = Math.sqrt(pRadius * pRadius - (dist * dist / 4.0));
        double angleStep = pMinDistance/pRadius;

        if(2*pRadius <= dist)
            throw new Error("Radius is too small");

        //find center
        double x1 = pFrom.getX(), x2 = pFrom.getY();
        double y1 = pTo.getX(), y2 = pTo.getY();
        double m1 = (x1+y1)/2, m2 = (x2+y2)/2;
        double u1 = - (y2-x2)/dist, u2 = (y1-x1)/dist;
        double o1 = m1 + h * u1, o2 = m2 + h * u2;
        Point2D o = new Point2D.Double(o1, o2);

        double startAngle = getAngle(pFrom, o, pRadius);
        double endAngle = getAngle(pTo, o, pRadius);

        if(endAngle < startAngle)
            endAngle += 2 * Math.PI;        

        for(double a = startAngle; a < endAngle; a+=angleStep){
            pOutPut.add(new Point2D.Double(o1+pRadius*Math.cos(a), o2+pRadius*Math.sin(a)));
        }

        pOutPut.add(pTo);
        long endTime = System.nanoTime();
        System.out.println("CurveCalculations ms: "  + (endTime - startTime) / 1000000);
        return pOutPut;
    }
         
}
