// https://codeforces.com/problemset/problem/112/A

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String string1 = scanner.nextLine().toLowerCase();
        String string2 = scanner.nextLine().toLowerCase();
        
        if (string1.compareTo(string2) < 0) {
            System.out.println(-1);
        } else if (string1.compareTo(string2) > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}
