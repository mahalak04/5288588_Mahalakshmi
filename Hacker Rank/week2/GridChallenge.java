package week2;
import java.io.*;
import java.util.*;

public class GridChallenge{
    public static String gridChallenge(List<String> grid) {
        // Sort each row alphabetically
        for (int i = 0; i < grid.size(); i++) {
            char[] row = grid.get(i).toCharArray();
            Arrays.sort(row);
            grid.set(i, new String(row));
        }

        // Check if columns are sorted
        int n = grid.size();
        for (int col = 0; col < grid.get(0).length(); col++) {
            for (int row = 0; row < n - 1; row++) {
                if (grid.get(row).charAt(col) > grid.get(row + 1).charAt(col)) {
                    return "NO";
                }
            }
        }
        return "YES";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int test = 0; test < t; test++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            List<String> grid = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                grid.add(bufferedReader.readLine().trim());
            }
            System.out.println(gridChallenge(grid));
        }
        bufferedReader.close();
    }
}
