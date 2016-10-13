import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        Map<String, Integer> digits = new HashMap<String, Integer>();
        digits.put("zero", 0);
        digits.put("one", 1);
        digits.put("two", 2);
        digits.put("three", 3);
        digits.put("four", 4);
        digits.put("five", 5);
        digits.put("six", 6);
        digits.put("seven", 7);
        digits.put("eight", 8);
        digits.put("nine", 9);

        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.trim().split(";");

            for (String s : arr) {
                System.out.print(digits.get(s.trim()));
            }
            System.out.println("");
        }
    }
}
