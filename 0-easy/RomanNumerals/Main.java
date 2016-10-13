import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	// write your code here
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        while ((line = buffer.readLine()) != null) {
            int num = Integer.parseInt(line);
            String roman = "";

            int thousands = num / 1000;
            roman = times(thousands, "M");
            num = num % 1000;

            if (num > 500) {
                int d1 = (num - 500) / 100;
                if (d1 == 4)
                    roman += "CM";
                else
                    roman = roman + "D" + times(d1, "C");
            } else {
                if (num / 100 == 4)
                    roman += "CD";
                else
                    roman += times(num / 100, "C");
            }

            num = num % 100;

            if (num > 50) {
                int d2 = (num - 50) / 10;
                if (d2 == 4)
                    roman += "XC";
                else
                    roman = roman + "L" + times(d2, "X");
            } else {
                if (num / 10 == 4)
                    roman += "XL";
                else
                    roman += times(num / 10, "X");
            }

            num = num % 10;

            if (num == 9)
                roman += "IX";

            if (num == 4)
                roman += "IV";

            if (num < 4)
                roman += times(num, "I");

            if (num > 4 && num < 9)
                roman += "V" + times(num - 5, "I");

            System.out.println(roman);
        }
    }

    public static String times(int num, String str) {
        String s = "";
        for (int i = 0; i < num; i++) {
            s += str;
        }
        return s;
    }
}
