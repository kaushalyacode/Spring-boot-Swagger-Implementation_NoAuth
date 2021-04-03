package com.example.demo.Data.Repository.Interface;

import com.example.demo.Data.Model.Author;
import com.example.demo.Data.Model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepository extends CrudRepository<Category, Long> {
}