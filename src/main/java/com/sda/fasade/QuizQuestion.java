package com.sda.fasade;

import java.util.List;

public class QuizQuestion {
    private String question;
    private List<String> possibleAnswers;
    private char answer;

    public QuizQuestion(String question, List<String> possibleAnswers, char answer) {
        this.question = question;
        this.possibleAnswers = possibleAnswers;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public char getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "QuizQuestion{" +
                "question='" + question + '\'' +
                ", possibleAnswers=" + possibleAnswers +
                ", answer=" + answer +
                '}';
    }
}
