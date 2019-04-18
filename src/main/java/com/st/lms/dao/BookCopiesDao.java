package com.st.lms.dao;

import com.st.lms.models.BookCopies;
import com.st.lms.models.BookCopiesPrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCopiesDao extends JpaRepository<BookCopies, BookCopiesPrimaryKey> {
	
}