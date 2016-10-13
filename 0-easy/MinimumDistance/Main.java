import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().trim().split(" ");
            int[] houses = new int[input.length];

            for (int i = 0; i < input.length; i++) {
                houses[i] = Integer.parseInt(input[i]);
            }

            int minHouse = Integer.MAX_VALUE, maxHouse = Integer.MIN_VALUE;

            for (int i = 1; i < houses.length; i++) {
                if (houses[i] < minHouse) {
                    minHouse = houses[i];
                }
            }

            for (int i = 1; i < houses.length; i++) {
                if (houses[i] > maxHouse) {
                    maxHouse = houses[i];
                }
            }

            int sum;
            List<Integer> l = new ArrayList<Integer>();

            for (int i = minHouse + 1; i < maxHouse; i++) {
                sum = 0;
                for (int j = 1; j <= houses[0]; j++) {
                    sum += Math.abs(houses[j] - i);
                }
                l.add(sum);
            }

            Collections.sort(l);
            System.out.println(l.get(0));
        }
    }
}
