package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.LoanApplicationDto;
import com.techment.exception.LoanApplicationNotFound;
import com.techment.service.ILoanApplicationService;

@RestController
@RequestMapping(value = "/loanApplication")
public class LoanApplicationController {
	
	@Autowired
	ILoanApplicationService loanApplicationImpl;
	
	@PostMapping("/ApplyLoan")
	public ResponseEntity<String> LoanApplication(@RequestBody LoanApplicationDto applicationDto)
	{
		try
		{
			loanApplicationImpl.saveLoanApplicationToDb(applicationDto);
			return new ResponseEntity<String>("New Loan Application Has Forwarded Now Wait For Response",HttpStatus.OK);
		}
		catch (Exception e) {
		
			return null;
		}
		
	}
	
	@PutMapping(value = "/ApproveApplicationById/{id}")
	public ResponseEntity<LoanApplicationDto> ApproveApplication(@PathVariable int id)
	{
		try {
			LoanApplicationDto applicationDto = loanApplicationImpl.approveLoanApplication(id);
			return new ResponseEntity<LoanApplicationDto>(applicationDto,HttpStatus.ACCEPTED);
			
		}
		catch(Exception e)
		{
			throw new LoanApplicationNotFound("loan id Not Find For Approval");	
		}
	}
	

	@PutMapping(value = "/RejectApplicationById/{id}")
	public ResponseEntity<LoanApplicationDto> RejectApplication(@PathVariable int id)
	{
		try {
			LoanApplicationDto applicationDto = loanApplicationImpl.rejectLoanApplication(id);
			return new ResponseEntity<LoanApplicationDto>(applicationDto,HttpStatus.ACCEPTED);
			
		}
		catch(Exception e)
		{
			throw new LoanApplicationNotFound(" id not found for rejecting Application");	
		}
	}
	
	@GetMapping("/AllApplication")
	public ResponseEntity<List<LoanApplicationDto>> AllApplications()
	{
		return new ResponseEntity<List<LoanApplicationDto>>(loanApplicationImpl.viewAllApplications(),HttpStatus.ACCEPTED);
		//return loanApplicationImpl.viewAllApplications();
	}
		
	

}
