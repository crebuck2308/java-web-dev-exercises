package org.launchcode.java.studio1b.countingcharacters;

import java.util.Scanner;
import java.util.HashMap;


public class CountingCharacters {
    public static void main(String[] args){
/*
key = character; value = number of times the character occurs
 */
        String string = "If the product of two terms is zero then common sense" +
                " says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics" +
                " into a form that can be factored allowing that side of the equation " +
                "to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> characterCount = new HashMap<>();
        int count;
        char ch;

        for (int i = 0; i <string.length(); i++) {
            //character = the character of string at index i
            ch = string.charAt(i);
            //if loop checks if ch is already a key
            if(characterCount.containsKey(ch)) {
                //if true, count = the value of the associated ch (key) in characterCount (current count of the key)
                count = characterCount.get(ch);
                //count + 1 for the occurrence of the ch
                count++;
                //use the .replace() method to make sure the new count is the current value of the k:v pair
                characterCount.replace(ch, count);
            } else { //if the ch is not a key yet, add it to the characterCount object and set count to 1
                characterCount.put(ch, 1);
            }
            //will iterate through the entire string;
        }
        /*for-each loop: for each key in characterCount : using characterCount.keySet()
        to determine every key set in  the collection
        */
        for(Character key : characterCount.keySet()) {
            //print the key value and then the value associated with each key
            System.out.println(key+ " : " +characterCount.get(key));
        }


    }
}
