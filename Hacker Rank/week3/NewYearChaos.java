package week3;

import java.util.*;

public class NewYearChaos{
    public static void minimumBribes(List<Integer> q) {
        int bribes = 0;
        for (int i = q.size() - 1; i >= 0; i--) {
            int pos = q.get(i);
            if (pos - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = Math.max(0, pos - 2); j < i; j++) {
                if (q.get(j) > pos) {
                    bribes++;
                }
            }
        }
        System.out.println(bribes);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        for (int a = 0; a < t; a++) {
            int n = sc.nextInt();
            List<Integer> q = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                q.add(sc.nextInt());
            }
            minimumBribes(q);
        }
        sc.close();
    }
}
