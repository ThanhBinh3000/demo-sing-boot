package com.codegym.demospringboot.service.category;

import com.codegym.demospringboot.model.Category;
import com.codegym.demospringboot.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICategoryService extends IGeneralService<Category> {
    Iterable<Category> findAllByNameContaining(String name);
    void deleteCategory(Long id);
}