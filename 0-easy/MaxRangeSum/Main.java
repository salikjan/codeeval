import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] both = sc.nextLine().trim().split(";");
            int N = Integer.parseInt(both[0].trim());
            String[] tmp = both[1].trim().split(" ");
            List<Integer> l = new ArrayList<Integer>();

            int[] moves = new int[tmp.length];
            for (int i = 0; i < tmp.length; i++) {
                moves[i] = Integer.parseInt(tmp[i]);
            }

            for (int i = 0; i < moves.length - N + 1; i++) {
                int sum = 0;
                for (int j = i; j < i + N; j++) {
                    sum += moves[j];
                }
                if (sum > 0) {
                    l.add(sum);
                }
            }

            int max = Integer.MIN_VALUE;
            if (l.size() == 0)
                System.out.println(0);
            else {
                for (int i = 0; i < l.size(); i++) {
                    Integer integer = l.get(i);
                    if (integer > max)
                        max = integer;
                }
                System.out.println(max);
            }

        }
    }
}
