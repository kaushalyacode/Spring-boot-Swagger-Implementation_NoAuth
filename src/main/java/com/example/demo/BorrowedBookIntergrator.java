package com.example.demo;

import com.example.demo.Data.Dao;
import com.example.demo.Data.Model.Book;

import java.sql.SQLException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class BorrowedBookIntergrator
{
    public Collection<Book> intergrateBorrowedBookResults() throws SQLException, ClassNotFoundException {

        Dao data = new Dao();
        data.Connection();

        LinkedList<Book> removebles = new LinkedList<Book>();

        LinkedList<Book> refBook = (LinkedList<Book>) data.getReferenceOperationDetails();

        data.Connection();

        LinkedList<Book> lendBook = (LinkedList<Book>)  data.getLendedOperationDetails();

        /*remove lending books that are al ready in referenced book list*/
        refBook.forEach(dataBook -> {
            lendBook.forEach(lend -> {
                if (dataBook.getId().equals(lend.getId())) {
                  removebles.add(lend);
                }
            });
        });
        lendBook.removeAll(removebles);
        refBook.addAll(lendBook);
        return refBook;
    }
}
