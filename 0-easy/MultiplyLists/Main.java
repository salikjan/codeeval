import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] both = sc.nextLine().trim().split("\\|");
            String[] tmp = both[0].trim().split(" ");

            int[] num1 = new int[tmp.length];
            for (int i = 0; i < tmp.length; i++) {
                num1[i] = Integer.parseInt(tmp[i]);
            }

            tmp = both[1].trim().split(" ");
            int[] num2 = new int[tmp.length];
            for (int i = 0; i < tmp.length; i++) {
                num2[i] = Integer.parseInt(tmp[i]);
            }

            for (int i = 0; i < num1.length; i++) {
                System.out.print(num1[i] * num2[i]);
                if (i < num1.length - 1)
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
