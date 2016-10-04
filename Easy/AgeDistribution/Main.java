import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String s = "";
            int age;
            if (line.charAt(0) == '-')
                age = -1;
            else
                age = Integer.parseInt(line);
            if (age < 0 || age > 100) {
                s = "This program is for humans";
            } else {
                if (age <= 2)
                    s = "Still in Mama's arms";
                else if (age <= 4)
                    s = "Preschool Maniac";
                else if (age <= 11)
                    s = "Elementary school";
                else if (age <= 14)
                    s = "Middle school";
                else if (age <= 18)
                    s = "High school";
                else if (age <= 22)
                    s = "College";
                else if (age <= 65)
                    s = "Working for the man";
                else if (age <= 100)
                    s = "The Golden Years";
            }
            System.out.println(s);
        }
    }
}
