import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUsername = "Ahmad Ali";
        String correctPassword = "12345";

        System.out.print("Please enter your username: ");
        String username = input.nextLine();

        System.out.print("Please enter the password: ");
        String password = input.nextLine();

        if (!username.equals(correctUsername)) {
            System.out.println("Error: Invalid Username.");
        } else {
            if (!password.equals(correctPassword)) {
                System.out.println("Error: Password does not match.");
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String timeNow = sdf.format(new Date());

                System.out.println("Welcome " + username + ". The time now is " + timeNow);
            }
        }

        input.close();
    }
}
