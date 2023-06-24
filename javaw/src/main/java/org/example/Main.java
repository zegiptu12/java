package org.example;

import com.google.gson.Gson; // Add this import statement

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Larsson", "Millennium");
        Gson gson = new Gson();
        String bookJson = gson.toJson(book);
        System.out.println(" ");
        System.out.println(bookJson);
    }
}
