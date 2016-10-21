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
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}

class Point {
    public int x;
    public int y;

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
            this.p1 = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));

            s = m.group(2).trim().split(",");
            this.p2 = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));

            s = m.group(3).trim().split(",");
            this.p3 = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));

            s = m.group(4).trim().split(",");
            this.p4 = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        } else {
            System.out.println("NO MATCH!");
        }
    }

    public boolean isSquare() {
        long dlp1p2 = (long)(Math.sqrt(Math.pow(this.p1.x - this.p2.x, 2) - Math.pow(this.p1.y - this.p2.y, 2)) * 10000);
        long dlp2p3 = (long)(Math.sqrt(Math.pow(this.p2.x - this.p3.x, 2) - Math.pow(this.p2.y - this.p3.y, 2)) * 10000);
        long dlp3p4 = (long)(Math.sqrt(Math.pow(this.p3.x - this.p4.x, 2) - Math.pow(this.p3.y - this.p4.y, 2)) * 10000);
        long dlp4p1 = (long)(Math.sqrt(Math.pow(this.p4.x - this.p1.x, 2) - Math.pow(this.p4.y - this.p1.y, 2)) * 10000);
        long dlp1p3 = (long)(Math.sqrt(Math.pow(this.p1.x - this.p3.x, 2) - Math.pow(this.p1.y - this.p3.y, 2)) * 10000);
        long dlp2p4 = (long)(Math.sqrt(Math.pow(this.p2.x - this.p4.x, 2) - Math.pow(this.p2.y - this.p4.y, 2)) * 10000);

        if (dlp1p2 == dlp2p3 && dlp2p3 == dlp3p4 && dlp3p4 == dlp4p1 && dlp1p3 == dlp2p4) {
            return true;
        } else {
            return false;
        }
    }
}
