package practice.level8;

public class task18 {
    public static void main(String[] args) {
        CustomerBankAccount myPrivateAccount = new CustomerBankAccount();

        myPrivateAccount.depositMoney(1000);

    }


}

class CustomerBankAccount {
    private int accountBalance;

    public void  depositMoney(int amountToDeposit) {
        accountBalance += amountToDeposit;
    }

}
