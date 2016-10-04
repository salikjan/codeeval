import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            char[] characters = line.trim().replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
            int beauty = 0;
            int beautyValue = 26;
            Set<Character> uniqueCharacters = new HashSet<Character>();
            List<Integer> appearanceCount =  new ArrayList<Integer>();

            for (char ch : characters)
                uniqueCharacters.add(ch);

            for (char ch: uniqueCharacters) {
                int count = 0;
                for (char c : characters) {
                    if (ch == c)
                        count++;
                }
                appearanceCount.add(count);
            }

            Collections.sort(appearanceCount, Collections.reverseOrder());

            for (int i : appearanceCount) {
                beauty += i * beautyValue--;
            }

            System.out.println(beauty);
        }
    }
}
