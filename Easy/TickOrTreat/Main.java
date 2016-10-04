import java.io.*;

public class Main {

    public static final int VAMPIRE_MULT = 3;
    public static final int ZOMBIE_MULT = 4;
    public static final int WITCH_MULT = 5;

    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String[] strarr = line.split(", ");

            int vampires = (int)Math.floor(Double.parseDouble(strarr[0].split(": ")[1]));
            int zombies = (int)Math.floor(Double.parseDouble(strarr[1].split(": ")[1]));
            int witches = (int)Math.floor(Double.parseDouble(strarr[2].split(": ")[1]));
            int houses = (int)Math.floor(Double.parseDouble(strarr[3].split(": ")[1]));

            int candies_amount = (vampires * VAMPIRE_MULT + zombies * ZOMBIE_MULT +
                    witches * WITCH_MULT) * houses;
            int candies_per_child = (int)Math.floor(candies_amount * 1.0 / (vampires + zombies + witches));

            System.out.println(candies_per_child);
        }
    }
}
