package practice.level08;

public class task17 {
    public static void main(String[] args) {

        VillageResident newVillager = new VillageResident();

        newVillager.residentName = "Иван";

        System.out.println(newVillager.residentName);
        newVillager.printName();

    }


}

class VillageResident {
    public String residentName;


    void printName() {
        System.out.println(residentName);
    }


}
