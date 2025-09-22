import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        // TODO: Implement the bank account menu
        // 1. Create a double variable for balance
        // 2. Create a while loop for the menu
        // 3. Display the menu options
        // 4. Use Scanner to read user input
        // 5. Use switch statement to handle menu choices
        // 6. Implement add money, withdraw money, check balance, and exit functionality

        // setup scanner
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.print("----Bank Account Menu----\n1. Add money\n2. Withdraw money\n3.Check balance\n4. Exit\n");
            int choice = sc.nextInt();
            double balance = 0.0;
            switch (choice)
            {
                case 1:
                    System.out.print("Enter amount to add: ");
                    double add = sc.nextDouble();
                    System.out.println("Added $" + add);
                    balance += add;
                    System.out.println("New balance: $" + balance);
                    System.out.print("\n");
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    System.out.print("\nWithdrew $" + withdraw);
                    balance -= withdraw;
                    if (balance <= 0)
                    {
                        System.out.println("Insufficient funds");
                        balance += withdraw;
                        System.out.print("\n");
                        break;
                    }
                    System.out.println("\nNew balance $" + balance);
                    System.out.print("\n");
                    break;

                case 3:
                    System.out.println("Current balance $" + balance);
                    System.out.print("\n");
                    break;

                case 4:
                    System.out.print("Goodbye!");
                    running = false;
                    break;
            }
        }
    }
}