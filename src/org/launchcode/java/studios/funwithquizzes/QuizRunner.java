package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {
        Question q1 = new MultipleChoice("""
                What color are apples?
                (a) red/green
                (b) Orange
                (c) Magenta
                """, "a");
        Question q2 = new MultipleChoice("""
                What color are bananas?
                (a) red/green
                (b) Yellow
                (c) Blue
                """, "b" );
        Question q3 = new TrueFalse("""
                Is the earth is flat?" + "
                True OR False""", "False");

        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();

        quiz1.addNewQuestion(q1);
        quiz1.addNewQuestion(q2);

        quiz2.addNewQuestion(q3);

        quiz1.takeTest();
        quiz2.takeTest();


    }

}
