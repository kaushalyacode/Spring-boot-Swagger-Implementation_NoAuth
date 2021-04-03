package com.example.demo.Data.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Book" ,schema = "public")
public class Book extends BaseEntity {

    @Id
    @Column(name = "book_id",updatable = false,nullable = false)
    private Long id;

    @Column(name = "book_title",updatable = true,nullable = false)
    private String Title;

    @Column(name = "book_isbn",updatable = false,nullable = false)
    private String isbn;

    @Column(name = "stock_quantity",updatable = true,nullable = false)
    private int stockQty;

    @Column(name = "borrow_quantity",updatable = true,nullable = false)
    private int borrowedQty;

    @Column(name = "available_quantity",updatable = true,nullable = false)
    private int availableQty;

    /*many to one unidirectional*/
    @ManyToOne(optional = false)
    @JoinColumn(name="publisher_id")
    private Publisher publisher;

    /*many to one unidirectional*/
    @ManyToOne(optional = false)
    @JoinColumn(name="category_id")
    private Category category;

    /*many to many unidirectionl*/
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="author_book", joinColumns=@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="author_id"))
    private Set<Author> authors;

    /*many to many unidirectionl*/
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="section_book", joinColumns=@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="section_id"))
    private Set<Section> section;
}