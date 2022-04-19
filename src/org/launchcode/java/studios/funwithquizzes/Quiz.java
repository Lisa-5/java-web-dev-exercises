package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    ArrayList<Question> questions = new ArrayList<>();
    public static String getUserInput(boolean upper){
        Scanner input = new Scanner(System.in);
        String output = input.nextLine();

        if(upper){
            output = output.toUpperCase();
        }
        return output;
    }

    public void addQuestion(Question aQuestion){
        questions.add(aQuestion);
    }
}
