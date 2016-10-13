import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] str = sc.nextLine().trim().split(",");

            List<String> strings = new ArrayList<String>() ;
            List<Integer> numbers = new ArrayList<Integer>();

            for (int i = 0; i < str.length; i++) {
                try {
                    int num = Integer.parseInt(str[i].trim());
                    numbers.add(num);
                }
                catch (NumberFormatException e) {
                    strings.add(str[i].trim());
                }
            }

            String s = "";
            if (strings.size() > 0) {
                Iterator<String> it = strings.iterator();

                while (true) {
                    s += it.next();

                    if (it.hasNext())
                        s += ",";
                    else
                        break;
                }
            }

            if (numbers.size() > 0) {
                Iterator<Integer> it = numbers.iterator();
                if (strings.size() > 0)
                    s += "|";

                while (true) {
                    s += it.next();

                    if (it.hasNext())
                        s += ",";
                    else
                        break;
                }
            }

            System.out.println(s);
        }
    }
}
