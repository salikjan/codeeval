import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            Map<Integer, String> m = new HashMap<Integer, String>();

            String[] tmp = sc.nextLine().trim().split(";");

            for (int i = 0; i < tmp.length; i++) {
                String[] both = tmp[i].trim().split(",");
                int key = Integer.parseInt(both[1]);
                String value = both[0];
                m.put(key, value);
            }

            int point = 0;
            int idx = 0;
            int distance = 0;
            SortedSet<Integer> keys = new TreeSet<Integer>(m.keySet());
            for (Integer key : keys) {
                String city = m.get(key);
                distance = key - point;
                point = key;
                System.out.print(distance);
                if (idx < (keys.size() - 1))
                    System.out.print(",");
                idx++;
            }
            System.out.println("");
        }
    }
}
