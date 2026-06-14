package practice.level15;

public class task08 {



    public static void main(String[] args) {
        DigitalLibraryManager new1 = new DigitalLibraryManager();
        new1.announceOpening();
        new1.conductStaffMeeting();
        new1.manageBookInventory();

    }
}

class DigitalLibraryManager {
    public void announceOpening() {
        System.out.println("Библиотека открыта для посетителей!");
    }

    protected void conductStaffMeeting() {
        System.out.println("Проведено собрание персонала библиотеки.");
    }
    void manageBookInventory() {
        System.out.println("Инвентаризация книг завершена.");
    }
    private void handleFinancialAudits() {
        System.out.println("Финансовый аудит успешно завершен.");
    }
}