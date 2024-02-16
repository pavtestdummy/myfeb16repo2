package com.bootcamp.second;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanApprovalApp {

	@GetMapping("/loancheck/{expyears}")
	public ResponseEntity<LoanResponse> loanEligibilityCheck(@PathVariable("expyears")int expyears){
		System.out.println(" in loaneligibility check "+expyears+new Date());
		int amt=0;
		int status=0;
		if(expyears > 4)
			{amt=expyears*10;
			status=1;
			}
		return ResponseEntity.ok(new LoanResponse(amt,status));
	}
}
