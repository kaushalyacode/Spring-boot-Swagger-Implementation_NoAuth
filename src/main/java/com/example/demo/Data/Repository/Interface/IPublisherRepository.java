package com.example.demo.Data.Repository.Interface;

import com.example.demo.Data.Model.Author;
import com.example.demo.Data.Model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface IPublisherRepository extends CrudRepository<Publisher, Long> {
}