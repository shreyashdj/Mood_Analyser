package com.bridgelabz.moodAnalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 *  @author - Shreyash Jadhav
 */
public class MoodAnalyserTest {
    MoodAnalyser moodAnalyzer = new MoodAnalyser();     // created moodAnalyzer object of class MoodAnalyser
    @Test
    /**
     *  created analyseMoodTest method to test analyseMood method for SAD mood
     */
    public void analyseMoodTest() {
        /*
         *  passing String "I am in Sad mood" as parameter in analyseMood method
         *  checking expected (SAD) and actual output are equal or not
         *  using assertEquals method of class Assertions
         *  if equal then Test passed otherwise failed
         */
        String mood = moodAnalyzer.analyseMood("I am in Sad mood");
        Assertions.assertEquals("SAD", mood);
    }
}