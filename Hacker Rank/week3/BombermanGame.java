package week3;

import java.io.*;
import java.util.*;

public class BombermanGame {
    public static List<String> bomberMan(int n, List<String> grid) {
        int rows = grid.size();
        int cols = grid.get(0).length();
        if (n == 1) return grid;
        if (n % 2 == 0) {
            List<String> full = new ArrayList<>();
            String row = buildRow(cols);
            for (int i = 0; i < rows; i++) full.add(row);
            return full;
        }
        List<String> firstDetonation = detonate(grid);
        List<String> secondDetonation = detonate(firstDetonation);
        if ((n - 3) % 4 == 0) return firstDetonation;
        else return secondDetonation;
    }

    private static String buildRow(int cols) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cols; i++) sb.append('O');
        return sb.toString();
    }

    private static List<String> detonate(List<String> grid) {
        int rows = grid.size();
        int cols = grid.get(0).length();
        boolean[][] bombs = new boolean[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid.get(r).charAt(c) == 'O') {
                    bombs[r][c] = true;
                    if (r > 0) bombs[r - 1][c] = true;
                    if (r < rows - 1) bombs[r + 1][c] = true;
                    if (c > 0) bombs[r][c - 1] = true;
                    if (c < cols - 1) bombs[r][c + 1] = true;
                }
            }
        }
        List<String> newGrid = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            StringBuilder sb = new StringBuilder();
            for (int c = 0; c < cols; c++) sb.append(bombs[r][c] ? '.' : 'O');
            newGrid.add(sb.toString());
        }
        return newGrid;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        List<String> grid = new ArrayList<>();
        for (int i = 0; i < r; i++) grid.add(sc.nextLine());
        List<String> result = bomberMan(n, grid);
        for (String row : result) System.out.println(row);
        sc.close();
    }
}

