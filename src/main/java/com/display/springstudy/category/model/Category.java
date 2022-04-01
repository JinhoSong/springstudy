package com.display.springstudy.category.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Category {

    private String catCd;
    private String catNm;
    private List<CategoryDetails> categoryDetails;
}
