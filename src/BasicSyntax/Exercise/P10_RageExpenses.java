package BasicSyntax.Exercise;

import java.util.Scanner;

public class P10_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsets = lostGames/2;
        int mice = lostGames/3;
        int keyboards = lostGames/6;
        int displays = lostGames/12;

        double expenses = headsets * headsetPrice + mice * mousePrice + keyboards * keyboardPrice + displays * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
