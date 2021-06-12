package BasicSyntax.MoreExercise;

import java.util.Scanner;

public class P03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();
        double moneySpent = 0;
        double remaining = money;
        while (money!=0) {

            if (game.equals("OutFall 4")) {
                if (money>=39.99) {
                    money -= 39.99;
                    moneySpent += 39.99;
                    System.out.println("Bought OutFall 4");
                }else if (money<39.99) {
                    System.out.println("Too Expensive");
                }
            }else if (game.equals("CS: OG")) {
                if (money>=15.99) {
                    money -= 15.99;
                    moneySpent += 15.99;
                    System.out.println("Bought CS: OG");
                }else if (money<15.99) {
                    System.out.println("Too Expensive");
                }
            }else if (game.equals("Zplinter Zell")) {
                if (money>=19.99) {
                    money -= 19.99;
                    moneySpent += 19.99;
                    System.out.println("Bought Zplinter Zell");
                }else if (money<19.99) {
                    System.out.println("Too Expensive");
                }
            }else if (game.equals("Honored 2")) {
                if (money>=59.99) {
                    money -= 59.99;
                    moneySpent += 59.99;
                    System.out.println("Bought Honored 2");
                }else if (money<59.99) {
                    System.out.println("Too Expensive");
                }
            }else if (game.equals("RoverWatch")) {
                if (money>=29.99) {
                    money -= 29.99;
                    moneySpent += 29.99;
                    System.out.println("Bought RoverWatch");
                }else if (money<29.99) {
                    System.out.println("Too Expensive");
                }
            }else if (game.equals("RoverWatch Origins Edition")) {
                if (money>=39.99) {
                    money -= 39.99;
                    moneySpent += 39.99;
                    System.out.println("Bought RoverWatch Origins Edition");
                }else if (money<39.99) {
                    System.out.println("Too Expensive");
                }
            }
            else if (game.equals("Game Time")) {
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f", moneySpent, remaining-moneySpent);
                break;
            }
            else {
                System.out.println("Not Found");
            }
            if (money == 0) {
                System.out.println("Out of money!");
                break;
            }
            game = scanner.nextLine();
        }
    }
}
