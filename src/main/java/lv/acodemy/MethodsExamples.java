package lv.acodemy;

import org.w3c.dom.ls.LSOutput;

public class MethodsExamples {
    public static void main(String[] args) {
        //methods=functions, they perform a specific task or return something
        //Access modifier: public, private, protected, package-private (default)
        //void - if not return specific data type 
        //return - if return
        //Method name: should be unique in one class, camelCase
        //Parameters()

        // To create method:
        //[access modifier][other modifiers][return type]methodName{ method body return[value]
        sayHello();
        // String myName = "Svetlana"; or declare a variable before the method and insert it into brackets
        greet("Svetlana");
        greet("any name");
        greet("any name");
        

        System.out.println(add(30, 60));
        //with all methods that return something, you can do something, for example, display it on the screen
        // or create a variable
        int x = add(30, 90);
        System.out.println(x);

        System.out.println(add(12.2, 13.4));
        double a = 12.2;
        double b = 13.4;
        System.out.println(add(a, b));
        var firstStudent = calculateGrade(70);
        System.out.println(firstStudent);
        var secondStudent = calculateGrade(90);
        System.out.println(secondStudent);

    }

    // to write a method, exit the main method
    //Example: 1.Create a method that will print out "Hello, World!"
    public static void sayHello() { //For the method to work, call it in the main method, write sayHello(); in main
        System.out.println("Hello, World!");
    }

    //2. Create a method that greet a specific name
    // When the greet method called, specify name
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int a, int b) { //in brackets list of parameters required
        int c = a + b; //or just return a + b;
        return c;
    }

  //isn't possible create completely identical methods, but with the same name and different parameters
  //method overloading -  when methods with the same name but different parameters
  //public static int add(double a, double b){ the double numbers to return as int
  //return (int)(a+b);
  //or
    public static double add(double a, double b) {
        return a + b;
    }
 //to avoid changing values ​​when there are many students, create a method in main and call it
    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 75) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else {
            return "F";
        }

    }


}










