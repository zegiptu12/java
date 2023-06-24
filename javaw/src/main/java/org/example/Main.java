package org.example;

import com.google.gson.Gson; // Add this import statement

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Larsson", "Millennium");
        Feature feature = new Feature( 1, 0.1F );
        Gson gson = new Gson();
        String bookJson = gson.toJson(book);
        String priceJson = gson.toJson(feature);
        System.out.println(priceJson);
        System.out.println(" ");
        System.out.println(bookJson);
    }
}
