import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Throwable {
	    // write your code here
        solveChallenge(args);
    }

    public static void solveChallenge(String[] args) throws Throwable {
        Scanner sc = new Scanner(new File(args[0]));
        String fileLine;
        while (sc.hasNextLine()) {
            fileLine = sc.nextLine().trim();
            System.out.println(splitNumber(fileLine));
        }
    }

    public static long splitNumber(String line) {
        long result = 0;
        String[] tmp = line.split(" ");
        int op1, op2;

        int pos = tmp[1].trim().indexOf('-');
        if (pos != -1) {
            op1 = Integer.parseInt(tmp[0].substring(0, pos));
            op2 = Integer.parseInt(tmp[0].substring(pos, tmp[0].length()));
            return op1 - op2;
        } else {
            pos = tmp[1].trim().indexOf('+');
            if (pos != -1) {
                op1 = Integer.parseInt(tmp[0].substring(0, pos));
                op2 = Integer.parseInt(tmp[0].substring(pos, tmp[0].length()));
                return op1 + op2;
            }
        }
        return result;
    }
}
