package com.example.demo.Services.Infrastructure;

import com.example.demo.Data.Model.Author;
import com.example.demo.Data.Repository.Interface.IAuthorRepository;
import com.example.demo.Services.Interface.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;

/*Not relevent to assignment*/
public class AuthorService implements IAuthorService {

    @Autowired
    IAuthorRepository authorRepository;

    public void AddAuthor(Author author)
    {
        authorRepository.save(author);
    }
}