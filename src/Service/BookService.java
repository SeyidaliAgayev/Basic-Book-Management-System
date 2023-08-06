package Service;

import Data.GlobalData;
import Util.InputUtil;
import Util.MenuUtil;
import model.Book;
import model.MethodsOfSystem;

import java.awt.*;

public class BookService implements MethodsOfSystem{
    @Override
    public void addBook() {
        int bookCount = InputUtil.InputRequiredInt("How many book will be added: ");

        if (GlobalData.books == null) {
            GlobalData.books = new Book[bookCount];
            for (int i = 0; i < GlobalData.books.length; i++) {
                GlobalData.books[i] = fillBook(i);
            }
        } else {
            Book[] tempBook = GlobalData.books;
            GlobalData.books = new Book[GlobalData.books.length + bookCount];
            for (int i = 0; i < tempBook.length; i++) {
                GlobalData.books[i] = tempBook[i];
            }
            for (int i = tempBook.length; i < GlobalData.books.length; i++) {
                GlobalData.books[i] = fillBook(i);
            }
            System.out.println("Books have been added successfully!");
        }
    }

    public void updateBook() {
        int id = InputUtil.InputRequiredInt("Which book do you want to update: ");
        for (int i = 0; i < GlobalData.books.length; i++) {
            if (GlobalData.books[i].getId() == id) {
                System.out.println("NOTE: If you don't want to change selected field just press enter!");
                String name = InputUtil.InputRequiredString("Name: ");
                if (name.equals("")) {

                } else {
                    GlobalData.books[i].setName(name);
                }
                String description = InputUtil.InputRequiredString("Description: ");
                if (description.equals("")) {

                } else {
                    GlobalData.books[i].setDescription(description);
                }
                String author = InputUtil.InputRequiredString("Author: ");
                if (author.equals("")) {

                } else {
                    GlobalData.books[i].setAuthor(author);
                }
            }

        }
    }

    public Book fillBook(int i) {
        System.out.println("-------------------------\n");
        System.out.println(i+1 + ".Book\n");
        int id = InputUtil.InputRequiredInt("ID: ");
        String name = InputUtil.InputRequiredString("Name: ");
        String description = InputUtil.InputRequiredString("Description: ");
        String author = InputUtil.InputRequiredString("Author: ");

        return new Book(id,name,description,author);

    }
    @Override
    public void displayBook() {
        System.out.println("--------------- Book List -----------------");
        if (GlobalData.books != null) {
            for (int i = 0; i < GlobalData.books.length; i++) {
                System.out.println(GlobalData.books[i].getInfo());
            }
        } else {
            System.out.println("-----------------------\n" +
                               "Book has not yet!\n" +
                               "-----------------------");
        }
    }
    @Override
    public void searchBook() {
        String key = InputUtil.InputRequiredString("Search book(name/author): ");
        boolean isFind = false;

        for (int i = 0; i < GlobalData.books.length; i++) {
            if (GlobalData.books[i].getName().contains(key) ||
                GlobalData.books[i].getAuthor().contains(key)) {
                isFind = true;
                System.out.println(GlobalData.books[i].getInfo());
            }
        }
        if (!isFind) {
            System.out.println("Book doesn't exist!");
        }
    }



    public Book findById(int id) {
        Book book = new Book();
        if (GlobalData.books == null) {
            System.out.println("----------------------\n" +
                               "Book doesn't exist!\n" +
                               "----------------------");
        } else {
            System.out.println("NOTE: If you don't want to change the selected field, just press enter");
            for (int i = 0; i < GlobalData.books.length; i++) {
                if (GlobalData.books[i].getId() == id) {
                    book = GlobalData.books[i];
                    break;
                }
            }
        }
        return book;
    }


    @Override
    public void removeBook() {
        int id = 0;
        Book book = findById(id);
        book.getInfo();

        Book[] tempBook = GlobalData.books;
        GlobalData.books = new Book[GlobalData.books.length-1];

        for (int i = 0; i < GlobalData.books.length; i++) {
            if (tempBook[i].getId() < book.getId()) {
                GlobalData.books[i] = tempBook[i];
            } else {
                GlobalData.books[i] = tempBook[i+1];
            }
            System.out.println("Deleted successfully: " + GlobalData.books[i]);
        }
    }
}
