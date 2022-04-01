package com.display.springstudy.category.service;

import com.display.springstudy.category.model.Category;
import com.display.springstudy.category.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> selectCategories() {
        return categoryRepository.selectCategories();
    }
}
