public class Trainer extends Person {
protected String specialty;

public Trainer(String name, int id, String specialty) {
super(name,id);
this.specialty = specialty; }

public String getSpecialty() {
return specialty; }

public void displayInfo() {
System.out.println("Trainer name: " + name);
System.out.println("ID: " + id);
System.out.println("Specialty: " + specialty); }
}