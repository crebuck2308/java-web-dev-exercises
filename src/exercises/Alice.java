package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        System.out.println("Enter a word to to search for: ");
        String searchTerm = input.next();

        if(sentence.toLowerCase().contains(searchTerm.toLowerCase())){
            System.out.println("true");
        }else {
            System.out.println("The search did not find your word.");
        }

        Integer index = sentence.indexOf(searchTerm);
        Integer length = searchTerm.length();

        System.out.println("Your search term first appears at index " + index + ". Your term is " +
                length + " characters long.");

        String modifiedSentence = sentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }

}
