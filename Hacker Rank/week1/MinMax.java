package week1;

import java.util.*;
class MinMax {
    public static void miniMaxSum(List<Integer> arr) {
        long total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            total += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        long minSum = total - max;
        long maxSum = total - min;

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(scanner.nextInt());
        }

        miniMaxSum(arr);
        scanner.close();
    }
}
