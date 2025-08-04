package week1;

import java.util.*;

public class TimeConversion {
    public static String timeConversion(String s) {
        String ampm = s.substring(s.length() - 2);
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8); // ":mm:ss"

        if (ampm.equals("AM") && hour == 12) {
            hour = 0;
        } else if (ampm.equals("PM") && hour != 12) {
            hour += 12;
        }

        return String.format("%02d%s", hour, rest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputTime = scanner.nextLine();
        String result = timeConversion(inputTime);
        System.out.println(result);
        scanner.close();
    }
}
