import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int computer = rand.nextInt(1000) % 3;

        System.out.println("Enter rock (0), paper (1), scissor (2)");
        int user = input.nextInt();

        String compChoice = (computer == 0) ? "rock" : (computer == 1) ? "paper" : "scissor";
        String userChoice = (user == 0) ? "rock" : (user == 1) ? "paper" : "scissor";

        System.out.print("The computer is " + compChoice + ". You are " + userChoice + ". ");

        if (computer == user) {
            System.out.println("It is a draw.");
        }
        if (computer == 0 && user == 2) {
            System.out.println("You Lose.");
        }
        if (computer == 0 && user == 1) {
            System.out.println("You Win.");
        }
        if (computer == 1 && user == 0) {
            System.out.println("You Lose.");
        }
        if (computer == 1 && user == 2) {
            System.out.println("You Win.");
        }
        if (computer == 2 && user == 0) {
            System.out.println("You Win.");
        }
        if (computer == 2 && user == 1) {
            System.out.println("You Lose.");
        }

        input.close();
    }
}
