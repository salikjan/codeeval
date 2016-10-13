import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] tmp = sc.nextLine().trim().split(" ");
            int n = (int)Math.sqrt(tmp.length);
            String[][] dest = new String[n][n];
            String[][] source = new String[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    source[i][j] = tmp[i * n + j];
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dest[j][n - i - 1] = source[i][j];
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(dest[i][j]);
                    if (j < n - 1)
                        System.out.print(" ");
                }
                if (i < n - 1)
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
