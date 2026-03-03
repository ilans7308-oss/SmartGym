abstract class Pet {

protected String name;
protected String ownerName;
protected int age;

public Pet(String n, String on, int a) {
name = n;
ownerName = on;
age = a;
}

public final String toString() {
return "Name: " + name + "\nOwner: " + ownerName +"\nAge: " + age;
}

  
public abstract double feedingAmt();
}


class Cat extends Pet {

private double length;

public Cat(String n, String on, int a, double l) {
super(n, on, a);
length = l;
}

public void display() {
System.out.println(toString());
System.out.println("Length: " + length);
System.out.println("Feeding Amount: " + feedingAmt() + " ml");
}

@Override
public double feedingAmt() {
return 1000 + (10 * age);
}
}


class Dog extends Pet {

private double height;
private double weight;

public Dog(String n, String on, int a, double h, double w) {
super(n, on, a);
height = h;
weight = w;
}

public void display() {
System.out.println(toString());
System.out.println("Height: " + height);
System.out.println("Weight: " + weight);
System.out.println("Feeding Amount: " + feedingAmt() + " ml");
}

@Override
public double feedingAmt() {
return 100 * weight;
}
}


public class TestPet {

public static void main(String[] args) {

Cat c1 = new Cat("Luna", "Sara", 3, 45.5);
Dog d1 = new Dog("Max", "Ahmed", 5, 60.0, 10.0);

System.out.println("----- Cat Info -----");
c1.display();

System.out.println("\n----- Dog Info -----");
d1.display();
}
}