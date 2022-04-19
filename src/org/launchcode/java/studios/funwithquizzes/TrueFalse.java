package org.launchcode.java.studios.funwithquizzes;

public class TrueFalse extends Question{

    private String correctAnswer;

    public TrueFalse(String question) {
        super(question);
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

    public static Boolean validateUserInput(String aInPut) {
        return aInPut.matches("TRUE|FALSE");
    }

    public boolean equals(String aAnswer) {
        return aAnswer.equals(correctAnswer);
    }

    public void addQuestion(){
        boolean exit = false;
        //new instance of Quiz
        do {
            System.out.println("Type the question or press enter to return to the menu");
            String question = Quiz.getUserInput(false);
            if (question.equals("")){
                return;
            }
            System.out.println("Enter the correct answer: TRUE or FALSE");
            String answer = Quiz.getUserInput(true);
            exit = validateUserInput(answer);

        } while(!exit);

    }

}

