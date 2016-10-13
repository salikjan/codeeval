import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] tmp = sc.nextLine().trim().split(" ");

            CharSequence seq_id = "id";
            CharSequence seq_label = "label";
            int sum = 0;
            for (int i = 0; i < tmp.length - 2; i++) {
                if (tmp[i].contains(seq_id)) {
                    if (tmp[i+2].contains(seq_label)) {
                        Pattern p = Pattern.compile("\\d+");
                        Matcher m = p.matcher(tmp[i+1]);
                        if (m.find())
                            sum += Integer.parseInt(m.group());
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
