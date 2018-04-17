package com.sda.fasade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuizFileRepository implements QuizRepository {

    private String path;

    public QuizFileRepository(String path) {
        this.path = path;
    }

    public List<QuizQuestion> readAll() throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        List<QuizQuestion> questions = new ArrayList<>();
        while (scanner.hasNextLine()) {
            //pytanie
            String question = scanner.nextLine();

            //odpowiedzi
            List<String> possibleAnswers = Arrays.asList(scanner.nextLine(),
                    scanner.nextLine(), scanner.nextLine(), scanner.nextLine());

            //odpowiedz
            char answer = scanner.nextLine().charAt(0);

            QuizQuestion quizQuestion = new QuizQuestion(question, possibleAnswers, answer);
            questions.add(quizQuestion);
        }
        return questions;
    }
}
