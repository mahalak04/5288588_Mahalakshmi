package week2;

import java.io.*;

public class CaserCipher {
    public static String caesarCipher(String s, int k) {
        StringBuilder result = new StringBuilder();
        k = k % 26;

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                char newChar = (char) ((ch - 'a' + k) % 26 + 'a');
                result.append(newChar);
            } else if (Character.isUpperCase(ch)) {
                char newChar = (char) ((ch - 'A' + k) % 26 + 'A');
                result.append(newChar);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String s = bufferedReader.readLine();
        int k = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println(caesarCipher(s, k));

        bufferedReader.close();
    }
}
