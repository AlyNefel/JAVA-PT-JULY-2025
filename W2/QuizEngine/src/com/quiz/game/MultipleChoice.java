package com.quiz.game;

import java.util.Scanner;

public class MultipleChoice extends Question {
    private String[] options;
    private int correctIndex;

    public MultipleChoice(String prompt, String[] options, int correctIndex) {
        super(prompt);
        this.options = options;
        this.correctIndex = correctIndex;
    }

    @Override
    public void ask() {
        System.out.println(prompt);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ": " + options[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your answer (1-" + options.length + "): ");
        int answer = Integer.parseInt(scanner.nextLine().trim());
        isCorrect = (answer - 1 == correctIndex);
    }
}
