package com.st.il.borrowerapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.st.il.borrowerapp.models.BookLoans;
import com.st.il.borrowerapp.models.BookLoansPrimaryKey;

@Repository
public interface BookLoansDao extends JpaRepository<BookLoans, BookLoansPrimaryKey> {
	
}