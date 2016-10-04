import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            String result = "";
            String filler = "... <Read More>";

            if (line.length() <= 55) {
                result = line;
            } else {
                result = line.substring(0, 40);
                int pos = result.lastIndexOf(' ');
                if (pos >= 0)
                    result = result.substring(0, pos);
                result += filler;
            }

            System.out.println(result);
        }
    }
}
