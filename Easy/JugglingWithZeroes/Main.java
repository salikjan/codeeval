import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().trim().split(" ");
            String result = "";

            for (int i = 0; i < input.length; i++) {
                String s = input[i++].trim();
                if ("00".equals(s)) {
                    char[] buffer = input[i].trim().toCharArray();
                    for (int j = 0; j < buffer.length; j++) {
                        buffer[j] = '1';
                    }
                    s = new String(buffer);
                } else {
                    s = input[i].trim();
                }
                result += s;
            }

            System.out.println(Long.parseLong(result, 2));
        }
    }
}
