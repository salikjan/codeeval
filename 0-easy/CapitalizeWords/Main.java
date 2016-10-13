import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(capitalizeWords(line.trim()));
        }
    }

    public static String capitalizeWords(String line) {
        char arr[] = new char[line.length()];

        arr = line.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (i == 0 || Character.isWhitespace(arr[i - 1])) {
                arr[i] = Character.toUpperCase(ch);
            }
        }

        return new String(arr);
    }
}
