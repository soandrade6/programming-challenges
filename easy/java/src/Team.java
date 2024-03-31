import java.util.Scanner;

//https://codeforces.com/problemset/problem/231/A
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String[] problems = sc.nextLine().split(" ");
            int onesCount = 0;

            for (String problem: problems){
                if (problem.equals("1")){
                    onesCount++;
                }
            }

            if (onesCount >= 2){
                count++;
            }

        }

        System.out.println(count);
    }
}
