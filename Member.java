public class Member extends person implements Payable {

private Subscription subscription;

public Member (String name, int id, Subscription subscription) {
super(name, id);
this.subscription =subscription;
}

public Subscription getsubscription(){
return subscription;
}

public double calculatepayment() {
return subscription.getPrice();
}

// Display Member information
public void displayinfo(){
System.out.println("Member name: " +name);
System.out.println("Member Id: " +id);
System.out.println("subscription Type: " +subscription.getType());
System.out.println("subscription Price: " +subscription.getPrice());
}
}