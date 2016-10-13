import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().trim().split(" ");
            if (input.length == 0) break;

            int o = Integer.parseInt(input[0]);
            int p = Integer.parseInt(input[1]);
            int q = Integer.parseInt(input[2]);
            int r = Integer.parseInt(input[3]);

            StringBuilder sb = new StringBuilder("");

            if (r > p) {
                sb.append("N");
            } else if (r < p) {
                sb.append("S");
            }

            if (q > o) {
                sb.append("E");
            } else if (q < o) {
                sb.append("W");
            }

            if (r == p && q == o) {
                sb.append("here");
            }

            System.out.println(sb);
        }
    }
}
