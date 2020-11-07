import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Exercice2 {
    public static <Int> void main(String[] args) throws Exception {
        HashMap<String, Double> shoppingCartValue = new HashMap<>();
        shoppingCartValue.put("Pomme", 0.60);
        shoppingCartValue.put("Orange", 1.25);
        System.out.println("Saisir la liste d'article et tapez deux fois sur entrer une fois terminer");
        List<String> listOfArticles = new ArrayList<String>();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (true) {
            line = buffer.readLine();
            if (line == null || line.isEmpty()) {
                break;
            }
            listOfArticles.addAll(processLine(line));
        }
        double total = 0;
        for (String article : listOfArticles) {
            total += shoppingCartValue.get(article);
        }
        System.out.println(listOfArticles + " => " + total);
    }

    public static List<String> processLine(String line) {
        //  Be aware of spaces in list of articles.
        return Arrays.asList(line.split(" "));
    }
}
