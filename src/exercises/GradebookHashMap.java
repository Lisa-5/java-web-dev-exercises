package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHashMap {

    public static void main(String[] args) {

        HashMap<String, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudentId;

        System.out.println("Enter your student's IDs and names (or press ENTER to finish):");

        do{
            System.out.print("Student ID: ");
            newStudentId = input.nextLine();

            if(!newStudentId.equals("")) {
                System.out.print("Student name: ");
                String newStudentName = input.nextLine();
                students.put(newStudentId, newStudentName);

                input.nextLine();
            }
        } while(!newStudentId.equals(""));

        input.close();

        System.out.println("\nClass roster: ");

        for(Map.Entry<String, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
