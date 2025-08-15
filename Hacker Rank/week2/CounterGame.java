package week2;
import java.io.*;
import java.util.stream.IntStream;

public class CounterGame {

    public static String counterGame(long n) {
        boolean louiseTurn = true; // Louise starts

        while (n != 1) {
            if (isPowerOfTwo(n)) {
                n /= 2;
            } else {
                n -= largestPowerOfTwoLessThan(n);
            }
            louiseTurn = !louiseTurn; // switch turn after move
        }

        // Correct winner logic
        return louiseTurn ? "Richard" : "Louise";
    }

    private static boolean isPowerOfTwo(long n) {
        return (n & (n - 1)) == 0;
    }

    private static long largestPowerOfTwoLessThan(long n) {
        return Long.highestOneBit(n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());
                String result = counterGame(n);
                System.out.println(result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
