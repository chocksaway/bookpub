package com.chocksaway.repository;

import com.chocksaway.entity.Reviewer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ReviewerRepository extends
        PagingAndSortingRepository<Reviewer, Long> {
}