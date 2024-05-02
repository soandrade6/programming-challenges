//https://codeforces.com/problemset/problem/282/A

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        StringBuilder statements = new StringBuilder();
        for (int i = 0; i < n; i++) {
            statements.append(sc.nextLine()).append("\n");

        }

        int cont = countOccurrences(statements.toString(), "++") - countOccurrences(statements.toString(), "--");
        System.out.println(cont);
    }

    public static int countOccurrences(String haystack, String needle) {
        int count = 0;
        int lastIndex = 0;
        while ((lastIndex = haystack.indexOf(needle, lastIndex)) != -1) {
            count++;
            lastIndex += needle.length();
        }
        return count;
    }
}
