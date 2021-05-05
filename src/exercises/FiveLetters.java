package exercises;

import java.util.ArrayList;

public class FiveLetters {
    public static void fiveLetters(ArrayList<String> arr, int numChars){

        for(String word : arr){
            if(word.length() == numChars){
               System.out.println(word);

            }

        }
    }

}
