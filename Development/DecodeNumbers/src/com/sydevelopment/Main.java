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
            int counter = 1;
            if (line.charAt(0) == '-') {
                continue;
            }

            for (int i = 0; i < line.length() - 1; i++) {
                String s = line.substring(i, i + 1) +
                        line.substring(i + 1, i + 2);
                if (Integer.parseInt(s) <= 26) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
