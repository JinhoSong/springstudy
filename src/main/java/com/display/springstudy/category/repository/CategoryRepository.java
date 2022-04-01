package com.display.springstudy.category.repository;


import com.display.springstudy.category.model.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CategoryRepository {

    // todo mybatis 문법 정리, 노션 사용법 이펙티브 자바 복습
    List<Category> selectCategories();
}
