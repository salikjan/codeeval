import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] str_arr = line.split("\\|");

            HashMap<String, List<String>> map = new HashMap<String, List<String>>();

            for (int i = 0; i < str_arr.length; i++) {
                String[] teams = str_arr[i].trim().split(" ");
                String country = "" + (i + 1);
                for (int j = 0; j < teams.length; j++) {
                    String team = teams[j].trim();
                    if (!map.containsKey(team))
                        map.put(team, new ArrayList<String>());
                    map.get(team).add(country);
                }
            }

            SortedSet<String> keys = new TreeSet<String>(map.keySet());
            int index = 0;
            for (String key : keys) {
                List<String> list = map.get(key);
                System.out.print(key + ":");
                for (int i = 0; i < list.size(); i++) {
                    String s = list.get(i);
                    System.out.print(s);
                    if (i < list.size() - 1)
                        System.out.print(",");
                    else {
                        if (index++ == keys.size() - 1)
                            System.out.print(";");
                        else
                            System.out.print("; ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
