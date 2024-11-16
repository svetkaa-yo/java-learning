package lv.acodemy;

public class Practice {
    public static void main(String[] args) {
        // Write a for loop that prints numbers from 1 to 10 in separate lines.
        for (int i=1; i<11; i++){
            System.out.println(i);}
        // Using for loop print all even numbers from 2 to 20.
        for (int i=2; i<21; i++){
            if(i % 2 == 0){ //% остаток от деления на два == сравнение
                System.out.println(i);}}
        //без if
        for (int i=2; i<21; i+=2){ //увеличивается на 2 или i = i+2
            System.out.println(i);}
        // Using for loop print the multiplication table of 5 to 5*10, 5*1, 5*2, etc
        for (int i=5; i<51; i= i+5){
            System.out.println(i);}
        //или
        for (int i=1; i<11; i++){
            System.out.println("5 * "+i+"= "+i*5);}




    }
}
