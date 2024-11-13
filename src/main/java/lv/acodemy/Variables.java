package lv.acodemy;

public class Variables {
    public static void main(String[] args) {
        // this is comment
        /*
        this is 1 line
        this is 2 line
         */

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
        System.out.println(isSummer); // здесь добавлена невидимая \n

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
        int sum = a + b; //можно не ставить пробелы, ctrl+alt+l авт.форматирование
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
        double divResult = num3/num4; // название другое потому что переменная такая уже есть выше
        System.out.println(divResult); //если int int, а деление double, то будет ошибка

        // %(remainder of division) остаток деления
        int f = 10;
        int g = 3;
        int remainder = f % g; // 10= 3*3=9+1, 1 это остаток
        System.out.println(remainder);
        //может использоваться например, чтобы узнать четное число или нет
        int number = 8;
        boolean isEven = (number%2 == 0); // == comparison operator это сравнивание
        System.out.println(isEven); //ответ тру, делится на два без остатка. а если 9 то фолс

        //increment ++ увеличить значение на 1
        //Decrement -- уменьшить на 1
        //++preIncrement
        //--decrement
        number ++;
        System.out.println(number);
        int counter = 10;
        counter ++;
        int postIncrement = counter++;
        //postIncrement станет 11, а counter 12, потому что вначале назначили
        //значение переменной, а затем увеличили counter на 1
        int preIncrement = ++counter;
        //здесь переменная и каунтер будет 13, т.к. мы вначале увеличили а затем назначили

        // можно и несколько операторов
        int r = (a+b)/5;
        System.out.println(r);




    }
}
