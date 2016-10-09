import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();

            if ("0".equals(line)) {
                System.out.println(0);
            }

            if (!"".equals(line)) {
                System.out.println(findWays(line));
            }
        }
    }

    public static int findWays(String line) {
        int result = 0;

        if (line.length() == 1) {
            return 1;
        } else if (Integer.parseInt(line.substring(0, 2)) <= 26) {
            result += findWays(line.substring(1, line.length()));

            if (line.length() > 2) {
                result += findWays(line.substring(2, line.length()));
            } else {
                result++;
            }
        } else {
            result += findWays(line.substring(1, line.length()));
        }
        return result;
    }

}
