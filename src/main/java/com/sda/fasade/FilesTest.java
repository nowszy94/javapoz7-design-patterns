package com.sda.fasade;

import java.io.FileNotFoundException;
import java.util.List;

public class FilesTest {

    public static void main(String[] args) throws FileNotFoundException {
        QuizFileRepository quizFileRepository = new QuizFileRepository("test.txt");
        List<QuizQuestion> questions = quizFileRepository.readAll();
        questions.forEach(e -> System.out.println(e));
        System.out.println("test");
    }
}
