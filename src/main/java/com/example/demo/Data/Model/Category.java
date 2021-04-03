package com.example.demo.Data.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Category" ,schema = "public")
public class Category extends BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id",nullable = false,updatable = false)
    private int id;

    @Column(name = "category_name",updatable = true,nullable = false)
    private String name;
}