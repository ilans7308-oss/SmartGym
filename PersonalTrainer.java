public class PersonalTrainer extends Trainer implements Payable {
private double sessionRate;
private int sessions;

public class PersonalTrainer(String name, int id, String specialty, double sessionRate, int sessions) {
super(name,id,specialty);
this.sessionRate = sessionRate;
this.sessions = sessions; }

public double calculatePayment() {
return sessionRate * sessions; }
}

