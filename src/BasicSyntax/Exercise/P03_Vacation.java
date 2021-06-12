package BasicSyntax.Exercise;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;
        if (group.equals("Students")) {
            if (dayOfWeek.equals("Friday")) {
                price = people * 8.45;
            }else if (dayOfWeek.equals("Saturday")) {
                price = people * 9.80;
            }else if (dayOfWeek.equals("Sunday")) {
                price = people * 10.46;
            }if (people >= 30) {
                price = price * 0.85;
            }
            System.out.printf("Total price: %.2f", price);
        }else if (group.equals("Business")) {
            if (people >= 100) {
                people = people - 10;
            }
            if (dayOfWeek.equals("Friday")) {
                price = people * 10.90;
            }else if (dayOfWeek.equals("Saturday")) {
                price = people * 15.60;
            }else if (dayOfWeek.equals("Sunday")) {
                price = people * 16;
            }
            System.out.printf("Total price: %.2f", price);
        }else if (group.equals("Regular")) {
            if (dayOfWeek.equals("Friday")) {
                price = people * 15;
            }else if (dayOfWeek.equals("Saturday")) {
                price = people * 20;
            }else if (dayOfWeek.equals("Sunday")) {
                price = people * 22.50;
            }if (people >= 10 && people <= 20) {
                price = price * 0.95;
            }
            System.out.printf("Total price: %.2f", price);
        }
    }
}
