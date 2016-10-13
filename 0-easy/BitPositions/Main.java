import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] threesome = sc.nextLine().trim().split(",");
            int n = Integer.parseInt(threesome[0]);
            int p1 = Integer.parseInt(threesome[1]) - 1;
            int p2 = Integer.parseInt(threesome[2]) - 1;

            int b1 = ((1 << p1) & n) >> p1;
            int b2 = ((1 << p2) & n) >> p2;

            if (b1 == b2)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
