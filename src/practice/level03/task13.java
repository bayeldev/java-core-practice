package practice.level03;

public class task13 {
    public static void main(String[] args) {
        boolean toTheSea=true;
        boolean hasPlaneTickets = false;
        boolean hasHotelRooms = true;

        boolean vacationHappened=toTheSea || hasPlaneTickets && hasHotelRooms;
        System.out.println(vacationHappened);
    }

}
