package lv.acodemy;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        //arrays are a data structure that allows to store a fixed number of elements of the same type
        //an array declaration looks like this:
        int[]numbers; //int array
        String[]names; //string array
        //declaring array size
        numbers = new int[5]; //5 elements, which now are [0,0,0,0,0]
        names = new String [3]; // [null,null,null]
        //change array size is not possible
        System.out.println(Arrays.toString(names));
        //is possible to immediately fill the array when declaring it
        int[]numberz = {1,2,3,4,5};
        //substitute other values ​​instead, but can't increase or decrease them
        String[]namez = {"John","Alex","Merry","Bob"};

        //element access - access to array elements
        //counting starts from 0, not from one, so John will be element zero
        //get the letter from the word
        String myName = "John";
        System.out.println(myName.charAt(0));
        //access to array element
        System.out.println(namez[2]); //print it out or assign a new value
        //access the array element by its index
        namez[2] =  "Jerry";
        System.out.println(Arrays.toString(namez));
        //if namez[4] = "Hello"; then there will be an exception - an error, because there is no fourth element in the array
        //there are 4 elements, but the index is 3
        System.out.println(namez.length);




    }
}
