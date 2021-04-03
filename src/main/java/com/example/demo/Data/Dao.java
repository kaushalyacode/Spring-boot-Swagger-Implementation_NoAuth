package com.example.demo.Data;

import com.example.demo.Data.Model.Book;
import java.sql.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Dao {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:mem:lb";

    static final String USER = "sa";
    static final String PASS = "";

    Book book =null;
    Connection conn = null;
    PreparedStatement pstmt = null;
    LinkedList<Book> books =null;
    Collection referencing =null;

    String retrieveBooks = "SELECT * FROM book where stock_quantity <> available_quantity";
    String retrieveReferencing ="SELECT  DISTINCT B.available_quantity,B.BOOK_ID,B.BOOK_TITLE,B.BOOK_ISBN FROM  Reference_book_operation_details R INNER JOIN BOOK B ON R.BOOK_ID = B.BOOK_ID";
    String retrieveLending = "SELECT  DISTINCT B.available_quantity,B.BOOK_ID,B.BOOK_TITLE,B.BOOK_ISBN FROM  Lending_book_operation_details  L INNER JOIN BOOK  B ON L.BOOK_ID = B.BOOK_ID";

    public void Connection() throws SQLException, ClassNotFoundException {
        System.out.println("start conncetion etablishement");
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
    }

    /*using quantity difference logic*/
    public List<Book> getBorrowedBooks() throws SQLException {

        books = new LinkedList<Book>();

        try {
            pstmt = conn.prepareStatement(retrieveBooks);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {

                book =new Book();

                Long id  = rs.getLong("book_id");
                String title = rs.getString("book_title");
                String isbn =rs.getString("book_isbn");
                int availablequanity =rs.getInt("available_quantity");
                int wholeBookSok =rs.getInt("stock_quantity");

                book.setTitle(title);
                book.setId(id);
                book.setAvailableQty(availablequanity);
                book.setIsbn(isbn);
                book.setStockQty(wholeBookSok);

                books.add(book);
            }
            rs.close();
        } catch(SQLException e) {

            e.printStackTrace();

        } finally {
                    pstmt.close();
                    conn.close();
        }
        return books;
    }

    /*get all books that have lended to the students || staff memebers*/
    public Collection getLendedOperationDetails(){

        books = new LinkedList<Book>();

        try {
            pstmt = conn.prepareStatement(retrieveLending);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {

                book =new Book();

                Long id  = rs.getLong("book_id");
                String title = rs.getString("book_title");
                String isbn =rs.getString("book_isbn");
                int availableQty =rs.getInt("available_quantity");

                book.setTitle(title);
                book.setId(id);
                book.setIsbn(isbn);
                book.setAvailableQty(availableQty);

                books.add(book);
            }
            rs.close();
        } catch(SQLException e) {

            e.printStackTrace();

        } catch(Exception e) {

            e.printStackTrace();

        } finally {

            try {
                if(pstmt!=null)
                {
                    pstmt.close();
                }
            } catch(SQLException e)
            {

            } try {
                if(conn!=null)
                {
                    conn.close();
                }
            } catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
        return books;
    }

    /*get all books that have referenced released to the students || staff memebers*/
    public Collection getReferenceOperationDetails(){

        books = new LinkedList<Book>();

        try {
            pstmt = conn.prepareStatement(retrieveReferencing);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {

                book =new Book();

                Long id  = rs.getLong("book_id");
                String title = rs.getString("book_title");
                String isbn =rs.getString("book_isbn");
                int availableQty =rs.getInt("available_quantity");

                book.setTitle(title);
                book.setId(id);
                book.setIsbn(isbn);
                book.setAvailableQty(availableQty);

                books.add(book);
            }
            rs.close();
        } catch(SQLException e) {

            e.printStackTrace();

        } catch(Exception e) {

            e.printStackTrace();

        } finally {

            try {
                if(pstmt!=null)
                {
                    pstmt.close();
                }
            } catch(SQLException e)
            {

            } try {
                if(conn!=null)
                {
                    conn.close();
                }
            } catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
        return books;
    }
}