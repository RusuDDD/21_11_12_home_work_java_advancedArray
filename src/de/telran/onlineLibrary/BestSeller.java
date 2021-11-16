package de.telran.onlineLibrary;

public class BestSeller extends LiteratureBook {

    double coef;

    public BestSeller(int id, String title, String author, int price, int currencyUnits, double coef) {
        super(id, title, author, price, currencyUnits);
        this.coef = coef;
    }

    public double getCoef() {
        return coef;
    }

    @Override
    public int getPrice() {
        return (int) (price * coef) + currencyUnits;
    }
}
