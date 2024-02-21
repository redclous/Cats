import java.security.PublicKey;

public class Cat {
    String name;
    int age;
    double weight;
    String color;
    Cat()
    {
        this.name="";
        this.age=0;
        this.weight=0;
        this.color ="";
    }
    Cat(String name, int age, double weight, String color)
    {
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color = color;
    }
public void meow()
{
    System.out.println("Meow! Meow! Meow!");
}
public void showInfo()
    {
        System.out.println(" my cat's name is " + this.name);
        System.out.println(" May cat is " +this.age+ " years old.");
        System.out.println(" my Cat weights " + this.weight + " kg.");
        System.out.println("my cat is color : " + this.color);
    }
void greeting(String personName)
    {
        System.out.println(personName + "! Please feed " + this.name + "!");
    }
public void grow ()
    {
    if (this.age<2){
        this.weight+=1.2;
    } else if (this.age>4) {
        this.weight += 0.2;
    }
      else
          this.weight +=0.1;
    }
public void age(){
        this.age +=1;
    }
}
