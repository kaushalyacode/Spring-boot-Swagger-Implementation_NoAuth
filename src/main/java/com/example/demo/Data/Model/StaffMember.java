package com.example.demo.Data.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Staff_Member" ,schema = "public")
public class StaffMember extends BaseEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id",nullable = false,updatable = false)
    private int id;

    @Column(name = "memeber_name",updatable = true,nullable = false)
    private String name;

    @Column(name = "memeber_telephone",updatable = true,nullable = true)
    private String telephone;

    @Column(name = "memeber_mobile",updatable = true,nullable = true)
    private String mobile;

    @Column(name = "memeber_nic",updatable = true,nullable = false)
    private String nic;

    @Column(name = "lended_book_quantity",updatable = true,nullable = true)
    private int lendedBookQty;

    @Column(name = "reference_book_quantity",updatable = true,nullable = true)
    private int referenceBookQty;
}