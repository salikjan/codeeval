package com.sydev;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Scanner sc = new Scanner(new File(args[0]));

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            String[] both = line.split("\\|");
            String[] str_arr = both[0].trim().split(" ");

            int numberOfIterations = Integer.parseInt(both[1].trim());
            int[] numbers = new int[str_arr.length];

            for (int i = 0; i < str_arr.length; i++) {
                numbers[i] = Integer.parseInt(str_arr[i]);
            }

            int index = 0;
            while (index < numbers.length - 1  && numberOfIterations != 0) {
                if (numbers[index + 1] < numbers[index]) {
                    int tmp = numbers[index + 1];
                    numbers[index + 1] = numbers[index];
                    numbers[index] = tmp;
                    index = 0;
                    numberOfIterations--;
                } else {
                    index++;
                }
            }

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]);
                if (i < numbers.length - 1)
                    System.out.print(" ");
            }

            System.out.println("");
        }
    }
}
