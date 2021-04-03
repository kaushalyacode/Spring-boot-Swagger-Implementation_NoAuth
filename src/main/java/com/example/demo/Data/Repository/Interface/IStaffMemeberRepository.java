package com.example.demo.Data.Repository.Interface;

import com.example.demo.Data.Model.Author;
import com.example.demo.Data.Model.StaffMember;
import org.springframework.data.repository.CrudRepository;

public interface IStaffMemeberRepository extends CrudRepository<StaffMember, Long> {
}