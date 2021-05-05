package exercises;


import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
//        int[] someInts = {1, 1, 2, 3, 5, 8};
//Print out all values of array
//        for (int i = 0; i < 6; i++) {
//            System.out.println(someInts[i]);
//
//
//        }
//Print out only odd numbers
//        for(int i = 0; i < 6; i++) {
//            if(someInts[i] % 2 == 1) {
//                System.out.println(someInts[i]);
//            }
//

//3.7.1.3
//        String longString = "I would not, could not, in a box. " +
//                "I would not, could not with a fox. I will not eat them in a house. " +
//                "I will not eat them with a mouse.";
//        String[] words = longString.split(" ");
//        System.out.println(Arrays.toString(words));

//3.7.1.5
        String longString = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] words = longString.split("\\.");
        System.out.println(Arrays.toString(words));

    }
}
