import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] str_arr = line.trim().split(",");
            int x = Integer.parseInt(str_arr[0].trim());
            int n = Integer.parseInt(str_arr[1].trim());

            int sum = 0;

            while (sum < x)
                sum += n;

            System.out.println(sum);
        }
    }
}
