import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            char[] word = line.trim().toCharArray();
            int upperCaseAmount = 0;
            int lowerCaseAmount = 0;

            for (int i = 0; i < word.length; i++) {
                if (Character.isLowerCase(word[i]))
                    lowerCaseAmount++;
                else
                    if (Character.isUpperCase(word[i]))
                        upperCaseAmount++;
            }

            System.out.printf("lowercase: %.2f uppercase: %.2f",
                    lowerCaseAmount * 100.0 / word.length,
                    upperCaseAmount * 100.0 / word.length
                    );
            System.out.println("");
        }
    }
}
