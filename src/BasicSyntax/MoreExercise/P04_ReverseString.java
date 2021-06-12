package BasicSyntax.MoreExercise;

import java.util.Scanner;

public class P04_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String reverse = "";
        for (int i = string.length()-1; i >= 0 ; i--) {
            reverse += string.charAt(i);
        }
        System.out.println(reverse);
    }
}
