package com.exceptionhandling.dao;

import com.exceptionhandling.dto.Account;
import com.exceptionhandling.exception.AccountNotFoundException;

public class AccountDao {
	public Account getAccount(String accountNo) throws AccountNotFoundException {
		Account account = null;

		if (accountNo.equals("sbi0001")) {
			throw new AccountNotFoundException("account not found exception");
		}

		account = new Account();
		account.setAccountNo(accountNo);
		account.setAccountHolderName("Martin");
		account.setAccountType("savings");
		account.setBalance(1000);

		return account;
	}
}
