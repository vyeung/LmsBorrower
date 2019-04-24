package com.st.il.borrowerapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.st.il.borrowerapp.models.BookCopies;
import com.st.il.borrowerapp.models.BookCopiesPrimaryKey;

@Repository
public interface BookCopiesDao extends JpaRepository<BookCopies, BookCopiesPrimaryKey> {
	
}