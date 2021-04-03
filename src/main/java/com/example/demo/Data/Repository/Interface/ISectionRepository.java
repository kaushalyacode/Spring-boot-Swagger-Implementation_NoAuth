package com.example.demo.Data.Repository.Interface;

import com.example.demo.Data.Model.Author;
import com.example.demo.Data.Model.Section;
import org.springframework.data.repository.CrudRepository;

public interface ISectionRepository  extends CrudRepository<Section, Long> {
}