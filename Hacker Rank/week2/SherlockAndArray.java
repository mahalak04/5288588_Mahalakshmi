package week2;

import java.util.*;

public class SherlockAndArray{
    public static String balancedSums(List<Integer> arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int num : arr) {
            int rightSum = totalSum - leftSum - num;
            if (leftSum == rightSum) {
                return "YES";
            }
            leftSum += num;
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            System.out.println(balancedSums(arr));
        }
        sc.close();
    }
}

