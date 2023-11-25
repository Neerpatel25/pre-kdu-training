// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.print("Hello and welcome!");
        ArrayList<String> List1 = new ArrayList<>();
        HashSet<String> h = new HashSet<>();
        Scanner scn = new Scanner(System.in);
        for(int i=0;i<5;i++){
            List1.add(scn.nextLine());
        }
        for(int i=0;i<5;i++){
            h.add(List1.get(i));
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String element : List1) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        System.out.println("List Contains:");
        for(int i=0;i< List1.size();i++){
            System.out.println(List1.get(i));
        }
        System.out.println("Set Contains:");
        Iterator it = h.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Frequency of the words:");
        for (Map.Entry<String,Integer> mapElement : map.entrySet()) {
            String key = mapElement.getKey();

            int value = mapElement.getValue() ;

            System.out.println("Word = " + key +", " +"Frequency = " + value);
        }







    }
}