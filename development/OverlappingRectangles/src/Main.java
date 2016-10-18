import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Throwable {
	// write your code here
        solveChallenge(args);
    }

    public static void solveChallenge(String[] args) throws Throwable {
        Rectangle r1, r2;
        Point p1, p2;
        String[] input;

        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            input = sc.nextLine().trim().split(",");
            r1 = parseCoordinates(input, 0);
            r2 = parseCoordinates(input, 4);
            //
            if (r1.overlaps(r2)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

    public static Rectangle parseCoordinates(String[] str, int index) {
        Point p1 = new Point(Integer.parseInt(str[index]), Integer.parseInt(str[index + 1]));
        Point p2 = new Point(Integer.parseInt(str[index + 2]), Integer.parseInt(str[index + 3]));
        return new Rectangle(p1, p2);
    }


}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean lessThanX(Point p) {
        if (this.x < p.x) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lessThanY(Point p) {
        if (this.y < p.y) {
            return true;
        } else {
            return false;
        }
    }

    public boolean moreThanX(Point p) {
        if (this.x > p.x) {
            return true;
        } else {
            return false;
        }
    }

    public boolean moreThanY(Point p) {
        if (this.y > p.y) {
            return true;
        } else {
            return false;
        }
    }
}

class Rectangle {
    private Point leftCorner;
    private Point rightCorner;

    public Rectangle(Point p1, Point p2) {
        leftCorner = p1;
        rightCorner = p2;
    }

    public boolean overlaps(Rectangle r) {
        if (r.leftCorner.moreThanX(this.rightCorner) ||
                r.rightCorner.moreThanY(this.leftCorner) ||
                this.leftCorner.moreThanX(r.rightCorner) ||
                this.rightCorner.moreThanY(r.leftCorner)) {
            return false;
        } else {
            return true;
        }
    }
}
