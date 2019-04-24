package com.st.lms.dao;

import com.st.lms.models.BookLoans;
import com.st.lms.models.BookLoansPrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookLoansDao extends JpaRepository<BookLoans, BookLoansPrimaryKey> {
	
}