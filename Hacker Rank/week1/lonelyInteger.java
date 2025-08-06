package week1;
import java.util.*;

public class lonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        int result = 0;
        for (int num : a) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int result = lonelyinteger(a);
        System.out.println(result);
        scanner.close();
    }
}

