package com.bridgelabz.moodAnalyser;

/**
 * @author - Shreyash Jadhav
 */
public class MoodAnalysisException extends Exception {
    MoodAnalysisErrors errorType;   //  variable to differentiate error type
    /**
     *  created constructor and passing parameter errorType and message
     */
    public MoodAnalysisException(MoodAnalysisErrors errorType, String message){
        super(message);
        this.errorType = errorType;
    }
}
