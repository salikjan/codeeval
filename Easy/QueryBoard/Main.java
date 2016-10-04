import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[][] board = new int[256][256];

    public static void main(String[] args) throws Throwable {
	    // write your code here
        solveChallenge(args);
    }

    public static void solveChallenge(String[] args) throws Throwable {
        for (int[] row: board)
            Arrays.fill(row, 0);

        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().trim().split(" ");
            if (input.length > 2)
                processCommand(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            else
                System.out.println(processQuery(input[0], Integer.parseInt(input[1])));
        }
    }

    public static void processCommand(String command, int rowcol, int value) {
        switch (command) {
            case "SetCol":
                cmdSetCol(rowcol, value);
                break;
            case "SetRow":
                cmdSetRow(rowcol, value);
                break;
        }
    }

    public static int processQuery(String command, int rowcol) {
        int result = -1;
        switch (command) {
            case "QueryRow":
                result = cmdQueryRow(rowcol);
                break;
            case "QueryCol":
                result = cmdQueryCol(rowcol);
                break;
        }
        return result;
    }

    public static void cmdSetCol(int column, int value) {
        for (int i = 0; i < 256; i++) {
            board[i][column] = value;
        }
    }

    public static void cmdSetRow(int row, int value) {
        for (int i = 0; i < 256; i++) {
            board[row][i] = value;
        }
    }

    public static int cmdQueryRow(int row) {
        int sum = 0;
        for (int i = 0; i < 256; i++) {
            sum += board[row][i];
        }
        return sum;
    }

    public static int cmdQueryCol(int column) {
        int sum = 0;
        for (int i = 0; i < 256; i++) {
            sum += board[i][column];
        }
        return sum;
    }
}
