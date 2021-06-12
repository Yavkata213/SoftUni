package BasicSyntax.Lab;

import java.util.Scanner;

public class P09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int odd = i*2-1;
            System.out.println(odd);
            sum+=odd;
        }
        System.out.println("Sum: "+sum);
    }
}
