//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello Programming! ");
//        int age = 10;
//        System.out.println("  with IF loop:");
//        if (age <=18) {
//            System.out.println("it's NOT ok yet");
//        } else {
//            System.out.println("ok to sell tabacco");
//        }
//        System.out.println("  now with while loop:");
//        while (age<18) {
//            System.out.println("your are too young!");
//            age ++;
//            }
//        System.out.println("it's ok to buy alcohol now!");
//        Calc Math = new Calc();
//        int summa = Math.add(5,6);
//        System.out.println(summa);
//        System.out.println(Math.multiply(4,3));
//        Math.absolute(-3.68);
//        System.out.println(Math.absolute(-365.4));
//        System.out.println(Math.absolute(2));
//        System.out.println(Math.absolute(0));
//        System.out.println("  now with FOR loop:");
//        for (int i =0; i<10; i++) {
//            System.out.println(i);
//        }

        Cat vaska = new Cat();
        vaska.name = "Vaska";
        vaska.age=4;
        vaska.weight = 4.5;
        vaska.color = "Black";
        Cat murzik = new Cat("Murzik",2,3, "grey");

        System.out.println("Моего кота зовут "+ vaska.name);
        System.out.println("My cat weights " + vaska.weight + " kg.");
        System.out.println("He's "  + vaska.age + " years old");
        vaska.age += 1;

        System.out.println(murzik.name+ " is "  + murzik.age + " years old");
        murzik.age ++;
        System.out.println(murzik.name + " is "  + murzik.age + " years old");
        murzik.meow();
        murzik.greeting("Tanya");
        System.out.println("===============");
        murzik.showInfo();
        System.out.println("===============");
        vaska.showInfo();
        System.out.println("=============== AFTER GROW:");
        vaska.age();
        vaska.grow();
        vaska.showInfo();
    }
}