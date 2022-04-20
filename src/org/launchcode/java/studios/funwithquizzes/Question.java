package org.launchcode.java.studios.funwithquizzes;

public abstract class Question {

    private String prompt;
    private String answer;

    public Question(String prompt, String answer){
        this.prompt = prompt;
        this.answer = answer;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    //    public Question(String question) {
//        this.question = question;
//    }
//
//    public String getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(String question) {
//        this.question = question;
//    }
//
//    @Override
//    public abstract String toString();
}
