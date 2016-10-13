import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        File file = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] str_arr = line.split(",");
            int n = Integer.parseInt(str_arr[0]);
            int m = Integer.parseInt(str_arr[1]);

            int d = n / m;
            System.out.println(n - m * d);
        }
    }
}
