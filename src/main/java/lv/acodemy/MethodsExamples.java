package lv.acodemy;

import org.w3c.dom.ls.LSOutput;

public class MethodsExamples {
    public static void main(String[] args) {
        //методы=функции, они что-то выполняют или возвращает
        //Access modifier: public, private, protected, package-private (default)
        //void - if not return specific data type
        //return - if return
        // Method name: should be unique in one class, camelCase
        //Parameters()

        // To create method:
        //[access modifier][other modifiers][return type]methodName{ method body return[value]
        sayHello();
        // String myName = "Svetlana"; а можно объявить переменную до метода и вставить ее в скобки
        //так красивее
        greet("Svetlana");
        greet("any name");
        greet("any name");
        // name от руки не пишем, делаем ctrl+P и сразу в кавычках печатать
        //пишем кавычки потому что параметр String может быть только в кавычках, это текст
        System.out.println(add(30, 60));
        // если просто  add(30,60); , то подсвечивается желтым - результат игнорируется
        //со всеми методами, которые что-то возвращают, можно что-то делать, например выводить на экран
        // или создаем переменную
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

    // чтобы написать метод, выходим из метода main
    //Example: 1.Create method that will print out "Hello, World!"
    public static void sayHello() { //Чтобы метод работал, нужно вызвать его в методе main, пишем sayHello(); в main
        System.out.println("Hello, World!");
    }

    //2. Создаем метод, который будет приветствовать конкретное имя
    // Когда будем вызывать метод greet, надо обязательно указывать name
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    //метод для сложения чисел
    public static int add(int a, int b) { //в скобках перечисляем, какое кол-во параметров мы хотим,
        //чтобы этот метод имел
        int c = a + b; //либо просто return a + b;
        return c;
    }

    //нельзя создавать полностью идентичные методы, но можно одно название, разные параметры
    //method overloading - перегрузка метода, когда можно иметь методы с одинаковым именем, но разными параметрами
    //public static int add(double a, double b){ если хотим чтобы числа дабл вернулись как инт
    //return (int)(a+b);
    //либо
    public static double add(double a, double b) {
        return a + b;
    }
//чтобы не менять значения, когда учеников 100, можно создать метод в main и вызывать его
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










