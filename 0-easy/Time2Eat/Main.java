import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] str_arr = line.split(" ");
            ArrayList<String> arr = new ArrayList<String>();

            for (int i = 0; i < str_arr.length; i++) {
                arr.add(str_arr[i].trim());
            }

            Collections.sort(arr, Collections.reverseOrder());

            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i));
                if (i < arr.size())
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
