package com.quiz.game;

public abstract class Question implements Scorable {
    protected String prompt;
    protected boolean isCorrect;

    public Question(String prompt) {
        this.prompt = prompt;
        this.isCorrect = false;
    }

    public abstract void ask();

    @Override
    public int getScore() {
        return isCorrect ? 1 : 0;
    }
}

