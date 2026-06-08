package practice.level03;

public class task16 {
    public static void main(String[] args) {
        int yourAge = 25;
        boolean hasJob = true;
        boolean hasCreditHistory=false;
        boolean hasGuarantor=true;

        boolean firstRule= ((yourAge > 21) && hasJob) || (hasCreditHistory && hasGuarantor);
        boolean secondRule= ((yourAge>21) && hasJob) || (hasCreditHistory && hasGuarantor);

        System.out.println(firstRule+"\n"+secondRule);
    }
}
