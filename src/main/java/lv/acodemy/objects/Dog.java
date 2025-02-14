package lv.acodemy.objects;

    class Dog extends Animal {
        public void bark() {
            System.out.println("Barking...");
        }

        @Override
        public void eat() {
            System.out.println("Dog eating!"); //пример полиморфизма, один метод может быть реализован по разному
            //объекты могут вести себя по разному, даже если принадлежат к одному базовому классу
        } 
    }

