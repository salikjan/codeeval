import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        // write your code here
        Scanner sc = new Scanner(new File(args[0]));
        while (sc.hasNextLine()) {
            String[] tmp = sc.nextLine().trim().split("; ");
            SimpleDateFormat sdf = new SimpleDateFormat("MMM yyyy", Locale.US);
            List<Date[]> ranges = new LinkedList<Date[]>();

            for (int i = 0; i < tmp.length; i++) {
                String[] str_arr = tmp[i].trim().split("-");
                Date d1 = sdf.parse(str_arr[0]);
                Date d2 = lastDayOfMonth(sdf.parse(str_arr[1]));
                Date[] date_arr = new Date[2];
                date_arr[0] = d1; date_arr[1] = d2;
                ranges.add(date_arr);
            }

            Collections.sort(ranges, new Comparator<Date[]>() {
                @Override
                public int compare(Date[] o1, Date[] o2) {
                    if (Arrays.equals(o1, o2))
                        return 0;
                    else if (o2[0].before(o1[0])) {
                        return 1;
                    }
                    return -1;
                }
            });

            List<Date[]> result = new LinkedList<Date[]>();
            Iterator<Date[]> iter = ranges.iterator();
            Date[] interval = iter.next();
            Date startDate = interval[0];
            Date endDate = interval[1];

            while (iter.hasNext()) {
                interval = iter.next();
                if (endDate.before(interval[0])) {
                    Date[] arr = new Date[2];
                    arr[0] = startDate; arr[1] = endDate;
                    result.add(arr);
                    startDate = interval[0];
                    endDate = interval[1];
                } else if (endDate.before(interval[1])) {
                    endDate = interval[1];
                }
            }

            Date[] tmp_date = new Date[2];
            tmp_date[0] = startDate;
            tmp_date[1] = endDate;
            result.add(tmp_date);

            int diff = 0;

            for (int i = 0; i < result.size(); i++) {
                Date[] dates =  result.get(i);
                diff += differenceInMonths(dates[0], dates[1]);
            }

            System.out.println(diff / 12);
        }
    }

    public static Date lastDayOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MONTH, date.getMonth());
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        return calendar.getTime();
    }

    public static int differenceInMonths(Date d1, Date d2) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        cal1.setTime(d1);
        cal2.setTime(d2);

        int diff = 1;

        while (cal2.after(cal1)) {
            cal1.add(Calendar.MONTH, 1);
            if (cal2.after(cal1)) {
                diff++;
            }
        }

        return diff;
    }
}

