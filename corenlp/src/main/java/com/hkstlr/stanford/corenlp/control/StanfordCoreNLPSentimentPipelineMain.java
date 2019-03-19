package com.hkstlr.stanford.corenlp.control;

import java.io.File;
import java.io.IOException;

import edu.stanford.nlp.sentiment.SentimentPipeline;

/** app for testing if Maven distribution is working properly */

public class StanfordCoreNLPSentimentPipelineMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File inputFile = new File(StanfordCoreNLPSentimentPipelineMain.class.getClassLoader()
                .getResource("sample-english.txt").getFile());
        
        args = new String[] { "-file", inputFile.getAbsolutePath() ,"-output", "root,probabilities,vectors,pennTrees"};
        
        SentimentPipeline.main(args);
    }
}