import java.util.Scanner;
//https://codeforces.com/problemset/problem/281/A
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String capitalizada = word.substring(0,1).toUpperCase() + word.substring(1);
        System.out.println(capitalizada);
    }
}
