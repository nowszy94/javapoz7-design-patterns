package com.sda.fasade;

import java.util.List;

public interface QuizRepository {
    List<QuizQuestion> readAll() throws Exception;
}
