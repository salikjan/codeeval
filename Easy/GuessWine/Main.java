import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        File file = new File(args[0]);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(guessWine(line));
        }
    }

    public static String guessWine(String line) {
        String[] buffer = line.split("\\|");
        String[] wineName = buffer[0].trim().split(" ");
        String letters = buffer[1].trim();
        boolean isFound = false;
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < wineName.length; i++) {
            String name = wineName[i];
            int found = 0;
            //
            for (int j = 0; j < letters.length(); j++) {
                char ch = letters.charAt(j);
                if (name.indexOf(ch) >= 0)
                    found++;
                else
                    break;
            }
            //
            if (found == letters.length()) {
                if (isFound) {
                    result.append(" ");
                }
                result.append(name);
                isFound = true;
            }
        }
        if (isFound)
            return result.toString();

        else
            return "False";
    }
}
