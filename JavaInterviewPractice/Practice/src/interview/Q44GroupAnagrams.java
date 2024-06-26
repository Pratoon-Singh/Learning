package interview;

import java.util.*;

public class  Q44GroupAnagrams {
    /*
    There are list of strings which are of same length, print all strings which have same characters.
    [abc, bca, def, fed]
    [abc,bca] [def, fed]
     */
    public static void main(String[] args) {
        List<String> input = Arrays.asList("abc", "bca", "def", "fed");
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String s : input) {

            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);


            if (!anagramGroups.containsKey(sorted)) {
                anagramGroups.put(sorted, new ArrayList<>());
            }
            anagramGroups.get(sorted).add(s);
        }

        for (List<String> group : anagramGroups.values()) {
            System.out.println(group);
        }
    }
}
