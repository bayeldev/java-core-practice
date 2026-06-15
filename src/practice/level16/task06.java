package practice.level16;

public class task06 {
    public static void main(String[] args) {

        Vault.SecurityDisplayUnit s1 = new Vault.SecurityDisplayUnit();
        s1.showSecurityLevel();
    }
}

class Vault {
    private static int securityLevel=100;

    static class SecurityDisplayUnit {
        void showSecurityLevel() {
            System.out.println(securityLevel);
        }
    }
}
