package practice.level02;

public class task16 {
    public static void main(String[] args) {
        int account1 = 100, account2 = 200;
        account2 = account2 + account1;
        account1 = 0;
        account1 = account1 + 50;
        System.out.println(account1);
        System.out.println(account2);

    }
}
