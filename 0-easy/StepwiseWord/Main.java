import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] str_arr = line.split(" ");

            int maxLength = 0;
            int idx = 0;
            for (int i = 0; i < str_arr.length; i++) {
                if (str_arr[i].length() > maxLength) {
                    maxLength = str_arr[i].length();
                    idx = i;
                }
            }

            char[] characters = str_arr[idx].trim().toCharArray();

            for (int i = 0; i < characters.length; i++) {
                for (int j = 0; j < i ; j++) {
                    System.out.print("*");
                }
                System.out.print(characters[i]);
                if (i < characters.length - 1)
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
