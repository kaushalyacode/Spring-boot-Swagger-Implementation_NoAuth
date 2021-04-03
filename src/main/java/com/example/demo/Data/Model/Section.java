package com.example.demo.Data.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Section" ,schema = "public")
public class Section extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "section_id",nullable = false,updatable = false)
    private int id;

    @Column(name = "section_name",updatable = true,nullable = false)
    private String name;

    @Column(name ="return_time_in_hr",updatable = true ,nullable = false)
    private int returnTimeInHours;
}