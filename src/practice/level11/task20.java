package practice.level11;

public class task20 {
    public static void main(String[] args) {
        processInitialRequest();
    }
    public static void processInitialRequest () {
        handleIntermediateStep();
    }
    public static void handleIntermediateStep () {
        executeFinalAction();
    }
    public static void executeFinalAction () {
        int[] temporaryData = {100,200,300};
        System.out.println(temporaryData[10]);
    }
}
