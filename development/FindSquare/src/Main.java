import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Throwable {
	// write your code here
        solveChallenge(args);
    }

    public static void solveChallenge(String... args) throws Throwable {
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if ("".equals(line)) {
                continue;
            }

            String coordsPattern = "\\((.*)\\), \\((.*)\\), \\((.*)\\), \\((.*)\\)";
            Point[] points = new Point[4];

            Pattern p = Pattern.compile(coordsPattern);
            Matcher m = p.matcher(line);

            if (m.find()) {
                String[] s = m.group(1).trim().split(",");
                points[0] = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));

                s = m.group(2).trim().split(",");
                points[1] = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));

                s = m.group(3).trim().split(",");
                points[2] = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));

                s = m.group(4).trim().split(",");
                points[3] = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            } else {
                System.out.println("NO MATCH!");
                return;
            }

            Rectangle r = new Rectangle(points[0], points[1], points[2], points[3]);

            if (r.isSquare()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}

class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

class Rectangle {
    Point p1, p2, p3, p4;

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public boolean isSquare() {
        return true;
    }

    private double getDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
}
