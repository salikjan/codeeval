import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));

        while (sc.hasNextLine()) {
            char[] line = sc.nextLine().trim().toCharArray();
            String result = "";

            for (int i = 0; i < line.length; i++) {
                char letter = line[i];
                int count = 0;
                for (int j = i + 1; j < line.length; j++) {
                    if (letter != line[j])
                        break;
                    count++;
                }

                result += letter;
                if (count > 0)
                    i += count;
            }

            System.out.println(result);
        }
    }
}
