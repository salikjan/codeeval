import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            int N = Integer.parseInt(line.trim());
            int M = 1;
            int p = 1;

            while (true) {
                if (isPrime(p)) {
                    M = (int)Math.pow(2, p) - 1;
                    if (M > N) break;
                    arr.add(M);
                }
                p++;
            }

            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i));
                if (i < arr.size() - 1)
                    System.out.print(", ");
            }
            System.out.println("");
        }
    }

    public static boolean isPrime(int p) {
        if (p == 1)
            return false;

        for (int d = 2; d*d <= p ; d++) {

            if (p % d == 0)
                return false;
        }
        return true;
    }
}
