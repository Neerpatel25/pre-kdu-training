// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        String fileName = "C:\\\\Users\\\\Asus\\\\IdeaProjects\\\\PRE-KDU-JAVA-3\\\\src\\\\Read.csv";

        ArrayList<String>List1= new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {

                String[] words = line.split(" ");


                for (String word : words) {
                    int n = word.length();
                    String s1 = word.substring(0, n-1 );
                    List1.add(s1);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String element : List1) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        LinkedHashMap<String, Integer> sortedMapByValueDesc = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) // Sort by value in descending order
                .forEachOrdered(x -> sortedMapByValueDesc.put(x.getKey(), x.getValue()));


        int i =0;
        for (Map.Entry<String, Integer> entry : sortedMapByValueDesc.entrySet()) {
            String key = entry.getKey();
            System.out.println( key );
            i++;
            if(i==3){
                break;
            }
        }
    }
}