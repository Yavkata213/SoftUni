package BasicSyntax.Lab;

import java.util.Scanner;

public class P11_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int mult = Integer.parseInt(scanner.nextLine());

        do {
            if (mult>10)
            {
                System.out.println(number +" X "+mult+" = "+number*mult);
                break;
            }
            System.out.println(number +" X "+mult+" = "+number*mult);
            mult++;
        }while (mult<=10);
    }
}
