package com.chocksaway.repository;

import com.chocksaway.entity.Author;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AuthorRepository extends
        PagingAndSortingRepository<Author, Long> {
}
