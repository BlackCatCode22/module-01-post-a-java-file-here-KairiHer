import java.awt.*;

public class AwesomeJavaProgram {

    public static void main(String[] args) {

        int myInt = 7;
        double shoeSize = 9.5;
        char myInitial = 'K';

        String myName = "John";

        double result = myInt * shoeSize;

        System.out.println(myName.toUpperCase());
    }

    public static void main(String[] args){

        burp();
        printName();
        System.out.println(printName("Kairi", 3));
        for (int i = 0; i < 10; i++) {
            System.out.println("These pretzels are making me thirsty");
        }
        Cat_COJ.dingDong();
        Cat_COJ.meow();
        Cat_COJ myCat = new Cat_COJ();
        myCat.name = "Freddie";
        myCat.age = 5;
        myCat.meow();

        Cat_COJ anotherCat = new Cat_COJ();
        anotherCat.name = "Stelarc";
        anotherCat.age = 5;

        System.out.println(myCat.age);
    }

    private static void burp() {
        System.out.println("Buuurrrp");
    }

    private static void printName(String name, int number) {

    // This works for numbers also //
        if (name.equals("Kairi")) {
            System.out.println("This girl is awesome!!");
        }

        else if (name.equals("Larry")) {
            System.out.println("This guy is ok I guess...");
        }

        else {
            System.out.println("I don't know this guy at all");
        }

        return "My name is " + name;
    }


}