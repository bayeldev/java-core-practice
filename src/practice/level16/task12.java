package practice.level16;

public class task12 {
    public static void main(String[] args) {
        SecureLab lab = new SecureLab();
        lab.revealSecret();
    }

}
class SecureLab {
    private String classifiedSecret = "Секрет раскрыт!";


    void revealSecret() {
        Runnable reveal = new Runnable() {
            @Override
            public void run() {
                System.out.println(classifiedSecret);
            }
        };
        reveal.run();
    }

}
