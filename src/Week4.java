public class Week4 {
static void withdraw() {

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {

            System.out.println("Invalid amount!");

        } else if (amount > balance) {

            System.out.println("Insufficient balance!");

        } else {

            balance = balance - amount;
            withdrawals = withdrawals + amount;

            lastTransaction = "Withdrawal";
            lastAmount = amount;

            System.out.println("Withdrawal successful!");
        }
    }
}
