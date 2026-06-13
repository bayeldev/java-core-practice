package practice.level14;



public class task03 {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Философия Java";
        book.pages = 500;
        book.printInfo();
    }
}

class Book {
    String title;
    int pages;

    void printInfo () {
        System.out.printf("Название: %s, страниц: %d", title, pages);
    }
}
