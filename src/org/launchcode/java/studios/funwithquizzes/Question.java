package org.launchcode.java.studios.funwithquizzes;

public abstract class Question {

    private String question;

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public abstract String toString();
}
