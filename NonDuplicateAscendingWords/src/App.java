import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        String filePath = "lib/phoneWalletKeys.txt";

        TreeSet<String> words = new TreeSet<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while(reader.readLine() != null) {
                line = reader.readLine();
                String[] wordsArr = line.split("\\s+");
                for(String word : wordsArr) words.add(word);
            }
        }
        catch(IOException e) {
            System.err.println(e);
        }

        for(String word : words) {
            System.out.println(word);
        }
    }
}
