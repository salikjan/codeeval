import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            int iter = 0;
            while (n != 1 && iter++ <= 1000) {
                int m = n;
                int sum = 0;
                while (m > 0) {
                    int digit = m % 10;
                    sum += digit * digit;
                    m = m / 10;
                }
                n = sum;
            }

            if (n == 1 && iter < 1000)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
