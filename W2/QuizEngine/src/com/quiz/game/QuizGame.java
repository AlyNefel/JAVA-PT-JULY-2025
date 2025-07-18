package com.quiz.game;

import java.util.ArrayList;


public class QuizGame {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new MultipleChoice("What is the capital of France?", 
            new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 2));
        questions.add(new TrueFalse("Java is a compiled language.", true));
        questions.add(new FillInBlank("Fill in the blank: The ___ is mightier than the sword.", "pen"));

        int totalScore = 0;

        System.out.println("Welcome to the Quiz Game!");
        for (Question q : questions) {
            q.ask();
            totalScore += q.getScore();
            System.out.println(q.getScore() == 1 ? "✅ Correct!" : "❌ Incorrect.");
            System.out.println("---------------------------");
        }

        System.out.println("Your total score: " + totalScore + "/" + questions.size());
    }
}

