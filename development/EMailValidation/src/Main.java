import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        solveChallenge(args);
    }

    public static void solveChallenge(String... args) throws IOException {
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            if (isValidEMail(sc.nextLine())) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

    public static boolean isValidEMail(String line) {
        String EMAIL_REGIX = "^[_A-Za-z0-9-\\.\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$|" +
                "^\"[_A-Za-z0-9-\\.\\+@]+(\\.[_A-Za-z0-9-]+)*\"@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";;
        Pattern p = Pattern.compile(EMAIL_REGIX);
        Matcher m = p.matcher(line);
        return !line.isEmpty() && line != null && m.matches();
    }

}
