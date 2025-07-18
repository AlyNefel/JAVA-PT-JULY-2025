package com.quiz.game;

import java.util.Scanner;

public class TrueFalse extends Question {
    private boolean correctAnswer;

    public TrueFalse(String prompt, boolean correctAnswer) {
        super(prompt);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void ask() {
        System.out.println(prompt + " (true/false)");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        String input = scanner.nextLine().trim();
        isCorrect = input.equalsIgnoreCase(Boolean.toString(correctAnswer));
    }
}


