package lv.acodemy.objects;

public class ObjectExamples {
    public static void main(String[] args) {
        //Encapsulation (Getters/setters) - data access control by methods
        //Inheritance (наследование) - one class can inherit methods from another class
        //Polymorphism - one method can work differently for different object types
        //Abstraction - hiding some implementation details

        //It all helps in creating program, which is easier to read, understand, change and scale(масштабировать)
        // Создадим объект на основе класса Car
        Car audi = new Car("Blue","RS6");
        audi.start();
        System.out.println(audi.toString()); //toString автоматически выполняется, мы его переопределили в классе Car
        //пример полиморфизма, в методе принтлн вызывается метод тустринг, и для обьекта ауди
        // метод тустринг будет выдавать нами указанные данные, а не базовый тустринг
        //Создадим значения полей цвет и модель
//        audi.color = "Blue"; это если паблик , но мы поменяли на private
//        audi.model = "RS6";
        audi.setModel("RS6");
        audi.setColor("Blue");

        System.out.println(audi);

        Car bmwBeshka = new Car();
        bmwBeshka.start();
        bmwBeshka.setColor("Grey");
        bmwBeshka.setModel("125");
        System.out.println(bmwBeshka);

        //Getters - методы, которые возвращают значения переменных
        //Setters - методы, которые изменяют значения переменных
        // Print text: My car model is: %s, and color is: %s
        String message = String.format("My car model is: %s, and color is: %s.", bmwBeshka.getModel(), bmwBeshka.getColor());
        System.out.println(message);
        //либо
        System.out.println(String.format("My car model is: %s, and color is: %s.", bmwBeshka.getModel(), bmwBeshka.getColor()));

        Dog theSharik = new Dog();
        theSharik.eat();
        theSharik.bark(); //dog унаследовала методы от animal
        //но dog может менять, то как методы выполняются


    }
}
