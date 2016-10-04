import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            line = line.trim();
            char[] arr = line.toCharArray();

            boolean isBig = true;

            for (int i = 0; i < arr.length; i++) {
                if (Character.isLetter(arr[i])) {
                    if (isBig)
                        arr[i] = Character.toUpperCase(arr[i]);
                    else
                        arr[i] = Character.toLowerCase(arr[i]);
                    isBig = !isBig;
                }
            }

            String s = new String(arr);

            System.out.println(s);
        }
    }
}
