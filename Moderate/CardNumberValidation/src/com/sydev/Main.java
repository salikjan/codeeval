package com.sydev;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            if (isValidCard(sc.nextLine())) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static boolean isValidCard(String cardNumber) {
        cardNumber = cardNumber.replaceAll("\\D+", "");
        char[] digits = cardNumber.toCharArray();
        //
        int end = digits.length;
        int sum = 0;
        for (int i = 0; i < end; i++) {
            int n = Character.getNumericValue(digits[end - i - 1]);
            if (i % 2 != 0) {
                n *= 2;
                if (n >= 10) {
                    n = n % 10 + 1;
                }
            }
            sum += n;
        }

        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
