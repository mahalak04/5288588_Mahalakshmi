package week2;

import java.io.*;
import java.util.*;

public class MaxMin {
    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);
        int minUnfairness = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.size() - k; i++) {
            int unfairness = arr.get(i + k - 1) - arr.get(i);
            minUnfairness = Math.min(minUnfairness, unfairness);
        }

        return minUnfairness;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int k = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }

        System.out.println(maxMin(k, arr));

        bufferedReader.close();
    }
}
