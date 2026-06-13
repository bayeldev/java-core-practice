package practice.level14;

public class task08 {
    public static void main(String[] args) {
        BankAccount first = new BankAccount("Dutch", 500);
        BankAccount second = new BankAccount("Artur");
        second.deposit(1000);
        first.printInfo();
        second.printInfo();
    }
}

class BankAccount {
    String accountOwner;
    int accountBalance;

    BankAccount(String accountOwner, int accountBalance) {
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;

    }

    BankAccount(String accountOwner) {
        this.accountOwner = accountOwner;

    }

    void deposit(int amount) {
        accountBalance += amount;
    }

    void printInfo() {
        System.out.printf("Владелец: %s, баланс: %d", accountOwner, accountBalance);
        System.out.println();
    }
}
