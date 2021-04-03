package com.example.demo.Data.Model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {

    @Column(name = "created_date",updatable = false, columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP")
    private Date createdDate ;

    @Column(name = "updated_date",updatable = true,nullable = true)
    private Date updatedDate;

    @Column(name = "isActive",updatable = true,nullable = false,columnDefinition = "boolean default true")
    private  boolean isActive;

    @Column(name = "isDeleted",updatable = true,nullable = false,columnDefinition = "boolean default false")
    private  boolean isDeleted;
}
