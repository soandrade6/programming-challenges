// https://codeforces.com/problemset/problem/71/A
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            System.out.println(word.length() <= 10 ? word : word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1));
        }
    }
}
