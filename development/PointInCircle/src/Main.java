import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {
    private static double centerX, centerY, radius, pointX, pointY;

    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            if (parseLine(sc.nextLine())) {
                if (isInsideCircle()) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            } else {
                System.out.println("false");
            }
        }
    }

    public static boolean parseLine(String line) {
        Pattern p = Pattern.compile("Center: (.*); Radius: (.*); Point: (.*)");

        Matcher m = p.matcher(line);
        if (m.find()) {
            String[] point = m.group(1).split(",");
            centerX = Double.parseDouble(point[0].substring(1, point[0].length()));
            centerY = Double.parseDouble(point[1].substring(0, point[1].length() - 1));
            //
            radius = Double.parseDouble(m.group(2));
            //
            point = m.group(3).split(",");
            pointX = Double.parseDouble(point[0].substring(1, point[0].length()));
            pointY = Double.parseDouble(point[1].substring(0, point[1].length() - 1));
            //
            return true;
        } else {
            return false;
        }
    }

    public static boolean isInsideCircle() {
        // (x - centerx)^2 + (y - centery)^2 < radius^2
        double x2 = (pointX - centerX) * (pointX - centerX);
        double y2 = (pointY - centerY) * (pointY - centerY);
        double r2 = radius * radius;

        if ((x2 + y2) < r2) {
            return true;
        } else {
            return false;
        }
    }

}
