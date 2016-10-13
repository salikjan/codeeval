import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] strarr = line.split(" ");
            int[] numarr = new int[strarr.length];

            for (int i = 0; i < strarr.length; i++) {
                numarr[i] = Integer.parseInt(strarr[i]);
            }
            int X = numarr[0];
            int Y = numarr[1];
            int N = numarr[2];

            // Process line of input Here
            for (int i = 1; i <= N; i++) {
                if (i % X != 0 && i % Y != 0)
                    System.out.print(i);
                else {
                    if (i % X == 0)
                        System.out.print("F");
                    if (i % Y == 0)
                        System.out.print("B");
                }

                if (i != N)
                    System.out.print(" ");
                else
                    System.out.println("");
            }
        }
    }
}