package practice.level15;

public class task13 {
    public static void main(String[] args) {
        System.out.println(ApplicationMetrics.getActiveUserCount());
    }
}

class  ApplicationMetrics {
    private static int activeUserCount=10;
       public static int getActiveUserCount() {
           return activeUserCount;
       }
}
