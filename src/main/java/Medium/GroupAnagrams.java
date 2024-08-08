package Medium;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> words = Arrays.asList(strs);

        Map<String, List<String>> anagrams = words.stream()
                .sorted()
                .collect(Collectors.groupingBy(w -> sortChars(w)));

        List<List<String>> grouped = new ArrayList<>();

        for (Map.Entry entry : anagrams.entrySet()){
            List<String> eachGrouping = new ArrayList<>();
            eachGrouping.add(entry.getValue().toString());
            Collections.sort(eachGrouping);
            grouped.add(eachGrouping);
        }
        return grouped;
    }

    public static String sortChars(String input) {
        char[] characters = input.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }
}
