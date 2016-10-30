import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        solveChallenge(args);
    }

    public static void solveChallenge(String[] args) throws IOException {
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            char ch = getNonRepeatedCharacter(sc.nextLine());
            if (ch != ' ') {
                System.out.println(ch);
            }
        }
    }

    public static char getNonRepeatedCharacter(String line) {
        char[] arr = line.toCharArray();
        char ch = arr[0];
        boolean isRepeatable = false;
        for (int i = 0; i < arr.length; i++) {
            isRepeatable = false;
            ch = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j] == ch) {
                    isRepeatable = true;
                    break;
                }
            }

            if (!isRepeatable) {
                return ch;
            }
        }
        return ' ';
    }
}
