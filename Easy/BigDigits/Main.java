import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        final int FONT_WIDTH = 4;
        final int FONT_HEIGHT = 6;

        String[] digits = {
                "-**-*--**--**--*-**-----",
                "--*--**---*---*--***----",
                "***----*-**-*---****----",
                "***----*-**----****-----",
                "-*--*--*****---*---*----",
                "*****---***----****-----",
                "-**-*---***-*--*-**-----",
                "****---*--*--*---*------",
                "-**-*--*-**-*--*-**-----",
                "-**-*--*-***---*-**-----"
        };

        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String str = sc.nextLine().replaceAll("\\D+", "");
            StringBuffer[] rows = new StringBuffer[FONT_HEIGHT];
            for (int i = 0; i < rows.length; i++) {
                rows[i] = new StringBuffer("");
            }

            for (int i = 0; i < str.length(); i++) {
                int index = Character.getNumericValue(str.charAt(i));

                for (int j = 0; j < FONT_HEIGHT; j++) {
                    rows[j].append(digits[index].substring(j * FONT_WIDTH, j * FONT_WIDTH + FONT_WIDTH));
                    rows[j].append("-");
                }
            }

            for (int i = 0; i < FONT_HEIGHT; i++) {
                System.out.println(rows[i]);
            }

        }
    }
}
