package BasicSyntax.Exercise;

import java.util.Scanner;

public class P04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = Integer.parseInt(scanner.nextLine());
        int num;
        int to = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (from <= to) {
            System.out.printf("%d ", from);
            num = from;
            from++;
            sum+=num;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
