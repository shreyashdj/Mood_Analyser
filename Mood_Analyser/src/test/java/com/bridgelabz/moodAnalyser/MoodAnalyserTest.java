package com.bridgelabz.moodAnalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 *  @author - Shreyash Jadhav
 */
public class MoodAnalyserTest {
    /**
     *  created analyseMoodTestForSadMood method to test analyseMood method for Sad mood
     */
    @Test
    public void analyseMoodTestForSadMood() throws MoodAnalysisException {
        /*
         *  created moodAnalyzer object of class MoodAnalyser and
         *  initialise it by passing message "I am in Sad mood"
         *  calling analyseMood method and
         *  checking expected (SAD) and actual output are equal or not
         *  using assertEquals method of class Assertions
         *  if equal then Test passed otherwise failed
         */
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Sad mood");
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }
    /**
     *  created analyseMoodTestForAnyMood method to test analyseMood method for Any mood
     */
    @Test
    public void analyseMoodTestForAnyMood() throws MoodAnalysisException {
        /*
         *  created moodAnalyzer object of class MoodAnalyser and
         *  initialise it by passing message "I am in Any mood"
         *  calling analyseMood method and
         *  checking expected (HAPPY) and actual output are equal or not
         *  using assertEquals method of class Assertions
         *  if equal then Test passed otherwise failed
         */
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Any mood");
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
    /**
     *  created analyseMoodTestForNullMood method to test analyseMood method for null mood
     */
    @Test
    public void analyseMoodTestForNullMood() throws MoodAnalysisException {
        /*
         *  created moodAnalyzer object of class MoodAnalyser and
         *  initialise it by passing null message
         *  calling analyseMood method and
         *  checking expected (HAPPY) and actual output are equal or not
         *  using assertEquals method of class Assertions
         *  if equal then Test passed otherwise failed
         */
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
    /**
     *  created analyseMoodTestForEmptyMood method to test analyseMood method for empty mood
     */
    @Test
    public void analyseMoodTestForEmptyMood() throws MoodAnalysisException {
        /*
         *  created moodAnalyzer object of class MoodAnalyser and
         *  initialise it by passing empty message
         *  calling analyseMood method and
         *  checking expected (HAPPY) and actual output are equal or not
         *  using assertEquals method of class Assertions
         *  if equal then Test passed otherwise failed
         */
        MoodAnalyser moodAnalyzer = new MoodAnalyser("");
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
}