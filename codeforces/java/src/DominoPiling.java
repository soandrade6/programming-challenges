import java.util.Scanner;
//https://codeforces.com/problemset/problem/158/A
public class DominoPiling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mn = sc.nextLine().split(" ");
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);

        System.out.println((m*n)/2);
    }
}
