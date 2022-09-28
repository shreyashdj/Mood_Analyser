package com.bridgelabz.moodAnalyser;

public class MoodAnalyser {
    /**
     *  creating method analyseMood having string return type and  parameter of string type
     */
        public String analyseMood(String message){
            /*
             *  if message contains SAD it will return SAD and
             *  if message contains HAPPY it will return HAPPY
             */
            if(message.contains("SAD")){
                return "SAD";
            }
            else{
                return "HAPPY";
            }
        }
    }
}