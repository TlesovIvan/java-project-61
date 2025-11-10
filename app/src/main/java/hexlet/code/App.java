package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    private static final int CLI = 1;
    private static final int EVEN = 2;
    private static final int CALCULATOR = 3;
    private static final int CGD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
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
            case CLI:
                Cli.startGame();
                break;
            case EVEN:
                Cli.startGame();
                Engine.startGame(Even.generateQA(), "Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case CALCULATOR:
                Cli.startGame();
                Engine.startGame(Calculator.generateQA(), "What is the result of the expression?");
                break;
            case CGD:
                Cli.startGame();
                Engine.startGame(GCD.generateQA(), "Find the greatest common divisor of given numbers.");
                break;
            case PROGRESSION:
                Cli.startGame();
                Engine.startGame(Progression.generateQA(), "What number is missing in the progression?");
                break;
            case PRIME:
                Cli.startGame();
                Engine.startGame(Prime.generateQA(), "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                break;
            default:
                break;
        }
    }
}
