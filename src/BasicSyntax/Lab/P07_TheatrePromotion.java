package BasicSyntax.Lab;

import java.util.Scanner;

public class P07_TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;

        if (day.equals("Weekday")) {
            if (0 <= age && age <= 18)
            {
                price = 12;
            }else if (18 < age && age <= 64)
            {
                price = 18;
            }else if (64 < age && age <= 122)
            {
                price = 12;
            }
        }else if (day.equals("Weekend")) {
            if (0 <= age && age <= 18)
            {
                price = 15;
            }else if (18 < age && age <= 64)
            {
                price = 20;
            }else if (64 < age && age <= 122)
            {
                price = 15;
            }
        }else if (day.equals("Holiday")) {
            if (0 <= age && age <= 18) {
                price = 5;
            } else if (18 < age && age <= 64) {
                price = 12;
            } else if (64 < age && age <= 122) {
                price = 10;
            }
        }
        if (price != 0)
        {
            System.out.println(price+"$");
        }
        if (age <= -1 || age >= 123)
        {
            System.out.println("Error!");
        }
    }
}
