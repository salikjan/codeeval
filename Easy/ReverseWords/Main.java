import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String[] strarr = line.split(" ");
            for (int i = 0; i < strarr.length; i++) {
                System.out.print(strarr[strarr.length - i - 1]);
                if (i < strarr.length - 1)
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
