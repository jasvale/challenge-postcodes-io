package com.challenge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entities.PostCodeSearchResult;
import com.challenge.repositories.PostCodeSearchResultRepository;

import org.springframework.data.domain.Pageable;

@Service
public class PostCodeSearchResultService {
	@Autowired
	private PostCodeSearchResultRepository postCodeSearchResultRepository;
	
	public PostCodeSearchResult save(PostCodeSearchResult postCodeSearchResult) {
		return this.postCodeSearchResultRepository.save(postCodeSearchResult);
	}
	
	public List<PostCodeSearchResult> findAll(Pageable pageable) {
		return this.postCodeSearchResultRepository.findAll(pageable).toList();
	}
	
	public List<PostCodeSearchResult> findAll() {
		return this.postCodeSearchResultRepository.findAll();
	}
}
