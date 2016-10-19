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
            Rectangle r = new Rectangle(sc.nextLine());
            if (r.isSquare()) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle {
    final static String coordsPattern = "\\((.*)\\), \\((.*)\\), \\((.*)\\), \\((.*)\\)";
    Point p1, p2, p3, p4;

    public Rectangle(String coords) {
        Pattern p = Pattern.compile(coordsPattern);
        Matcher m = p.matcher(coords);

        if (m.find()) {
            String[] s = m.group(1).trim().split(",");
            Point point = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            this.p1 = point;

            s = m.group(2).trim().split(",");
            point = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            this.p2 = point;

            s = m.group(3).trim().split(",");
            point = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            this.p3 = point;

            s = m.group(4).trim().split(",");
            point = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            this.p4 = point;
        } else {
            System.out.println("NO MATCH!");
        }
    }

    public boolean isSquare() {
        boolean isX = false;
        boolean isY = false;


        return true;
    }
}