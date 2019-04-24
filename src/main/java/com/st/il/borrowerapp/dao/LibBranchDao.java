package com.st.il.borrowerapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.st.il.borrowerapp.models.LibraryBranch;

@Repository
public interface LibBranchDao extends JpaRepository<LibraryBranch, Integer>{
	
}