package practice.level10;

public class task13 {
    public static void main(String[] args){
        TrafficSignalState first = TrafficSignalState.RED;

        System.out.println(first);

    }

    enum TrafficSignalState {
        RED, YELLOW, GREEN
    }
}
