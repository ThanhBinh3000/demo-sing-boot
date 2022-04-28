package com.codegym.demospringboot.repository;

import com.codegym.demospringboot.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ICategoryRepository extends PagingAndSortingRepository<Category, Long> {
    Iterable<Category> findByNameContaining(String name);

    @Transactional
    @Modifying
    @Query(value = "call delete_category(?1)", nativeQuery = true)
    void deleteCategory(Long id);
}