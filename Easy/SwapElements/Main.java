import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] tmp = sc.nextLine().trim().split(" : ");

            String[] num_str = tmp[0].split(" ");
            int[] numbers = new int[num_str.length];
            for (int i = 0; i < num_str.length; i++) {
                numbers[i] = Integer.parseInt(num_str[i]);
            }

            String[] pos_str = tmp[1].trim().split(", ");
            for (int i = 0; i < pos_str.length; i++) {
                String[] both = pos_str[i].trim().split("-");
                int pos1 = Integer.parseInt(both[0]);
                int pos2 = Integer.parseInt(both[1]);

                int swap = numbers[pos1];
                numbers[pos1] = numbers[pos2];
                numbers[pos2] = swap;
            }

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]);
                if (i < numbers.length - 1)
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
