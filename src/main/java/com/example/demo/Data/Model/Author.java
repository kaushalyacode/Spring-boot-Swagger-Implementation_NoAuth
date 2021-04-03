package com.example.demo.Data.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name ="Author" , schema = "public")
public class Author extends BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id",nullable = false,updatable = false)
    private int id;

    @Column(name = "author_name",updatable = true,nullable = false)
    private String name;

    @Column(name = "author_mobile",updatable = true,nullable = true)
    private String mobile;

    @Column(name = "author_telephone",updatable = true,nullable = true)
    private String telephone;
}