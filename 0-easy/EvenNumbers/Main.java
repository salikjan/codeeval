import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            int n = Integer.parseInt(line);

            if (n % 2 == 0)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
