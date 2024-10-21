import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UncommonWords {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
//      QUESTION why the split is more effective than scanner?
        Scanner scanner1 = new Scanner(s1);
        Scanner scanner2 = new Scanner(s2);

        while (scanner1.hasNextLine()){
            String word = scanner1.nextLine();
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }else{
                map.put(word, 1);
            }
        }
        while (scanner2.hasNextLine()){
            String word = scanner2.nextLine();
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }else{
                map.put(word, 1);
            }
        }

        ArrayList<String> uncommon = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                uncommon.add(entry.getKey());
            }
        }

        return uncommon.toArray(new String[uncommon.size()]);
    }
}
