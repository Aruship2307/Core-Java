package com.java8features;
import java.util.Map;
import java.util.stream.Collectors;

public class StringOccuranceEachChars {

	public static void main(String[] args) {
		String str = "JAVA DEVELOPER";  // used map to print each character & along with its count from given string
		Map<Character, Long> charCountMap = str.chars() // chars() method to convert the string to an IntStream of characters, 
		   .mapToObj(c->(char)c)
		   .collect(Collectors.groupingBy(c->c, Collectors.counting()));
		// printing occurrence of each character and its count
		charCountMap.forEach((chars, count)->System.out.println("character '"+chars+"' : "+count));

	}
}
//mapToObj(c->(char)c) =  it  converts each integer value (representing a character) into a char
//collect(Collectors.groupingBy(c->c, Collectors.counting())) = collect method is used to collect the characters into a Map where the keys are characters and the values are the counts of each character.
//Collectors.groupingBy(c -> c, Collectors.counting()): This part of the code groups the characters by their values (the identity function c -> c), and the counting() collector counts the occurrences of each character.
//The resulting Map<Character, Long> (charCountMap) now contains the count of occurrences of each unique character in the name string.
//finally, forEach method to iterate over the entries of the charCountMap. For each entry (character and count pair), it prints a message indicating the occurrence of each character in the original string


/*
     used char array instead of array
      char[] charArray = {'J', 'A', 'V', 'A', ' ', 'D', 'E', 'V', 'E', 'L', 'O', 'P', 'E', 'R'};

     // Using Java 8 streams and collectors
     Map<Character, Long> charCountMap = new String(charArray).chars()
             .mapToObj(c -> (char) c)
             .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

     // printing occurrence count of each character
     charCountMap.forEach((character, count) -> System.out.println("occurrence of each character '" + character + "' : " + count));*/
