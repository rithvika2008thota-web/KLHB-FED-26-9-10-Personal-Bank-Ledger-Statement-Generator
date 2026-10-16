public class Week3 {
  static void deposit(){
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();
        if (amount > 0) {
balance = balance + amount;
deposits = deposits + amount;

lastTransaction = "Deposit";
lastAmount = amount;
System.out.println("Deposit successful!");
 } else {
System.out.println("Invalid amount!");
        }
    }
