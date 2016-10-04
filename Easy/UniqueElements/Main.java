import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.trim().split(",");
            Set<Integer> hash = new HashSet<Integer>();

            for (int i = 0; i < arr.length; i++) {
                hash.add(Integer.parseInt(arr[i].trim()));
            }

            List<Integer> l = new ArrayList<Integer>(hash);

            Collections.sort(l);
            for (int i = 0; i < l.size(); i++) {
                System.out.print(l.get(i));
                if (i < l.size() - 1)
                    System.out.print(",");
            }
            System.out.println("");
        }
    }
}
