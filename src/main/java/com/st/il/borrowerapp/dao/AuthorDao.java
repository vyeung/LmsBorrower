package com.st.il.borrowerapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.st.il.borrowerapp.models.Author;

@Repository
public interface AuthorDao extends JpaRepository<Author, Integer>{
	
}