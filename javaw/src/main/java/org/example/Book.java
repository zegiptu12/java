package org.example;

/**
 * Klasa reprezentująca książkę.
 */
public class Book {
    private String author;
    private String title;

    /**
     * Konstruktor tworzący obiekt klasy Book.
     *
     * @param author autor książki
     * @param title  tytuł książki
     */
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    /**
     * Metoda zwracająca autora książki.
     *
     * @return autor książki
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Metoda ustawiająca autora książki.
     *
     * @param author autor książki
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Metoda zwracająca tytuł książki.
     *
     * @return tytuł książki
     */
    public String getTitle() {
        return title;
    }

    /**
     * Metoda ustawiająca tytuł książki.
     *
     * @param title tytuł książki
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
