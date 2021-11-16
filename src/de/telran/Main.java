package de.telran;

import de.telran.onlineLibrary.BestSeller;
import de.telran.onlineLibrary.Book;
import de.telran.onlineLibrary.LiteratureBook;
import de.telran.onlineLibrary.TechnicalBook;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Book books = new Book(1, "My first Project", "Trifanov Perdunovici", 25);
        TechnicalBook books1 = new TechnicalBook(2, "More and More", "Jack Varabey", 100,
                "Growing flowers by test-tube");
        LiteratureBook books2 = new LiteratureBook(3, "Maria Mirabela", "George Cluny", 25, 10);
        BestSeller books3 = new BestSeller(4, "The Pigs", "Maria Anthonela", 356, 25, 2.5);

        Book[] manybooks = {books, books1, books2, books3};

        for (int i = 0; i < manybooks.length; i++) {

            System.out.println("The Id is" + " " + manybooks[i].getId() + " " + "With the title" + " "
                    + manybooks[i].getTitle() + " " + "and with the Author" + " " + manybooks[i].getAuthor()
                    + " " + "wich price is " + " " + manybooks[i].getcomputerPrice());
        }
    }
}
