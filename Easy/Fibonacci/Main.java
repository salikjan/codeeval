import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            int fibonacci = 0;

            int N = Integer.parseInt(line.trim());

            System.out.println(fibo(N));
        }
    }

    // Fibonacci is defined as: F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2) when n > 1
    public static int fibo(int n) {
        // F(n-2)
        int x = 0;
        // F(n-1)
        int y = 1;

        if (n == 0)
           return 0;

        if (n == 1)
            return 1;

        int answer = x;
        for (int i = 1; i < n ; i++) {
            answer = x + y;
            x = y;
            y = answer;
        }

        return answer;
    }

    public static int fib_recurse(int n) {
        if (n == 0)
            return 0;
        else {
            if (n == 1)
                return 1;
            else {
                return fib_recurse(n - 1) + fib_recurse(n - 2);
            }
        }
    }
}
