import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            char[] arr = line.trim().toCharArray();
            int arrowsAmount = 0;
            for (int i = 0; i < arr.length - 4; i++) {
                if (arr[i] == '<') {
                    if (    arr[i + 1] == '-' &&
                            arr[i + 2] == '-' &&
                            arr[i + 3] == '<' &&
                            arr[i + 4] == '<') {
                        arrowsAmount++;
                    }
                }
                if (arr[i] == '>') {
                    if (    arr[i + 1] == '>' &&
                            arr[i + 2] == '-' &&
                            arr[i + 3] == '-' &&
                            arr[i + 4] == '>') {
                        arrowsAmount++;
                    }
                }
            }
            System.out.println(arrowsAmount);
        }
    }
}
