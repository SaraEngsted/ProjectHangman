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

        //Find random word to guess
        FileReader.getWords();
        String chosenWord = FileReader.getRandomWord();

        //Word to guess into lines
        Game hangman = new Game(chosenWord);    //??
        String wordInLines = hangman.changeLettersToLines(chosenWord);
        scanner.nextLine();

        //Game
        //Show words in lines for user
        System.out.println(wordInLines);

        int howManyWrongGuesses = 0;

        while (true) {
            if (howManyWrongGuesses == 6) {
                System.out.println("You just killed an innocent man!");
                System.out.println("The word was " + chosenWord);
                break;

            }
            if (chosenWord.equals(wordInLines)) {
                System.out.println("You won fair and square...");
                System.out.println("The word was " + chosenWord);
                break;
            }
            //Get a letter from player
            System.out.println("Please enter a letter to guess the word. You have 6 tries. Good luck!");
            String playersGuessLetter = hangman.getPlayersGuess();


            if (chosenWord.contains(playersGuessLetter)) {
                //Check if players guess is in the word
                String updatedStatus = hangman.updatedGameStatus(playersGuessLetter, wordInLines);
                wordInLines = updatedStatus;
            } else {
                howManyWrongGuesses++;
                System.out.println("Wrong Guess!");
            }
            System.out.println(wordInLines);
        }

    }
}
