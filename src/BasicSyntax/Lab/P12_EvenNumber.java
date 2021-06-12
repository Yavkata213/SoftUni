package BasicSyntax.Lab;

import java.util.Scanner;

public class P12_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = Integer.parseInt(scanner.nextLine());
            if (n<0){
                n=n*-1;
            }
            if (n>0 && n%2==1) {
                System.out.println("Please write an even number.");
            }
        }while(n%2==1);
        if (n>0 && n%2==0) {
            System.out.println("The number is: "+n);
        }
    }
}
