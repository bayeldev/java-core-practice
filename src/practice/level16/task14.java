package practice.level16;

public class task14  {
    public  static void main(String[] args) {
        SecretKeeper secret = new SecretKeeper();
        secret.revealSecret();
    }
}

class SecretKeeper {
    private String hiddenSecret = "Java — круто!";


    void revealSecret() {

        class TrustRevealer {
            void printSecret() {
                System.out.println(hiddenSecret);
            }
        }
        TrustRevealer print = new TrustRevealer();
        print.printSecret();
    }
}
