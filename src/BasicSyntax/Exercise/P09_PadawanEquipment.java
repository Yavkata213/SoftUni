package BasicSyntax.Exercise;

import java.util.Scanner;

public class P09_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOfLightSaber = Double.parseDouble(scanner.nextLine());
        double priceOfRobe = Double.parseDouble(scanner.nextLine());
        double priceOfBelt = Double.parseDouble(scanner.nextLine());

        double sumLightSabers = Math.ceil(students + students * 0.10) * priceOfLightSaber;
        double sumRobes = students * priceOfRobe;
        double sumBelts = (students - students/6) * priceOfBelt;

        double totalSum = sumLightSabers + sumRobes + sumBelts;

        if (totalSum <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }else {
            double diff = totalSum - money;
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }
    }
}
