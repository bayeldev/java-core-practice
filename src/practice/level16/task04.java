package practice.level16;

public class task04 {
    public static void main(String[] args) {
        House h1 = new House("Kurmanjan Datka 200");
        House.Room r1 = h1.new Room("Kitchen");

        r1.printAddres();
    }
}

class House {
    private String houseAddress;

    House(String houseAddress) {
        this.houseAddress=houseAddress;
    }

    class Room {
        private String roomIdentifier;
        Room(String roomIdentifier) {
            this.roomIdentifier=roomIdentifier;
        }

        void printAddres () {
            System.out.println("Room Identifier: " + this.roomIdentifier +"\n" + "House Address: "+House.this.houseAddress);
        }
    }
}
