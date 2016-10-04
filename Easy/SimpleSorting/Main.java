import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        File f = new File(args[0]);
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;
        double[] arr;
        String[] str_arr;

        while ((line = br.readLine()) != null) {
            str_arr = line.trim().split(" ");
            arr = new double[str_arr.length];
            for (int i = 0; i < str_arr.length; i++) {
                arr[i] = Double.parseDouble(str_arr[i]);
            }
            Arrays.sort(arr);

            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%.3f", arr[i]);
                if (i < arr.length)
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
