import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            double digitalDegrees = Double.parseDouble(sc.nextLine());
            int degrees = (int)digitalDegrees;
            double mm = (digitalDegrees - degrees * 1.0) * 60.0;
            int minutes = (int)mm;
            double ss = (mm - minutes * 1.0) * 60;
            int seconds = (int)ss;

            System.out.printf("%d.%02d'%02d\"\n", degrees, minutes, seconds);
        }
    }
}
