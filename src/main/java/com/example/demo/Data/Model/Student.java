package com.example.demo.Data.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Student" ,schema = "public")
public class Student extends BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id",nullable = false,updatable = false)
    private int id;

    @Column(name = "student_name",updatable = true,nullable = false)
    private String name;

    @Column(name = "student_class",updatable = true,nullable = true)
    private String className;

    @Column(name = "student_index_number",updatable = true,nullable = false)
    private String indexNumber;

    @Column(name = "lended_book_quantity",updatable = true,nullable = true)
    private int lendedBookQty;

    @Column(name = "reference_book_quantity",updatable = true,nullable = true)
    private int referenceBookQty;

}