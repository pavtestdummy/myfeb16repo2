package com.bootcamp.second;

public class LoanResponse {
	
	int loanAmt;
	int status;
	
	public LoanResponse() {
		// TODO Auto-generated constructor stub
	}

	public int getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(int loanAmt) {
		this.loanAmt = loanAmt;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LoanResponse(int loanAmt, int status) {
		super();
		this.loanAmt = loanAmt;
		this.status = status;
	}
	
	

}
