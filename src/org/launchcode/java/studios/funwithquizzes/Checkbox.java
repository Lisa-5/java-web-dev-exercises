package org.launchcode.java.studios.funwithquizzes;

public class Checkbox extends Question{

    private String possibleAnswers;

    public Checkbox(String prompt, String answer, String possibleAnswers) {
        super(prompt, answer);
        this.possibleAnswers = possibleAnswers;
    }

    public String getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(String possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }
}
