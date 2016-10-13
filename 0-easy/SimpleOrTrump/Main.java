import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String ranks = "23456789TJQKA";
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNext()) {
            String[] input = sc.nextLine().trim().split("\\|");
            char trump = input[1].trim().charAt(0);
            String[] cards = input[0].trim().split(" ");
            int rank1, rank2, pos = 1;
            char suit1, suit2;

            char ch = cards[0].charAt(0);
            if (ch == '1') {
                ch = 'T';
                pos = 2;
            } else
                pos = 1;

            rank1 = ranks.indexOf(ch);
            suit1 = cards[0].charAt(pos);

            ch = cards[1].charAt(0);
            if (ch == '1') {
                ch = 'T';
                pos = 2;
            } else
                pos = 1;

            rank2 = ranks.indexOf(ch);
            suit2 = cards[1].charAt(pos);

            if (suit1 == trump || suit2 == trump) {
                if (suit1 == suit2) {
                    if (rank1 == rank2) {
                        System.out.println(cards[0] + " " + cards[1]);
                    } else if (rank1 > rank2) {
                        System.out.println(cards[0]);
                    } else {
                        System.out.println(cards[1]);
                    }
                } else if (suit1 == trump) {
                    System.out.println(cards[0]);
                } else {
                    System.out.println(cards[1]);
                }
            } else {
                if (rank1 == rank2) {
                    System.out.println(cards[0] + " " + cards[1]);
                } else if (rank1 > rank2) {
                    System.out.println(cards[0]);
                } else {
                    System.out.println(cards[1]);
                }
            }
        }
    }
}
