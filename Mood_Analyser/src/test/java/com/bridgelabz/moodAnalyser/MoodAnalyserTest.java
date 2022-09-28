package com.bridgelabz.moodAnalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 *  @author - Shreyash Jadhav
 */
public class MoodAnalyserTest {
    /*
     *  created moodAnalyzer object of class MoodAnalyser and
     *  initialise it by passing String "I am in Sad mood" as parameter
     */
    MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Sad mood");
    /**
     *  created analyseMoodTest method to test analyseMood method for Sad mood
     */
    @Test
    public void analyseMoodTest() {
        /*
         *  calling analyseMood method and
         *  checking expected (SAD) and actual output are equal or not
         *  using assertEquals method of class Assertions
         *  if equal then Test passed otherwise failed
         */
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }
}