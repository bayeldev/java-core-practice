package practice.level7;

public class task14 {
    public static void main(String[] args) {
        String[][] guestLists = new String[3][];
        guestLists[0] = new String[] {"Эмили", "Ажара"};
        guestLists[1] = new String[] {"Актан", "Аймир", "Ислам"};
        guestLists[2] = new String[] {"БЕКЖАН"};

        for(String[] i :guestLists) {

            for(String j:i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
