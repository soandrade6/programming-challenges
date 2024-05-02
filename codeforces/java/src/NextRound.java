//https://codeforces.com/problemset/problem/158/A
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nk = sc.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        String[] placeStr = sc.nextLine().split(" ");
        int[] place = new int[n];

        for (int i = 0; i < n; i++) {
            place[i] = Integer.parseInt(placeStr[i]);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (place[i] > 0 && place[i] >= place[k-1]){
                count++;
            }

        }

        System.out.println(count);

    }
}
