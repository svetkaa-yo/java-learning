package lv.acodemy;

import javax.print.attribute.standard.PresentationDirection;

public class IfStatements {
    public static void main(String[] args) {
        //Even or Odd четное или нечетное
        int number = 7;
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        //positive or negative, assume 0 is positive
        number = -5;
        if (number >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
        //Grade checker (if-else-if)
        // 90>= A, 75-89 B, 50-74 C, <50 F

        int score = 68;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        //Task #1: Check if a person is eligible to buy an alcohol.
        int age = 19;
        if (age >= 18) {
            System.out.println("A person is eligible to buy an alcohol.");
        }
        // Task #2: Check if a number can be devided by 5;
        int number1 = 10;
        if (number1 % 5 == 0) {
            System.out.println("The number can be devided by 5");
        }
        // Task #3: Check pass or fail. If score >=50 passed, else failed
        int score1 = 30;
        if (score1 >= 50) {
            System.out.println("Passed.");
        } else {
            System.out.println("Failed");
        }
        // Task #4: Above 30 It's hot, between 15 and 30 Nice weather, below 15 It's cold.
        int temperature = 28;
        if(temperature>30) {
            System.out.println("It's hot.");
        } else if(temperature >=15) {
            System.out.println("Nice weather.");
        } else{
            System.out.println("It's cold.");
        }
        // Task #5: green -go, yellow -slow down, red -stop
        //string color, if(color.equals ("Green")){}, метод equals относится к String
        String color = "Red";
        if (color.equals("Green")) {
            System.out.println("Go!");
        }else if(color.equals("Yellow")) {
            System.out.println("Slow down!");
        }else if(color.equals("Red")){
            System.out.println("Stop!");
        }else{
            System.out.println("Unknown color");
        }





    }





}

