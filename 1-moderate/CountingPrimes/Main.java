import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] buffer = sc.nextLine().trim().split(",");
            int N = Integer.parseInt(buffer[0]);
            int M = Integer.parseInt(buffer[1]);
            int counter = 0;

            for (int i = N; i <= M; i++) {
                if (isPrime(i)) {
                    counter++;
                }
            }

            System.out.println(counter);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        //
        int i = 5;
        while (i*i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
}
