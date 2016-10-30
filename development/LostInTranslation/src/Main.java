import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        solveChallenge(args);
    }

    public static void solveChallenge(String... args) throws IOException {
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            System.out.println(translateText(sc.nextLine()));
        }
    }

    public static String translateText(String line) {
        char[] arr = line.trim().toCharArray();
        StringBuilder sb = new StringBuilder("");
        Map<Character, Character> map = new HashMap<Character, Character>() {{
            put('a','y');
            put('b','h');
            put('c','e');
            put('d','s');
            put('e','o');
            put('f','c');
            put('g','v');
            put('h','x');
            put('i','d');
            put('j','u');
            put('k','i');
            put('l','g');
            put('m','l');
            put('n','b');
            put('o','k');
            put('p','r');
            put('q','z');
            put('r','t');
            put('s','n');
            put('t','w');
            put('u','j');
            put('v','p');
            put('w','f');
            put('x','m');
            put('y','a');
            put('z','q');
        }};

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (map.containsKey(ch)) {
                sb.append(map.get(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
