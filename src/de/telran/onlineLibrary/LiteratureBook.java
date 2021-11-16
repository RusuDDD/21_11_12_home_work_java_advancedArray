package de.telran.onlineLibrary;

public class LiteratureBook extends Book {

    int currencyUnits;

    public LiteratureBook(int id, String title, String author, int price, int currencyUnits) {
        super(id, title, author, price);
        this.currencyUnits = currencyUnits;
    }

    public int getCurrencyUnits() {
        return currencyUnits;
    }

    @Override
    public int getcomputerPrice() {
        return price + currencyUnits;
    }
}
