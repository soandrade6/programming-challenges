import java.util.Scanner;
//https://codeforces.com/problemset/problem/236/A
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String result = (username.chars().distinct().count() % 2 == 0) ? "CHAT WITH HER!" : "IGNORE HIM!";
        System.out.println(result);
    }
}
