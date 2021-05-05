package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayListPractice {
    public static void main(String[] args){
      //ArrayList Practe 3.7.2 - 1
//        ArrayList<Integer> someInts = new ArrayList<>();
//        someInts.add(1);
//        someInts.add(2);
//        someInts.add(3);
//        someInts.add(4);
//        someInts.add(5);
//        someInts.add(6);
//        someInts.add(7);
//        someInts.add(8);
//        someInts.add(9);
//        someInts.add(10);
//
//        Integer evenInts = EvenSum.evenSum(someInts);
//
//        System.out.println(evenInts);

        Scanner input = new Scanner(System.in);

//  3.7.2 - 2 & 3
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("pie");
        words.add("rutabaga");
        words.add("peach");

        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        FiveLetters.fiveLetters(words, numChars);


        //Bonus - Working on...
//        String longString = "I would not, could not, in a box. " +
//                "I would not, could not with a fox. I will not eat them in a house. " +
//                "I will not eat them with a mouse.";
//        String str[] = longString.split(" ");
//        List<String> shortStrings = new ArrayList<String>();
//        shortStrings = Arrays.asList(str);
//
//        System.out.println(shortStrings);
//
//        System.out.println("Enter a word length: ");
//        int numChars = input.nextInt();
//        FiveLetters.fiveLetters(shortStrings, numChars);
    }

}
