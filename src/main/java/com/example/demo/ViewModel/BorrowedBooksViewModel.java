package com.example.demo.ViewModel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BorrowedBooksViewModel {

    private Long id;

    private String Title;

    private String isbn;

    private int availableQty;
}