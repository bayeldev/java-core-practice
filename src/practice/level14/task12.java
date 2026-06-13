package practice.level14;

public class task12 {

    public static void main(String[] args) {
        bookMarket first = new bookMarket("Грокаем алгоритмы", 352);
        first.printInfo();
        bookMarket second = new bookMarket("Спеши любить", 224);
        second.printInfo();
        bookMarket third = new bookMarket();
        third.printInfo();
    }


}


class bookMarket {
    private String bookTitle;
    private int numberOfPages;

    bookMarket(String bookTitle, int numberOfPages) {
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
    }

    bookMarket() {
        this.bookTitle = "Без название";
        this.numberOfPages = 0;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    void printInfo() {
        System.out.printf("Книга: %s, страниц: %d\n", getBookTitle(), getNumberOfPages());
    }
}
