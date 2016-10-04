import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(new File(args[0]));
        List<String> track = new LinkedList<String>();

        while (sc.hasNextLine()) {
            track.add(sc.nextLine().trim());
        }

        String result;
        for (int i = 0; i < track.size(); i++) {
            result = "";
            char pathSymbol = '|';
            String curLine = track.get(i);

            if (i == 0) {
                result = changeAtPos(curLine, findGate(curLine), '|');
                System.out.println(result);
                continue;
            }

            String prevLine = track.get(i - 1);

            int curPos = findGate(curLine);
            int prevPos = findGate(prevLine);

            if (curPos == prevPos) {
                pathSymbol = '|';
            }
            else if (curPos - prevPos == 1) {
                pathSymbol = '\\';
            }
            else {
                pathSymbol = '/';
            }

            result = changeAtPos(curLine, findGate(curLine), pathSymbol);

            System.out.println(result);
        }

    }

    public static int findGate(String line) {
        int pos = line.indexOf('C');
        if (pos == -1) {
            pos = line.indexOf('_');
            if (pos == -1)
                return -1;
            else
                return pos;

        }
        return pos;
    }

    public static String changeAtPos(String s, int pos, char symbol) {
        String result = s.substring(0, pos) + symbol + s.substring(pos + 1, s.length());
        return result;
    }
}
