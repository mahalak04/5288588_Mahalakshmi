package week2;

import java.io.*;

public class RecursiveDigit {

    public static int superDigit(String n, int k) {
        long initialSum = 0;
        for (char c : n.toCharArray()) {
            initialSum += c - '0';
        }
        initialSum *= k;
        return findSuperDigit(initialSum);
    }

    private static int findSuperDigit(long num) {
        if (num < 10) return (int) num;
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return findSuperDigit(sum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String n = input[0];
        int k = Integer.parseInt(input[1]);

        int result = superDigit(n, k);
        System.out.println(result);
    }
}
