import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] str_arr = line.trim().split(",");

            List<Integer> steps = new ArrayList<Integer>();
            for (String s : str_arr) {
                int posY = s.indexOf('Y');;
                int posX = s.lastIndexOf('X');
                steps.add(posY - posX - 1);
            }

            Collections.sort(steps);

            System.out.println(steps.get(0));
        }

    }
}
