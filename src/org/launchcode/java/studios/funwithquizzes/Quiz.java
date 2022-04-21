package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<>();

    public Quiz(){
//        Question q1 = new MultipleChoice("""
//                What color are apples?
//                (a) red/green
//                (b) Orange
//                (c) Magenta
//                """, "a");
//        Question q2 = new MultipleChoice("""
//                What color are bananas?
//                (a) red/green
//                (b) Yellow
//                (c) Blue
//                """, "b" );
//        Question q3 = new TrueFalse("""
//                Is the earth is flat?" + "
//                True OR False""", "False");
////        Question q4 = new Checkbox("""
////                Choose all animals with spots.
////                (a) leopards
////                (b) lady bugs
////                (c) polar bears""" , "a", "b");
//
//        questions.add(q1);
//        questions.add(q2);
//        questions.add(q3);
        //questions.add(q4);
    }
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
