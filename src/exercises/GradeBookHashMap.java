package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class GradeBookHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");


        do{

            System.out.print("Student: ");
            newStudent  = input.nextLine();

            if(!newStudent.equals("")){
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                students.put(newID, newStudent);

                input.nextLine();
            }

        } while(!newStudent.equals(""));
        input.close();

        System.out.println("\n Class roster:");

        for(Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }
        System.out.println("Number of students in roster: " + students.size());
    }

}
