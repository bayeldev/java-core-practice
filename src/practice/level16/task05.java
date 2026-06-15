package practice.level16;

public class task05 {
    public static void main(String[] args) {
        SpellBook.BasicCharm firstCharm = new SpellBook.BasicCharm();

        firstCharm.castSpell();
    }
}

class SpellBook{

   static class BasicCharm {
        void castSpell() {
            System.out.println("Hello from static basic charm!");
        }
    }
}