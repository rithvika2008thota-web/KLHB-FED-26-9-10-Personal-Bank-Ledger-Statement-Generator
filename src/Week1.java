public class Week1 {
public static void main(String[] args) {

System.out.println("===== PERSONAL BANK LEDGER =====");

System.out.print("Enter your name: ");
name = sc.nextLine();

System.out.print("Enter account number: ");
accountNumber = sc.nextLine();

while (true) {
System.out.println("\n===== BANK MENU =====");
System.out.println("1. Dashboard");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Ledger");
System.out.println("5. Bank Statement");
System.out.println("6. Exit");
System.out.print("Enter choice: ");
  int choice = sc.nextInt();

  switch (choice) {
  case 1:
  dashboard();
  break;

  case 2:
  deposit();
  break;

  case 3:
  withdraw();
  break;

  case 4:
  ledger();
  break;

  case 5:
  statement();
  break;

case 6:
  System.out.println("Thank you!");
  return;
 default:
 System.out.println("Invalid choice!");
            }
        }
  }
    }
