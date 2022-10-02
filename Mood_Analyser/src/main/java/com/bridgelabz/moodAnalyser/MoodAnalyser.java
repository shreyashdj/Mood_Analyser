package com.bridgelabz.moodAnalyser;

/**
 *  @author - Shreyash Jadhav
 */
public class MoodAnalyser {
    private String message;    // variable message of String type
    /**
      * created constructor with parameter message of String type
      */
    public MoodAnalyser(String message) {
        this.message = message;
    }
    /**
     *  creating method analyseMood having string return type to Analyse Mood from message
     *  it throws MoodAnalysisException
     */
    public String analyseMood() throws MoodAnalysisException {
        /*
         *  if message is empty throw MoodAnalysisException and print message to inform empty mood entered
         *  if message contains SAD it will return SAD
         *  if message is null it will throw NullPointerException
         *  we used try and catch to Handle NullPointerException and in catch
         *  throw MoodAnalysisException and print message to inform null mood entered
         *  else return HAPPY
         */
        try {
            if (message.isBlank()) {
                throw new MoodAnalysisException(MoodAnalysisErrors.EMPTY, "\n Entered empty mood \n Please Enter valid Mood");
            } else if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException | MoodAnalysisException nullPointerException){
            throw new MoodAnalysisException(MoodAnalysisErrors.NULL, "\n Entered null mood \n Please Enter valid Mood");
        }
    }
}