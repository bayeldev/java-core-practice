package practice.level14;

public class task13 {
    public static void main(String[] args) {
        bookMarketV2 first = new bookMarketV2("Дневник памяти");
        bookMarketV2 second = new bookMarketV2("Дорогой Джон", 320);

        System.out.println(first.bookTitle);
        System.out.println(first.pageCount);

        System.out.println(second.bookTitle);
        System.out.println(second.pageCount);
    }
}

class bookMarketV2{
    String bookTitle;
    int pageCount;

    bookMarketV2(String bookTitle){
        this.bookTitle=bookTitle;
        this.pageCount=0;
    }

    bookMarketV2(String bookTitle, int pageCount) {
        this.bookTitle=bookTitle;
        this.pageCount=pageCount;
    }
}
