import java.util.Scanner;

public class HangmanMain {

    static Scanner scanner = new Scanner(System.in);

    //Welcome and game rules
    public static void main(String[] args) {
        System.out.println("________________________");
        System.out.println("😈 WELCOME TO HANGMAN 😈");
        System.out.println("________________________");
        System.out.println("Press ENTER to start game");
        scanner.nextLine();
        System.out.println("Your word is down below");
        System.out.println("⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇");

        FileReader.getWords();
        String chosenWord = FileReader.getRandomWord();

        Game hangman = new Game(chosenWord);
        hangman.changeLettersToLines(chosenWord);
        scanner.nextLine();
        System.out.println("Please enter a letter to guess the word. You have 6 tries. Good luck!");
        Game.getPlayersGuess();
        //String playersGuess = HangmanMain.scanner.nextLine();





    }



}
