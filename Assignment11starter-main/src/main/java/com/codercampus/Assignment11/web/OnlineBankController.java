package com.codercampus.Assignment11.web;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import com.codercampus.Assignment11.service.TransactionService;

@Controller
public class OnlineBankController {
	
	@Autowired
	private TransactionService service;
	
	@GetMapping("/transactions")
	public String getTransactions(Model model) throws IOException{
		List<Transaction> transactions =service.getTransactions();
		Transaction transaction = new Transaction();
		model.addAttribute("transaction", transaction);
		model.addAttribute("transactions", transactions);
		return "transactions";
	}
	
	@GetMapping("/transactiondetail/{transactionId}")
	public String getTransactionDetailById(@PathVariable Long transactionId, Model model) {
		Transaction transaction = service.findById(transactionId);
		model.addAttribute("transaction", transaction);
		return "transactiondetail";
		
	}
}
