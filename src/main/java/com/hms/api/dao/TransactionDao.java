package com.hms.api.dao;

import java.util.List;

import com.hms.api.entity.TransactionDetails;

public interface TransactionDao {
	public int generateSalaryForUser(TransactionDetails transactionDetails);

	public TransactionDetails getTransactionDetails(String transactionId);
	public List<TransactionDetails> getTransactionDetails(String username, int from, int to);
	
	

}
