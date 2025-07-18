package com.quiz.game;

import java.util.Scanner;

public class FillInBlank extends Question {
    private String correctAnswer;

    public FillInBlank(String prompt, String correctAnswer) {
        super(prompt);
        this.correctAnswer = correctAnswer.toLowerCase();
    }

    @Override
    public void ask() {
        System.out.println(prompt);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer: ");
        String input = scanner.nextLine().toLowerCase();
        isCorrect = input.equals(correctAnswer);
    }
}
