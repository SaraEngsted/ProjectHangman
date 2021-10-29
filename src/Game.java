import java.util.ArrayList;
import java.util.Scanner;

public class Game extends FileReader {

    static Scanner scanner = new Scanner(System.in);
    private static String wordToGuess;
    static ArrayList<Character> guesses = new ArrayList<Character>();
    static int mistakes;


    public Game(String chosenWord) {
        super();
        wordToGuess = chosenWord;
        mistakes = 0;
    }


    //Changes chosen random word to "_".
    public static String changeLettersToLines(String words) {
        String gameStatus = "";
        for (int i = 0; i < words.length(); i++) {
            gameStatus = gameStatus + "_";
        }
        return gameStatus;
    }

    //Player guesses letter.
    public static String getPlayersGuess() {
        String playersGuessLetter = scanner.nextLine();
        guesses.add(playersGuessLetter.charAt(0));

        return playersGuessLetter;
    }

    public static void showGuessedLettersStatus() {
        System.out.println("Player guessed the letter " + guesses);
    }

    public static String updatedGameStatus(String playerGuessLetter, String gameStatus) {
        StringBuilder currentGameStatus = new StringBuilder(gameStatus);

        for (int i = 0; i < wordToGuess.length(); i++) {
            if (String.valueOf(wordToGuess.charAt(i)).equals(playerGuessLetter)) {
                currentGameStatus.setCharAt(i, wordToGuess.charAt(i));
            }

        }
        gameStatus = currentGameStatus.toString();

        return gameStatus;
    }








}






