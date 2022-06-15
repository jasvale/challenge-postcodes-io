package com.challenge.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.challenge.entities.PostCodeSearchResult;

public interface PostCodeSearchResultRepository extends PagingAndSortingRepository<PostCodeSearchResult, Long> {
	@Override
	public List<PostCodeSearchResult> findAll();
}
