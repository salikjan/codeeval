import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        File file = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            ArrayList<String> winners = new ArrayList<String>();
            String[] str_arr = line.trim().split("\\|");
            String[] names = str_arr[0].trim().split(" ");
            int number = Integer.parseInt(str_arr[1].trim());

            for (int i = 0; i < names.length; i++) {
                winners.add(names[i].trim());
            }

            while (winners.size() > 1) {
                if (number <= winners.size()) {
                    winners.remove(number - 1);
                } else {
                    int idx = number % winners.size();
                    if (idx == 0)
                        winners.remove(winners.size() - 1);
                    else
                        winners.remove(idx - 1);
                }
            }

            System.out.println(winners.get(0));
        }
    }
}
