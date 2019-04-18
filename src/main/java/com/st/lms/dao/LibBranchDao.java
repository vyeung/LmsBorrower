package com.st.lms.dao;

import com.st.lms.models.LibraryBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibBranchDao extends JpaRepository<LibraryBranch, Integer>{
	
}