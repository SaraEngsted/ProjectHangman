import java.util.ArrayList;

public class Game extends FileReader {

    static ArrayList<Character> guesses = new ArrayList<Character>();

    public Game(String chosenWord) {
        super();
    }


    public static void changeLettersToLines(String words) {
        for (int i = 0; i < words.length(); i++) {
        if (guesses.contains(words));
            System.out.print(words.replaceAll(words, ("_")));

        }
    }

    public static void hangman() {

    }


}

