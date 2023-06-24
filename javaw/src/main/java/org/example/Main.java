package org.example;

import com.google.gson.Gson; // Dodaj ten import

/**
 * Główna klasa służąca do uruchamiania programu.
 */
public class Main {
    /**
     * Główna metoda programu.
     *
     * @param args argumenty przekazane wiersza poleceń
     */
    public static void main(String[] args) {
        Book book = new Book("Larsson", "Millennium");
        Feature feature = new Feature(1, 0.1F);
        Gson gson = new Gson();
        String bookJson = gson.toJson(book);
        String priceJson = gson.toJson(feature);
        System.out.println(priceJson);
        System.out.println(" ");
        System.out.println(bookJson);

        Test test = new Test();
        test.processJsonStrings(bookJson, priceJson);
    }
}
