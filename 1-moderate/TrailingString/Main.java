import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] buffer = sc.nextLine().trim().split(",");
            if (buffer[0].endsWith(buffer[1].trim())) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
