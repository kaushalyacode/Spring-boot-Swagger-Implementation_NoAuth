package com.example.demo.Controller;

import com.example.demo.Data.Model.Author;
import com.example.demo.Data.Repository.Interface.IAuthorRepository;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*Not relevent to assignment*/
@RestController
public class AuthorController {

    @Autowired
    IAuthorRepository iAuthorRepository;

    @RequestMapping("/")
    public String Home()
    {
        return "Welcome Library";
    }

    @RequestMapping("/addAuthor")
    public Author addAuthor()
    {
        Author author= new Author();
        author.setName("name");
        var response =iAuthorRepository.save(author);
        return  author;
    }
}