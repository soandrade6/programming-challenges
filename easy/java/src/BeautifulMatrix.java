//https://codeforces.com/problemset/problem/263/A
import java.util.Scanner;

public class Main {
    public static int minMovesToBeautiful(int[][] matrix) {
        int moves = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 1) {
                    moves += Math.abs(i - 2) + Math.abs(j - 2); // Calculate Manhattan distance to center
                }
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println(minMovesToBeautiful(matrix));
    }
}
