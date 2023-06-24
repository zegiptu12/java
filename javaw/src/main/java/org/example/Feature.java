package org.example;

/**
 * Klasa reprezentująca funkcję.
 */
public class Feature {
    private int price;
    private float discount;

    /**
     * Konstruktor tworzący obiekt klasy Feature.
     *
     * @param price    cena funkcji
     * @param discount zniżka funkcji
     */
    public Feature(int price, float discount) {
        this.price = price;
        this.discount = discount;
    }

    /**
     * Metoda zwracająca cenę funkcji.
     *
     * @return cena funkcji
     */
    public int getPrice() {
        return price;
    }

    /**
     * Metoda ustawiająca cenę funkcji.
     *
     * @param price cena funkcji
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Metoda zwracająca zniżkę funkcji.
     *
     * @return zniżka funkcji
     */
    public float getDiscount() {
        return discount;
    }

    /**
     * Metoda ustawiająca zniżkę funkcji.
     *
     * @param discount zniżka funkcji
     */
    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
