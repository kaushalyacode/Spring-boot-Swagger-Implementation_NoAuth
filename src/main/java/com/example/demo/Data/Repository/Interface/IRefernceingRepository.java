package com.example.demo.Data.Repository.Interface;

import com.example.demo.Data.Model.Author;
import org.springframework.data.repository.CrudRepository;

public interface IRefernceingRepository  extends CrudRepository<Author, Long> {
}