package BasicSyntax.Exercise;

import java.util.Scanner;

public class P05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password ="";
        for (int i = username.length()-1; i >= 0; i--) {
            password += username.charAt(i);
        }

        String enter= scanner.nextLine();
        int fail = 0;
        while(!enter.equals(password)) {
            System.out.println("Incorrect password. Try again.");
            enter = scanner.nextLine();
            fail++;
            if (fail>=3)
            {
                System.out.printf("User %s blocked!", username);
                break;
            }
        }if (enter.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
