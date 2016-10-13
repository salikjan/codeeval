import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] both = sc.nextLine().trim().split("\\|");
            String[] virus_str = both[0].trim().split(" ");
            String[] antivirus_str = both[1].trim().split(" ");

            int hex_sum = 0;
            for (int i = 0; i < virus_str.length; i++) {
                int n = Integer.parseInt(virus_str[i], 16);
                hex_sum += n;
            }

            int bin_sum = 0;
            for (int i = 0; i < antivirus_str.length; i++) {
                int n = Integer.parseInt(antivirus_str[i], 2);
                bin_sum += n;
            }

            if (bin_sum >= hex_sum)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
