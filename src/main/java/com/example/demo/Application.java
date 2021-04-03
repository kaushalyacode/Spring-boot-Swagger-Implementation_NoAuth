package com.example.demo;

import com.example.demo.Data.Dao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		SpringApplication.run(Application.class, args);

		BorrowedBookIntergrator bi =new BorrowedBookIntergrator();
		bi.intergrateBorrowedBookResults().forEach(e -> {

			System.out.println(e);

		});
	}
}
