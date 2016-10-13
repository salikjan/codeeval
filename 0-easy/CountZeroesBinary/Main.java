import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            line = line.trim();
            String[] s = line.split(" ");
            int zeroesCount = Integer.parseInt(s[0].trim());
            int maxNum = Integer.parseInt(s[1].trim());
            int count = 0;

            for (int i = 1; i <= maxNum; i++) {
                int found = 0;
                int d = i;
                while (d > 0) {
                    if (d % 2 == 0)
                        found++;
                    d = d / 2;
                }
                if (found == zeroesCount)
                    count++;
            }

            System.out.println(count);
        }

    }
}
