import java.util.ArrayList;

public class Game extends FileReader {
    private String wordToGuess;
    static ArrayList<Character> guesses = new ArrayList<Character>();
    static int currentLives;


    public Game(String chosenWord) {
        super();
        wordToGuess = chosenWord;
        currentLives = 6;
    }


    //Changes chosen random word to "_".
    public static void changeLettersToLines(String words) {
        for (int i = 0; i < words.length(); i++) {
        if (guesses.contains(words));
            System.out.print(words.replaceAll(words, ("_")));

        }
    }

    //Player guesses letter.
    public static String getPlayersGuess() {
        String playersGuessLetter = HangmanMain.scanner.nextLine();
        guesses.add(playersGuessLetter.charAt(0));

        return playersGuessLetter;
    }

    public static void showGuessedLettersStatus() {
        System.out.println("Player has guessed " + );
    }

    /*
    public static String gamesWordStatus() {
        String wordStatus ="";
        for (int i = 0; i < getRandomWord().length(); i++) {
            wordStatus = wordStatus + "_";
        }
        return wordStatus;
    }

     */




/*
    //Game mode
    public static void hangman() {

        guesses.add(playersGuess.charAt(0));

        if (getRandomWord().contains(playersGuess)) {

        }


    }

 */


}

