package model;
public class Book {
    private int id;
    private String name;
    private String description;
    private String author;

    public Book() {
    }

    public Book(int id, String name, String description,String author) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public boolean setName(String name) {
        this.name = name;
        return false;
    }

    public boolean setDescription(String description) {
        this.description = description;
        return false;
    }

    public boolean setAuthor(String author) {
       this.author = author;
        return false;
    }

    public String getInfo() {
        return id + ". Book\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Description: " + description + "\n" +
                "Author: " + author + "\n";
    }
}

