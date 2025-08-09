package week2;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class  SalesByMatch{
    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> colorCount = new HashMap<>();
        for (int color : ar) {
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
        }
        int pairs = 0;
        for (int count : colorCount.values()) {
            pairs += count / 2;
        }
        return pairs;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> ar = Stream.of(bufferedReader.readLine().trim().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}

