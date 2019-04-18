package com.st.lms.dao;

import com.st.lms.models.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BorrowerDao extends JpaRepository<Borrower, Integer>{
	
}