package com.sydev;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            int n = Integer.parseInt(line);

            if (isArmostrongNumber(Integer.parseInt(line))){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }

    public static boolean isArmostrongNumber(int number) {
        int digitsAmount = countDigits(number);
        int sum = 0;
        int tempN = number;

        while (tempN > 0) {
            int digit = tempN % 10;
            sum += (int)Math.pow(digit, digitsAmount);
            tempN = tempN / 10;
        }

        return sum == number;
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
