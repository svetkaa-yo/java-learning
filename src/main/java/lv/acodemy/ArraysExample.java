package lv.acodemy;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        //arrays - это структура данных, которая позволяет хранить фиксированное кол-во элементов одного типа
        //объявление массива выглядит так:
        int[]numbers; //это будет массив числовой, только целые числа
        String[]names; //массив строк
        //теперь надо указать размер массива
        numbers = new int[5]; //5 элементов и сейчас там нули [0,0,0,0,0]
        names = new String [3]; //здесь будут нулл [null,null,null]
        //изменить размер массива уже нельзя
        System.out.println(Arrays.toString(names));
        //можно сразу заполнить массив при обьявлении
        int[]numberz = {1,2,3,4,5};
        //можно вместо значений подсовывать другие, но увеличивать уменьшать нельзя
        String[]namez = {"John","Alex","Merry","Bob"};

        //element access - доступ к элементам массива
        //в программировании счет начинается с 0 , не с единицы, поэтому Джон будет элемент ноль
        //можем попросить у слова букву
        String myName = "John";
        System.out.println(myName.charAt(0));
        //доступ к элементам массива
        System.out.println(namez[2]); //можем просто распечатать либо присвоить новое значение
        //обращаемся в элементу массива по его индексу
        namez[2] =  "Jerry";
        System.out.println(Arrays.toString(namez));
        //если написать так
       // namez[4] = "Hello"; то будет exception - ошибка, т.к. нет четвертого элемента в массиве
        //можем заправить размер массива, но помним что элемента 4, а индекс 3, надо в голове отнимать 1 от распечатанного
        System.out.println(namez.length);




    }
}
