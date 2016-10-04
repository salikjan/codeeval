import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        File file = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;

        Map<String, Integer> hex = new HashMap<String, Integer>();
        hex.put("a", 10);
        hex.put("b", 11);
        hex.put("c", 12);
        hex.put("d", 13);
        hex.put("e", 14);
        hex.put("f", 15);

        while ((line = bufferedReader.readLine()) != null) {
            line = line.trim();
            int end = line.length();
            int idx = end - 1;
            int base = 1;
            int number = 0;
            int digit;
            for (int i = 0; i < end; i++) {
                String s = line.substring(idx, idx + 1);
                try {
                    digit = Integer.parseInt(s);
                }
                catch (NumberFormatException e) {
                    digit = hex.get(s);
                }
                number += digit * base;
                base *= 16;
                idx--;
            }
            System.out.println(number);
        }
    }
}
