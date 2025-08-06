package week1;

import java.util.*;

public class Flippingbits {
    public static long flippingBits(long n) {
        return 4294967295L - n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            long n = scanner.nextLong();
            System.out.println(flippingBits(n));
        }
        scanner.close();
    }
}
