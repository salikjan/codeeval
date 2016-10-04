import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
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
            StringBuffer[] rows = new StringBuffer[6];
            for (int i = 0; i < rows.length; i++) {
                rows[i] = new StringBuffer("");
            }

            for (int i = 0; i < str.length(); i++) {
                int index = Character.getNumericValue(str.charAt(i));

                for (int j = 0; j < 6; j++) {
                    rows[j].append(digits[index].substring(j * 4, j * 4 + 4));
                    rows[j].append("-");
                }
            }

            for (int i = 0; i < 6; i++) {
                System.out.println(rows[i]);
            }

        }
    }
}
