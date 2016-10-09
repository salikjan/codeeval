import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            System.out.println(recoverData(sc.nextLine()));
        }
    }

    public static String recoverData(String line) {
        String[] buffer = line.split(";");
        String[] words = buffer[0].trim().split(" ");
        String[] indexes = buffer[1].trim().split(" ");

        //
        Map<Integer, String> wordsInOrder = new TreeMap<Integer, String>();
        for (int i = 0; i < indexes.length; i++) {
            wordsInOrder.put(Integer.parseInt(indexes[i]), words[i]);
        }
        //
        for (int i = 1; i <= words.length; i++) {
            if (!wordsInOrder.containsKey(i)) {
                wordsInOrder.put(i, words[words.length - 1]);
            }
        }
        //
        int index = 0;
        StringBuilder result = new StringBuilder("");
        for (Integer key : wordsInOrder.keySet()) {
            result.append(wordsInOrder.get(key));
            if (index < wordsInOrder.keySet().size() - 1) {
                result.append(" ");
                index++;
            }
        }

        return result.toString();
    }
}
