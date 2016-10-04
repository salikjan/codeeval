import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        while ((line = buffer.readLine()) != null) {
            String[] str = line.split("\\|");
            ArrayList<Integer[]> table = new ArrayList<Integer[]>();
            int category_count = 0;
            int part_count = str.length;

            for (int i = 0; i < str.length; i++) {

                String[] str_num = str[i].trim().split(" ");

                Integer[] nums = new Integer[str_num.length];
                category_count = str_num.length;
                for (int j = 0; j < str_num.length; j++) {
                    nums[j] = Integer.parseInt(str_num[j]);
                }
                table.add(nums);
            }

            for (int i = 0; i < category_count; i++) {
                int[] scores = new int[part_count];
                for (int j = 0; j < table.size(); j++) {
                    scores[j] = table.get(j)[i];
                }
                int max = Integer.MIN_VALUE;
                for (int j = 0; j < scores.length; j++) {
                    if (scores[j] > max)
                        max = scores[j];
                }
                System.out.print(max);
                if (i < category_count)
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
