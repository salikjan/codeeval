import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));

        final String[] slang = {
                ", yeah!",
                ", this is crazy, I tell ya.",
                ", can U believe this?",
                ", eh?",
                ", aw yea.",
                ", yo.",
                "? No way!",
                ". Awesome!"
        };

        int slangPos = 0;
        boolean isSlang = false;

        while (sc.hasNextLine()) {
            String[] words = sc.nextLine().trim().split(" ");

            for (int i = 0; i < words.length; i++) {
                int punctPos = i;

                while (punctPos < words.length) {
                    if (words[punctPos++].matches(".*[\\.\\?\\!]"))
                        break;
                }

                String s = "";
                for (int j = i; j < punctPos; j++) {
                    s += words[j];
                    if (j < punctPos - 1)
                        s += " ";
                }

                if (isSlang) {
                    s = s.substring(0, s.length() - 1);
                    if (slangPos == slang.length)
                        slangPos = 0;
                    s += slang[slangPos++];
                }
                isSlang = !isSlang;
                i = punctPos - 1;

                System.out.print(s);
                if (i < words.length - 1)
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
