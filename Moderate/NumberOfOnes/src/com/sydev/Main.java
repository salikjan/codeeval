package com.sydev;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            int n = Integer.parseInt(sc.nextLine());
            System.out.println(Integer.bitCount(n));
        }
    }
}
