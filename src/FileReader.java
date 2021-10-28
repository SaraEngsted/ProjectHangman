import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FileReader {

    static Random random = new Random();
    static ArrayList<String> arrayListOfWords = new ArrayList<String>();


    //Shows words from the file and connects them to the game.
    //If file can't be found = "File could not be found".
    public static void getWords() {
        try {
            Scanner scanner = new Scanner(new File("Ressource/movies.csv"));
            while (scanner.hasNext()) {
                arrayListOfWords.add(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File could not be found");
            e.printStackTrace();
        }
    }

    //Get random word from file.
    public static String getRandomWord() {
        String words = arrayListOfWords.get(random.nextInt(arrayListOfWords.size()));
        System.out.println(words); //REMOVE!!!!!!!!!!!!
        return words;
    }

}
