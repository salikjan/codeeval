import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            int[] coords = new int[4];
            Matcher m = Pattern.compile("-?\\d+").matcher(line.trim());
            int idx = 0;
            while (m.find()) {
                coords[idx++] = Integer.parseInt(m.group());
            }

            int distance = (int)(Math.sqrt(Math.pow((coords[2] - coords[0]), 2) +
                    Math.pow((coords[3] - coords[1]), 2)));
            System.out.println(distance);
        }
    }
}
