package practice.level16;

public class task08 {
    public static void main(String[] args) {

        Book book = new Book.Builder()
                .setTitle("Java Basics")
                .setPages(500)
                .build();

        book.printInfo();
    }
}

class Book {
    private String bookTitle;
    private int pageCount;

    private Book(Builder builder) {
        this.bookTitle = builder.bookTitle;
        this.pageCount = builder.pageCount;
    }

    public void printInfo() {
        System.out.println("Book: " + bookTitle + ", " + pageCount + " pages.");
    }

    public static class Builder {
        private String bookTitle;
        private int pageCount;

        public Builder setTitle(String title) {
            this.bookTitle = title;
            return this;
        }

        public Builder setPages(int pages) {
            this.pageCount = pages;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}