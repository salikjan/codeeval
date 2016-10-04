import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] tmp = sc.nextLine().trim().split(" ");
            int[] numbers = new int[tmp.length];
            Map<Integer, List<Integer>> m = new HashMap<Integer, List<Integer>>();

            for (int i = 0; i < tmp.length; i++) {
                int key = Integer.parseInt(tmp[i]);
                if (m.containsKey(key))
                    m.get(key).add(i + 1);
                else {
                    m.put(key, new ArrayList<Integer>());
                    m.get(key).add(i + 1);
                }
            }

            Iterator<Map.Entry<Integer, List<Integer>>> it = m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, List<Integer>> entry = it.next();
                if (entry.getValue().size() != 1)
                    it.remove();
            }

            SortedSet<Integer> set = new TreeSet<Integer>(m.keySet());
            if (set.size() == 0)
                System.out.println(0);
            else {
                List<Integer> l = m.get(set.first());
                System.out.println(l.get(0));
            }
        }
    }
}
