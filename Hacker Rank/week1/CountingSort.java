package week1;

import java.util.*;

public class CountingSort {
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> frequency = new ArrayList<>(Collections.nCopies(100, 0));
        for (int num : arr) {
            frequency.set(num, frequency.get(num) + 1);
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        List<Integer> result = countingSort(arr);
        for (int count : result) {
            System.out.print(count + " ");
        }
        sc.close();
    }
}

