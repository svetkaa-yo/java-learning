package lv.acodemy;

public class LoopExamples {
    public static void main(String[] args) {
        //for loop
        String[]shoppingList = {"Bread","Milk","Eggs","Fruits"}; //add manually
    for(int i=0; i < shoppingList.length;i++) {
        System.out.println("Buy "+ shoppingList[i]);}
        System.out.println("Goes next\n");
        //for-each loop
    for (String s: shoppingList) {
        System.out.println("Buy " + s);}
        System.out.println("Goes next\n");
        //While loop
    int i=0;
    while (i<shoppingList.length){
        System.out.println("Buy "+ shoppingList[i]); i++;}
        System.out.println("Goes next\n");
        //Do-while loop
    int j=0;
    do {System.out.println("Buy "+ shoppingList[j]);j++;}
    while (j<shoppingList.length);
        System.out.println("Goes next\n");
        //logical statement
    boolean x=1<5 && 6>3 && 3>2; //AND
        //true only if both sides true
        System.out.println(x);
    boolean y=2<5||3<2; // OR
        //true, if only one true
        System.out.println(y);






    }
}
