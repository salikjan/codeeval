package com.sydevelopment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (!"".equals(line)) {
                System.out.println(findWays(line));
            }
        }
    }

    public static int findWays(String line) {
        int counter = 0;

        String s1, s2, s3;

        if (line.length() > 1) {
            s1 = line.substring(0, 1);
            s2 = line.substring(1, line.length());
            s3 = s1 + s2.substring(0, 1);
        } else {
            return 1;
        }

        if (s2.length() > 2) {
            counter++;
            counter += findWays(s2);
        }

        if (s2.length() == 2) {
            counter += findWays(s2);
        } else if (s2.length() < 2) {
            counter++;
        }

        if (Integer.parseInt(s3) <= 26) {
            counter++;
        }

        return counter;
    }

}
