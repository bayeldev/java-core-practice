package practice.level14;

public class task09 {
    public static void main(String[] args) {
        myCat cat = new myCat("Барсик", 3);
        System.out.println("Имя: "+cat.catName+"\n" + "Возраст: " + cat.catAge);
    }
}

class myCat {
    String catName;
    int catAge;

    myCat(String catName, int catAge) {
        this.catName=catName;
        this.catAge=catAge;

    }
}
