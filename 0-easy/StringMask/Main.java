import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(" ");

            char[] word = arr[0].trim().toCharArray();
            char[] binary = arr[1].trim().toCharArray();

            for (int i = 0; i < binary.length; i++) {
                if (binary[i] == '1')
                    word[i] = Character.toUpperCase(word[i]);
                else
                    word[i] = Character.toLowerCase(word[i]);
            }

            String s = new String(word);
            System.out.println(s);
        }
    }
}
