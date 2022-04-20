package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

     Question [] questions = {
            new MultipleChoice("What color are apples?" + "\n(a) red/green\n(b)Orange\n(c)Magenta\n", "a"),
            new MultipleChoice( "What color are bananas?" + "\n(a)red/green\n(b)Yellow\n(c)Blue\n", "b" ),
            new TrueFalse("The earth is flat?", "FALSE")
    };

    public static void takeTest(Question[] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(questions);
        }
        

    }
}
