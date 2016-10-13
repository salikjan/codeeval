import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] str_arr = line.split("\\|");
            String[] num_arr = str_arr[1].trim().split(" ");

            char[] writer = str_arr[0].trim().toCharArray();
            int[] key = new int[num_arr.length];

            for (int i = 0; i < num_arr.length; i++) {
                key[i] = Integer.parseInt(num_arr[i].trim());
            }

            for (int i = 0; i < key.length; i++) {
                System.out.print(writer[key[i] - 1]);
            }
            System.out.println("");
        }
    }
}
