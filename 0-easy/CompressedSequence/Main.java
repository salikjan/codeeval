import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().trim().split(" ");
            int[] numbers = new int[input.length];

            for (int i = 0; i < input.length; i++) {
                numbers[i] = Integer.parseInt(input[i]);
            }

            int curPos = 0;
            int startPos = curPos;
            while (true) {
                int n = numbers[curPos];
                while (curPos < numbers.length) {
                    if (n != numbers[curPos])
                        break;
                    curPos++;
                }
                System.out.print(curPos - startPos + " " + n);

                if (curPos < numbers.length)
                    System.out.print(" ");

                if (curPos == numbers.length)
                    break;

                startPos = curPos;
            }
            System.out.println("");
        }
    }
}
