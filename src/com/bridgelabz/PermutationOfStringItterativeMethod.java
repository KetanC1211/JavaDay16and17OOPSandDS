package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;

public class PermutationOfStringItterativeMethod {
	// Iterative function to generate all permutations of a string in Java
	// using Collections
	public static void findPermutations(String str) {
	    // base case
	        if (str == null || str.length() == 0) {
	            return;
	        }
	        // create an empty ArrayList to store (partial) permutations
	        List <String> partial = new ArrayList<String>();	 
	        // initialize the list with the first character of the string
	        partial.add(String.valueOf(str.charAt(0)));
	 
	        // do for every character of the specified string
	    for (int i = 1; i < str.length(); i++)  {
	        // consider previously constructed partial permutation one by one
	        // (iterate backward to avoid ConcurrentModificationException)
	        for (int j = partial.size() - 1; j >= 0 ; j--){
	            // remove current partial permutation from the ArrayList
	                String s = partial.remove(j);
	 
	                // Insert the next character of the specified string at all
	               // possible positions of current partial permutation. Then
	               // insert each of these newly constructed strings in the list
	                for (int k = 0; k <= s.length(); k++){
	                    // Advice: use StringBuilder for concatenation
	                    partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
	                }
	            }
	        }
	        System.out.println(partial);
	    }
	 
	// Iterative program to generate all permutations of a string in Java
	public static void main(String[] args)
	{
	    String str = "ABC";
	    findPermutations(str);
	}
}
