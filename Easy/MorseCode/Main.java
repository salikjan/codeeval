import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Map<String, String> m = new HashMap<String, String>();

        m.put(".", "E");
        m.put("..", "I");
        m.put("...", "S");
        m.put("....", "H");
        m.put(".....", "5");
        m.put("....-", "4");
        m.put("...-", "V");
        m.put("...--", "3");
        m.put("..-", "U");
        m.put("..-.", "F");
        m.put("..---", "2");
        m.put(".-", "A");
        m.put(".-.", "R");
        m.put(".-..", "L");
        m.put(".--", "W");
        m.put(".--.", "P");
        m.put(".---", "J");
        m.put(".----", "1");

        m.put("-", "T");
        m.put("--", "M");
        m.put("---", "O");
        m.put("-----", "0");
        m.put("----.", "9");
        m.put("---..", "8");
        m.put("--.", "G");
        m.put("--.-", "Q");
        m.put("--..", "Z");
        m.put("--...", "7");
        m.put("-.", "N");
        m.put("-.-", "K");
        m.put("-.--", "Y");
        m.put("-.-.", "C");
        m.put("-..", "D");
        m.put("-..-", "X");
        m.put("-...", "B");
        m.put("-....", "6");

        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] words = sc.nextLine().trim().split("  ");

            for (int i = 0; i < words.length; i++) {
                String s = "";
                String[] letters = words[i].trim().split(" ");
                for (int j = 0; j < letters.length; j++) {
                    String key = letters[j];
                    if (m.containsKey(key))
                    s += m.get(key);
                }
                System.out.print(s);
                if (i < words.length - 1)
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
