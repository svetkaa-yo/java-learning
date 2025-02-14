package lv.acodemy;

public class Variables {
    public static void main(String[] args) {
      
        // int (integer)  = natural number
        int age = 26;
        int currentYear = 2024;
        int inventoryItemCount = 100;

        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemCount);

        // double(fractional numbers)
        double temperature = 36.6;
        double price = 19.99;

        System.out.println(temperature);
        System.out.println(price);

        // char (symbols)
        char grade = 'A';
        char myInitial = 'N';
        char currencySymbol = 'S';

        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currencySymbol);

        //boolean (logical type, only two values: true and false)
        //Example: isSummer/ if(isSummer) {}; / isLoggedIn;
        //Example: hasAccess/ if(hasAccess) {};

        boolean hasAccess = true;
        System.out.println(hasAccess);
        boolean isSummer = false;
        System.out.println(isSummer); // println = print new line like \n

        System.out.print("Hello World\n");
        System.out.println("Hello World");

        //long
        long phoneNumber = 29999999;
        System.out.println(phoneNumber);
        //float
        float interestRate = 4.5f;
        System.out.println(interestRate);

        //arithmetic operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);

        int c = 20;
        int d = 8;
        int difference = c - d;
        System.out.println(difference);

        int m = 7;
        int n = 3;
        int result = m * n;
        System.out.println(result);

        //division
        int num1 = 10;
        int num2 = 3;
        int division = num1/num2;
        System.out.println(division); //тут покажет 3 , только целое число

        double num3 = 10.0;
        double num4 = 3.0;
        double divResult = num3/num4; 
        System.out.println(divResult); //if int/int but result is double, error

        // %(remainder of division) остаток деления
        int f = 10;
        int g = 3;
        int remainder = f % g; // 10= 3*3=9+1, 1 is reminder
        System.out.println(remainder);
        //чтобы узнать четное число или нет
        int number = 8;
        boolean isEven = (number%2 == 0); // == comparison operator сравнивание
        System.out.println(isEven); //true, делится на два без остатка. а если 9 то false

        //increment ++ increase by 1
        //Decrement -- decrease by 1
        //++preIncrement
        //--decrement
        number ++;
        System.out.println(number);
        int counter = 10;
        counter ++;
        int postIncrement = counter++;
        //postIncrement will be 11, counter 12
        int preIncrement = ++counter;
        //here will be 13,  т.к. мы вначале увеличили а затем назначили

        int r = (a+b)/5;
        System.out.println(r);

        // string is symbols array
        String name = "Svetlana";
        String lastName = "Frolova";
        //print them separately

        System.out.println(name);
        System.out.println(lastName);

        String fullName = name + " " + lastName;
        String fullName1 = name + lastName; //in this case without space
        System.out.println(fullName);
        System.out.println(fullName1);

        // %s - for String % insert variable - interpolation, after the comma wich variables
        // %d - for numbers
        // %b - any type
        // \n new line
        // printf - like println
        // println -takes a string with string format and prints it
        System.out.printf("My name is: %s,\n" +
                "My surname is: %s\n", name, lastName);
        System.out.println(String.format("My name is: %s,\n" +
                "My surname is: %s\n", name, lastName)); 
        // %n or \n next line
        // there is a var - a variable with an implicit type that the compiler can
        // determine automatically
        var myCurrentAge = 30;
        var text = "Hello World";
        //can only be used inside methods
        //cannot be used for fields or method parameters
        //we are now writing inside the main method, and if we move the variable to the class level, then java will not allow
        // is possible to move typed variables
        String myVar;
        myVar = "Hello, World"; 
      // var requires initialization when declared and cannot be assigned a null value
      // relatively loss of readability, since another person will not clearly understand what type of data is used
      // use when the type of variables is clearly known and to make the code more compact, for example, in lists








    }
}
