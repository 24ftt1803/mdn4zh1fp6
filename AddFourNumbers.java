import java.util.Random;
import java.util.Scanner;

public class AddFourNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int n1 = rand.nextInt(100);
        int n2 = rand.nextInt(100);
        int n3 = rand.nextInt(100);
        int n4 = rand.nextInt(100);

        int correctSum = n1 + n2 + n3 + n4;

        System.out.print("What is " + n1 + " + " + n2 + " + " + n3 + " + " + n4 + "? ");
        int userAnswer = input.nextInt();

        if (userAnswer == correctSum) {
            System.out.println("Well done, you are correct!");
        } else {
            System.out.println("Nice try, the sum should be " + correctSum);
        }

        input.close();
    }
}
