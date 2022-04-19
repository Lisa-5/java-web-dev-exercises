package org.launchcode.java.studios.funwithquizzes;

import java.util.Objects;

public class MultipleChoice extends Question {

    private static String correctAnswer;

    public MultipleChoice(String question, String correctAnswer) {
        super(question);
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return getQuestion();
    }

}
