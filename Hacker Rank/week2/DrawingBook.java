package week2;
import java.io.*;

class Result {
    public static int pageCount(int n, int p) {
        int fromFront = p / 2;
        int fromBack = (n / 2) - (p / 2);
        return Math.min(fromFront, fromBack);
    }
}

public class DrawingBook {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int p = Integer.parseInt(bufferedReader.readLine().trim());
        int result = Result.pageCount(n, p);
        System.out.println(result);
        bufferedReader.close();
    }
}
