package com.sydev;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));

        while (sc.hasNextLine()) {
            char[] characters = sc.nextLine().trim().toCharArray();

            for (int i = 0; i < characters.length; i++) {
                char ch = characters[i];
                if (Character.isLowerCase(ch))
                    characters[i] = Character.toUpperCase(ch);
                if (Character.isUpperCase(ch))
                    characters[i] = Character.toLowerCase(ch);
            }

            String s = new String(characters);

            System.out.println(s);
        }

    }
}
