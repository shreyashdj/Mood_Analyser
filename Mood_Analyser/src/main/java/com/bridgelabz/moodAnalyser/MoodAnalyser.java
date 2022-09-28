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
     *  creating method analyseMood having string return type and  parameter of string type
     */
    public String analyseMood(String message){
        /*
         *  if message contains SAD it will return SAD and
         *  if message contains HAPPY it will return HAPPY
         */
        if(message.contains("Sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}