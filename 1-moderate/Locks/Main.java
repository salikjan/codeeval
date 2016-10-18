import java.io.File;
import java.util.Scanner;

public class Main {
    private static Door[] doors;

    public static void main(String[] args) throws Throwable {
	// write your code here
        solveChallenge(args);
    }

    public static void solveChallenge(String... args) throws Throwable {
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            System.out.println(getUnlockedDoors(sc.nextLine()));
        }
    }

    public static int getUnlockedDoors(String line) {
        String[] buffer = line.trim().split(" ");
        int iterations = Integer.parseInt(buffer[1]) - 1;
        int doorsNumber = Integer.parseInt(buffer[0]);

        doors = new Door[doorsNumber];
        for (int i = 0; i < doors.length; i++) {
            doors[i] = new Door();
        }

        while (iterations-- > 0){
            makeIteration();
        }

        doors[doorsNumber - 1].reverse();

        return countUnlockedDoors();

    }

    public static void makeIteration() {
        //
        for (int i = 1; i < doors.length; i++) {
            int pos = i + 1;
            if (pos % 2 == 0) {
                doors[i].close();
            }

            if (pos % 3 == 0) {
                doors[i].reverse();
            }
        }
    }

    public static int countUnlockedDoors() {
        int amount = 0;
        //
        for (int i = 0; i < doors.length; i++) {
            if (doors[i].getState() == Door.State.OPEN) {
                amount++;
            }
        }
        return amount;
    }

}

class Door {
    enum State {
        OPEN,
        CLOSED
    };

    private State state;

    public Door() {
        this.state = State.OPEN;
    }

    public State getState() {
        return this.state;
    }

    public void open() {
        this.state = State.OPEN;
    }

    public void close() {
        this.state = State.CLOSED;
    }

    public void reverse() {
        if (this.state == State.OPEN) {
            this.state = State.CLOSED;
        } else {
            this.state = State.OPEN;
        }
    }
}
