import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().trim().split(" ");

            int index = 0;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < input.length; i++) {
                if (input[i].length() > max) {
                    max = input[i].length();
                    index = i;
                }
            }
            System.out.println(input[index]);
        }
    }
}
