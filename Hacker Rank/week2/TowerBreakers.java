package week2;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class TowerBreakers{
    public static int towerBreakers(int n, int m) {
        if (m == 1 || n % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(i -> {
            try {
                String[] input = bufferedReader.readLine().trim().split(" ");
                int n = Integer.parseInt(input[0]);
                int m = Integer.parseInt(input[1]);
                System.out.println(towerBreakers(n, m));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        bufferedReader.close();
    }
}
