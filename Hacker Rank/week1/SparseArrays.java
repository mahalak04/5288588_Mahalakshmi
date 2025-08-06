package week1;
import java.util.*;
public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new ArrayList<>();

        for (String query : queries) {
            int count = 0;
            for (String str : strings) {
                if (str.equals(query)) {
                    count++;
                }
            }
            result.add(count);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stringsCount = Integer.parseInt(scanner.nextLine());
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < stringsCount; i++) {
            strings.add(scanner.nextLine());
        }

        int queriesCount = Integer.parseInt(scanner.nextLine());
        List<String> queries = new ArrayList<>();
        for (int i = 0; i < queriesCount; i++) {
            queries.add(scanner.nextLine());
        }

        List<Integer> result = matchingStrings(strings, queries);

        for (int count : result) {
            System.out.println(count);
        }

        scanner.close();
    }
}


