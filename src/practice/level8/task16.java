package practice.level8;



class MagicalContainer {

    public int magicValue;
}

public class task16 {
    public static void main(String[] args) {

        MagicalContainer myTreasureChest = new MagicalContainer();


        myTreasureChest.magicValue = 15;


        attemptToEnchantContainer(myTreasureChest);

        System.out.println(myTreasureChest.magicValue);
    }

    public static void attemptToEnchantContainer(MagicalContainer container) {

        container.magicValue = 99;

        container = new MagicalContainer();
        container.magicValue = 42;
    }
}
