import java.io.*;

public class Main {

    public static int getSeconds(String s) {
        String line = s.trim();
        int seconds = Integer.parseInt(s.substring(6, 8));
        return seconds;
    }

    public static int getMinutes(String s) {
        String line = s.trim();
        int seconds = Integer.parseInt(s.substring(3, 5)) * 60;
        return seconds;
    }

    public static int getHours(String s) {
        String line = s.trim();
        int seconds = Integer.parseInt(s.substring(0, 2)) * 3600;
        return seconds;
    }

    public static void main(String[] args) throws IOException {
	    // write your code here
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] str_arr = line.trim().split(" ");
            int d1 = getHours(str_arr[0]) + getMinutes(str_arr[0]) + getSeconds(str_arr[0]);
            int d2 = getHours(str_arr[1]) + getMinutes(str_arr[1]) + getSeconds(str_arr[1]);

            int diff = Math.abs(d2 - d1);

            int n = diff / 3600;
            String hours = Integer.toString(n);
            if (n < 10)
                hours = "0" + hours;
            n = (diff % 3600) / 60;
            String minutes = Integer.toString(n);
            if (n < 10)
                minutes = "0" + minutes;
            n = (diff % 3600) % 60;
            String seconds = Integer.toString(n);
            if (n < 10)
                seconds = "0" + seconds;

            String s = hours + ":" + minutes + ":" + seconds;
            System.out.println(s);
        }
    }
}
