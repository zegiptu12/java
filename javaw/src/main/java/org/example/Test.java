package org.example;

/**
 * Klasa Test służąca do przetwarzania JSON-ów.
 */
public class Test {
    /**
     * Metoda przetwarza JSON-y dla książki i ceny.
     *
     * @param bookJson  JSON dla książki
     * @param priceJson JSON dla ceny
     */
    public void processJsonStrings(String bookJson, String priceJson) {
        System.out.println("Book JSON: " + bookJson);
        System.out.println("Price JSON: " + priceJson);
    }
}
