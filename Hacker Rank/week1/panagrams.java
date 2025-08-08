package week1;

import java.util.*;

public class panagrams {
    public static String pangrams(String s) {
        s = s.toLowerCase();
        Set<Character> letters = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }
        return letters.size() == 26 ? "pangram" : "not pangram";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(pangrams(input));
        sc.close();
    }
}
