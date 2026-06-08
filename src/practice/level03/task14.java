package practice.level03;

public class task14 {
    public static void main(String[] args) {
        boolean ticketsOnSale = false;
        boolean haveMoneyForTicket = true;
        boolean concertNotCanceled = false;

        boolean canBuy = ticketsOnSale || haveMoneyForTicket && concertNotCanceled;
        boolean canBuyWithNewMeaning = (ticketsOnSale || haveMoneyForTicket) && concertNotCanceled;

        System.out.println(canBuy+"\n"+canBuyWithNewMeaning);
    }
}
