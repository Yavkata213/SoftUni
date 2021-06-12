package BasicSyntax.Exercise;

import java.util.Scanner;

public class P06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int m = num;
        int sumFact = 0;
        while (num!=0)
        {
            int lastDig = num % 10;
            int fact = 1;
            for (int i = 1; i <= lastDig ; i++) {
                fact = fact * i;
            }
            sumFact += fact;
            num = num / 10;
        }
        if (m == sumFact) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
