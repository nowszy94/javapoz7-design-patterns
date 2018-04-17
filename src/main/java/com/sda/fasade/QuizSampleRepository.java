package com.sda.fasade;

import java.util.Arrays;
import java.util.List;

public class QuizSampleRepository implements QuizRepository {
    @Override
    public List<QuizQuestion> readAll() throws Exception {
        return Arrays.asList(new QuizQuestion("abc", Arrays.asList("1","2","3","4"), 'c'));
    }
}
