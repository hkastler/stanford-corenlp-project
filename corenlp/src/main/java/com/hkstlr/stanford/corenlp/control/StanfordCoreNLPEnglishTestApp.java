package com.hkstlr.stanford.corenlp.control;

import java.io.File;
import java.io.IOException;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

/** app for testing if Maven distribution is working properly */

public class StanfordCoreNLPEnglishTestApp {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File inputFile = new File(StanfordCoreNLPEnglishTestApp.class.getClassLoader().getResource("sample-english.txt").getFile());
        File propsFile = new File(StanfordCoreNLPEnglishTestApp.class.getClassLoader().getResource("english.properties").getFile());
        String[] englishArgs = new String[] { "-file", inputFile.getAbsolutePath(),
        "-props" , propsFile.getAbsolutePath() };
        StanfordCoreNLP.main(englishArgs);
    }
}
