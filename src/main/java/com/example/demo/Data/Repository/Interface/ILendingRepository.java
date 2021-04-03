package com.example.demo.Data.Repository.Interface;

import com.example.demo.Data.Model.Author;
import com.example.demo.Data.Model.Lending;
import org.springframework.data.repository.CrudRepository;

public interface ILendingRepository extends CrudRepository<Lending, Long> {
}