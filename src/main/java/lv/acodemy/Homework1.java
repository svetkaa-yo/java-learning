package lv.acodemy;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Homework1 {
    public static void main(String[] args) {
        // 1.Use a loop to calculate the sum of numbers from 1 to 20.
        for (int i = 1; i < 21; i++) {
            System.out.println(i * (i + 1) / 2);
        } //using the math formula
        //or if the final sum
        int result = 0; // create a variable that has nothing in it, which will be in output
        for (int i = 1; i < 21; i++) {
            result = result + i;
        }//each time the variable is overwritten
        System.out.println("The sum of 1 to 20 = " + result);
        System.out.println(IntStream.rangeClosed(1, 20).sum()); //a stream of numbers to sum them up, functional programming
        //2.Write a program to print the multiplication table from 1 to 10.
        for (int i = 1; i < 11; i++) {
            System.out.println("Multiple table for " + i);
            for (int j = 1; j < 11; j++) {
                System.out.println(i + "*" + j + " = " + i * j);
            }
        }
        //I wanted to print the columns, but I didn't finish them
        for (int i = 1; i < 3; i++) {
            System.out.println("Multiple table for " + i);
            for (int k = 1; k < 11; k++) {
                System.out.print(" * " + k);
                for (int j = i; j < 11; j = j + 2) {
                    System.out.println(i + "*" + j + " = " + i * j);
                }
            }
        }
        //3.Print numbers in reverse order from 10 to 1.
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //4.Print the following pattern using nested loops
        for (int y = 1; y < 6; y++) {
            for (int x = 1; x <= y; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //5.Use a loop to print the squares of numbers from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println("The square of " + i + " = " + (i * i));
        }
        //6.Write a loop that prints the cumulative sum at each step for numbers from 1 to 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * (i + 1) / 2);
        }
        // or
        for (int j = 1; j <= 10; j++) {
            int result2 = 0;
            for (int i = 1; i <= j; i++) {
                result2 = result2 + i;
            }
            System.out.println(result2);
        }
        //7.Create an int array and use a loop to print each element.
        int numbers[] = {1,2,3,4,5};
        for(int i=0; i < numbers.length;i++) {
            System.out.println(numbers[i]);}
        //8.Write a loop to count down from 100 to 0, decrementing by 5 each time.
        for(int i=100;i>=0;i-=5){
            System.out.println(i);
        }
    }
}
