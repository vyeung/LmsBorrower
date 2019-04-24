package com.st.il.borrowerapp.dto;

import java.util.List;

import com.st.il.borrowerapp.models.BookLoans;
import com.st.il.borrowerapp.models.LibraryBranch;

public class BkLoansBranchDTO {
	
	private List<BookLoans> bookLoans;
	private LibraryBranch libBranch;
	
	public BkLoansBranchDTO(LibraryBranch libBranch, List<BookLoans> bookLoans) {
		this.bookLoans = bookLoans;
		this.libBranch = libBranch;
	}

	public List<BookLoans> getBookLoans() {
		return bookLoans;
	}
	
	public void addBookLoan(BookLoans loan) {
		bookLoans.add(loan);
	}

	public LibraryBranch getLibBranch() {
		return libBranch;
	}

	public void setLibBranch(LibraryBranch libBranch) {
		this.libBranch = libBranch;
	}
}