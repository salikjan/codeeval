import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringBuilder result = new StringBuilder("");

            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch >= 'a' && ch <= 'j') {
                    result.append(ch - 'a');
                } else if (ch >= '0' && ch <= '9') {
                    result.append(ch);
                }
            }

            if (result.length() == 0)
                System.out.println("NONE");
            else
                System.out.println(result);
        }
    }
}
