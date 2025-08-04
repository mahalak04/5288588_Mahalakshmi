package week1;

import java.util.*;
public class PlusMin {

    public static void plusMinus(List<Integer> arr) {
        int countPos = 0, countNeg = 0, countZero = 0;
        int total = arr.size();

        for (int num : arr) {
            if (num > 0) countPos++;
            else if (num < 0) countNeg++;
            else countZero++;
        }

        System.out.printf("%.6f\n", (double) countPos / total);
        System.out.printf("%.6f\n", (double) countNeg / total);
        System.out.printf("%.6f\n", (double) countZero / total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();
        
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        plusMinus(numbers);
        scanner.close();
    }
}