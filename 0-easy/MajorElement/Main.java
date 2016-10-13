import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().trim().split(",");
            int seqLength = input.length;
            Map<Integer, Integer> m = new HashMap<Integer, Integer>();

            for (int i = 0; i < input.length; i++) {
                int n = Integer.parseInt(input[i]);
                if (m.containsKey(n)) {
                    int count = m.get(n);
                    count++;
                    m.put(n, count);
                } else {
                    m.put(n, 1);
                }
            }

            boolean isFound = false;
            for (Integer key : m.keySet()) {
                int value = m.get(key);
                if (value > seqLength/2) {
                    System.out.println(key);
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                System.out.println("None");
            }
        }
    }
}
