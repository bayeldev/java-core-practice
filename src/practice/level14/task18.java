package practice.level14;

public class task18 {
    public static void main(String[] args) {
        BookV2 standartBook = new BookV2();
        System.out.println(standartBook.bookTitle);
        System.out.println(standartBook.pageCount);
    }

}
class BookV2 {
    String bookTitle="Без название";
    int pageCount=100;

}
