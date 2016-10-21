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
                for (int i = 0; i < 4; i++) {
                    String[] s = m.group(i + 1).trim().split(",");
                    points[i] = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
                }
            } else {
                System.out.println("NO MATCH!");
                return;
            }
            // find distance to other points to pass them Rectangle() in specific order
            int l1 = points[0].getDistance(points[1]);
            int l2 = points[0].getDistance(points[2]);
            int l3 = points[0].getDistance(points[3]);

            Rectangle r;
            if (l1 == l2 && l2 == l3) {
                System.out.println("false");
                continue;
            } else if (l1 == l2) {
                r = new Rectangle(points[0], points[1], points[3], points[2]);
            } else if (l2 == l3) {
                r = new Rectangle(points[0], points[2], points[1], points[3]);
            } else if (l1 == l3) {
                r = new Rectangle(points[0], points[1], points[2], points[3]);
            } else {
                System.out.println("false");
                continue;
            }

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

    // Distance is computed as sqrt of this summ but to avoid floating point operations
    // i suggest using integer values
    public int getDistance(Point p) {
        int diffX = getX() - p.getX();
        int diffY = getY() - p.getY();
        return diffX * diffX + diffY * diffY;
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
        int dlp1p2 = p1.getDistance(p2);
        int dlp2p3 = p2.getDistance(p3);
        int dlp3p4 = p3.getDistance(p4);
        int dlp4p1 = p4.getDistance(p1);
        int dlp1p3 = p1.getDistance(p3);  // diagonal
        int dlp2p4 = p2.getDistance(p4);  // diagonal

        // can be rectangle
        if (dlp1p2 == dlp2p3 && dlp2p3 == dlp3p4 && dlp3p4 == dlp4p1) {
            // really a square
            if (dlp1p3 == dlp2p4) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
