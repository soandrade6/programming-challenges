//https://codeforces.com/problemset/problem/118/A

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String givenString = scanner.nextLine().toLowerCase();
        char[] vowels = {'a', 'o', 'y', 'e', 'u', 'i'};
        
        StringBuilder result = new StringBuilder();
        for (char c : givenString.toCharArray()) {
            boolean isVowel = false;
            for (char vowel : vowels) {
                if (c == vowel) {
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel) {
                result.append(".").append(c);
            }
        }
        
        System.out.println(result.toString());
        scanner.close();
    }
}
