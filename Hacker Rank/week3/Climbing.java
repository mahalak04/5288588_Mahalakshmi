package week3;

import java.util.*;

public class Climbing {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        
        List<Integer> uniqueRanked = new ArrayList<>();
        int prev = -1;
        for (int score : ranked) {
            if (score != prev) {
                uniqueRanked.add(score);
                prev = score;
            }
        }

        List<Integer> result = new ArrayList<>();
        int index = uniqueRanked.size() - 1; 
        for (int p : player) {
            while (index >= 0 && p >= uniqueRanked.get(index)) {
                index--;
            }
            result.add(index + 2); 
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rankedCount = sc.nextInt();
        List<Integer> ranked = new ArrayList<>();
        for (int i = 0; i < rankedCount; i++) {
            ranked.add(sc.nextInt());
        }

        int playerCount = sc.nextInt();
        List<Integer> player = new ArrayList<>();
        for (int i = 0; i < playerCount; i++) {
            player.add(sc.nextInt());
        }

        List<Integer> result = climbingLeaderboard(ranked, player);
        for (int r : result) {
            System.out.println(r);
        }

        sc.close();
    }
}

