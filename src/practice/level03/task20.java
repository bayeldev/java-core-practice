package practice.level03;

public class task20 {
    public static void main(String[] args) {
        int visitorAge = 16;
        String ticketCategory = (visitorAge<7) ? "Детский" : (visitorAge>=7 && visitorAge<=17) ? "Подростковый" : (visitorAge>=18 && visitorAge <=64) ? "Взрослый" : "Пенсионный";
        System.out.println(ticketCategory);
    }
}

