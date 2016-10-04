import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            char[] buffer = line.toCharArray();
            int period = line.length();

            char ch = buffer[0];
            int index = line.indexOf(ch, 1);
            if (buffer.length % index == 0 && index != -1) {
                period = index;
                String s = line.substring(0, index);
                for (int i = 0; i < line.length() / index; i++) {
                    String tmp = line.substring(i * s.length(), i * s.length() + s.length());
                    if (!tmp.equals(s)) {
                        period = line.length();
                        break;
                    }
                }
            }
            System.out.println(period);
        }
    }
}
