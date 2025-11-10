package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - CGD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                Cli.startGame();
                break;
            case 2:
                Cli.startGame();
                Engine.startGame(Even.generateQA(), "Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case 3:
                Cli.startGame();
                Engine.startGame(Calculator.generateQA(), "What is the result of the expression?");
                break;
            case 4:
                Cli.startGame();
                Engine.startGame(GCD.generateQA(), "Find the greatest common divisor of given numbers.");
                break;
            case 5:
                Cli.startGame();
                Engine.startGame(Progression.generateQA(), "What number is missing in the progression?");
                break;
            case 6:
                Cli.startGame();
                Engine.startGame(Prime.generateQA(), "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                break;
            default:
                break;
        }
    }
}
