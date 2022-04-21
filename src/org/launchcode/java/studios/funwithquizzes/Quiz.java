package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<>();

    public Quiz(){}

    public void addNewQuestion(Question question){
        this.questions.add(question);
    }

    public void takeTest() {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);

        for (Question question : this.questions) {
            System.out.println(question.getPrompt());
            String answer = keyboardInput.nextLine();
            if(answer.equals(question.getAnswer())){
                score++;
            }
        }
        System.out.println("You got " + score + "out of " + questions.size());

    }
}
