import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        solveChallenge(args);
    }

    public static void solveChallenge(String... args) throws IOException {
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextInt()) {
            System.out.println(findNumberOfCoins(sc.nextInt()));
        }
    }

    public static int findNumberOfCoins(int total) {
        int values[] = {5, 3, 1};
        int result = 0;

        for (int i = 0; i < values.length; i++) {
            result += total / values[i];
            total = total % values[i];
        }

        return result;
    }
}
