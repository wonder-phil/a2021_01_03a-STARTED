package me.pgb.a2021_02_03a.model;

public class Question {
    private int id;
    private boolean answerIsTrue;

    public Question(int id, boolean isTrue) {
        this.id = id;
        answerIsTrue = isTrue;
    }

    public int getQuestionID() {
        return id;
    }

    public boolean isQuestionTrue(){
        return answerIsTrue;
    }
}
