package BasicSyntax.MoreExercise;

import java.util.Scanner;

public class P01_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());
        int t = Integer.parseInt(scanner.nextLine());
        double max1 = Math.max(f,s);
        double max2 = Math.max(s,t);
        double max = Math.max(max1,max2);
        double min1 = Math.min(f,s);
        double min2 = Math.min(s,t);
        double min = Math.min(min1,min2);
        System.out.printf("%.0f", max);
        System.out.println();
        if ((f < s && s < t) || (t < s && s < f))
            System.out.println(s);

            // Checking for a
        else if ((s < f && f < t) || (t < f && f < s))
            System.out.println(f);

        else
            System.out.println(t);
        System.out.printf("%.0f", min);
    }
}
