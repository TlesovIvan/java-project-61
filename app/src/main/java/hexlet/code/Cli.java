package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String userName;
    public static void startGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
    public static String getName() {
        return userName;
    }
}
