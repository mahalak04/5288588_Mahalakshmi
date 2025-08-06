package week1;

import java.util.*;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += arr.get(i).get(i);
            secondaryDiagonalSum += arr.get(i).get(n - i - 1);
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(scanner.nextInt());
            }
            arr.add(row);
        }

        int result = diagonalDifference(arr);
        System.out.println(result);

        scanner.close();
    }
}

