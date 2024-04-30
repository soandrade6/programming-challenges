// https://codeforces.com/problemset/problem/266/A

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nStones = scanner.nextInt();
        String stones = scanner.next();
        
        int cont = 0;
        for (int i = 0; i < nStones - 1; i++) {
            if (stones.charAt(i) == stones.charAt(i + 1)) {
                cont++;
            }
        }
        
        System.out.println(cont);
    }
}
