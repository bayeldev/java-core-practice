package practice.level16;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Library firstBook = new Library();

        Library.Scroll scroll =  firstBook.new Scroll("Ancient Runes");

        scroll.revealTitle();
    }
}

class Library {
//    public String addScroll(String scrollTitle) {
//
//    }

    class Scroll {
        private String scrollTitle;

        Scroll(String scrollTitle) {
            this.scrollTitle=scrollTitle;
        }

        void revealTitle() {
            System.out.println("Название: "+scrollTitle);
        }
    }
}
