import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FileReader {

    static Random random = new Random();
    static ArrayList<String> arrayListOfWords = new ArrayList<String>();


    //Viser listen af de ord der er med i spillet.
    //Hvis filen af ord ikke kan findes, printes "file could not be found".
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

    //Få et random ord fra filen:
    public static String getRandomWord() {
        String words = arrayListOfWords.get(random.nextInt(arrayListOfWords.size()));
        System.out.println(words); //REMOVE!!!!!!!!!!!!
        return words;
    }

}
