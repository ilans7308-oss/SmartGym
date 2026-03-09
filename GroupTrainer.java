public class GroupTrainer extends Trainer implements Payable {
private double monthlySalary;

public class GroupTrainer(String name, int id, String specialty, double monthlySalary) {
super(name,id,specialty);
this.monthlySalary = monthlySalary; }

public double calculatePayment() {
return monthlySalary; }
}

