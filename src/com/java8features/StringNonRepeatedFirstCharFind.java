package com.java8features;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringNonRepeatedFirstCharFind {
	   private static char findFirstNonRepeatedChar(String str) {
	        Map<Character, Long> charCountMap = str.chars()
	                .mapToObj(c -> (char) c)  // maps each character to an object of type Character
	                .collect(
	                        LinkedHashMap::new,
	                        (map, ch) -> map.merge(ch, 1L, Long::sum),
	                        LinkedHashMap::putAll
	                );

	        return charCountMap.entrySet().stream()
	                .filter(entry -> entry.getValue() == 1)
	                .findFirst()
	                .map(Map.Entry::getKey)
	                .orElseThrow(() -> new RuntimeException("No non-repeated character found"));
	    }

    public static void main(String[] args) {
        String str = "Java Articles Are Awesome";

        char result = findFirstNonRepeatedChar(str);

        System.out.println("First non-repeated character: " + result);
    }
}
/*//  simplify the code by using method references and inline some of the operations.
 * private static char findFirstNonRepeatedChar(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(LinkedHashMap::new, (map, ch) -> map.merge(ch, 1L, Long::sum), LinkedHashMap::putAll)
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new RuntimeException("No non-repeated character found"));
    }*/
 