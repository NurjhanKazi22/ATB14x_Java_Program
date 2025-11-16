package Exercises.Test16112025;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdraw failed.");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }


        public static void main(String[] args) {
            BankAccount acc = new BankAccount(1000);

            acc.deposit(500);
            System.out.println("Balance after deposit: " + acc.getBalance());

            acc.withdraw(200);
            System.out.println("Balance after withdrawal: " + acc.getBalance());
        }


}
