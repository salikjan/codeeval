import java.io.*;
import java.util.*;

public class Main {
    public static Map<Character, Integer> romanic = new HashMap<Character, Integer>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public static void main(String[] args) throws Throwable {
	// write your code here
        solveChallenge(args);
    }

    public static void solveChallenge(String[] args) throws Throwable {
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            System.out.println(getPairSumm(sc.nextLine()));
        }

    }

    public static int getPairSumm(String line) {
        char[] buffer = line.toCharArray();
        int sum = 0;
        //
        if ("".equals(line)) {
            return 0;
        }

        if (buffer.length == 2) {
            int A1 = Character.getNumericValue(buffer[0]);
            int R1 = romanic.get(buffer[1]);
            sum += A1 * R1;
            return sum;
        }

        for (int i = 2; i < buffer.length; i+=2) {
            int A1 = Character.getNumericValue(buffer[i - 2]);
            int R1 = romanic.get(buffer[i - 1]);
            int A2 = Character.getNumericValue(buffer[i]);
            int R2 = romanic.get(buffer[i + 1]);
            //
            if (R2 > R1) {
                sum -= A1 * R1;
            } else {
                sum += A1 * R1;
            }

            if (i == buffer.length - 2) {
                sum += A2 * R2;
            }
        }
        //
        return sum;
    }

}
