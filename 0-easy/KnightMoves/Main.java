import java.io.File;
import java.util.*;

public class Main {
    final static String letters = "abcdefgh";

    public static void main(String[] args) throws Throwable {
        // write your code here
        solveChallenge(args);
    }

    public static void solveChallenge(String[] args) throws Throwable {
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(knightMove(line));
        }
    }

    public static String knightMove(String line) throws Throwable {
        List<String> positions = new LinkedList<String>();

        int posX = letters.indexOf(line.charAt(0));
        int posY = Integer.parseInt(line.substring(1, 2)) - 1;
        String str = "";

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (!"".equals((str = validMove(j, i, posX, posY)))) {
                    positions.add(str);
                }
            }
        }

        String result = "";
        Collections.sort(positions);
        for (int i = 0; i < positions.size(); i++) {
            if (i > 0) {
                result += " ";
            }
            result +=  positions.get(i);
        }
        return result;
    }

    public static String validMove(int X, int Y, int curX, int curY) {
        int row = Math.abs(curX - X);
        int col = Math.abs(curY - Y);

        if ((row == 2 && col == 1) || (row == 1 && col == 2))
            return letters.substring(X, X + 1) + (Y + 1);
        return "";
    }
}
