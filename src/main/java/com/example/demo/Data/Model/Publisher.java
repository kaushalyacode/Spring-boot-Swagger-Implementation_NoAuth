package com.example.demo.Data.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name ="Publisher" , schema = "public")
public class Publisher extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "publisher_id", nullable = false, updatable = false)
    private int id;

    @Column(name = "publisher_name", nullable = false, updatable = true)
    private String name;

    @Column(name = "publisher_telephone", nullable = true, updatable = true)
    private String telephone;

    @Column(name = "publisher_address", nullable = true, updatable = true)
    private String address;
}