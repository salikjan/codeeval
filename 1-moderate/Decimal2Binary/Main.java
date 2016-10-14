import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextInt()) {
            int decimal = sc.nextInt();

            if (decimal < 0)
                continue;

            if (decimal == 0) {
                System.out.println("0");
                continue;
            }

            StringBuilder sb = new StringBuilder();

            while (decimal > 0) {
                int digit = decimal % 2;
                sb.append(digit);
                decimal /= 2;
            }

            System.out.println(sb.reverse());

        }
    }
}
