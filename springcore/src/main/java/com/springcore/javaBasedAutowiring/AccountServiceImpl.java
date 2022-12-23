package com.springcore.javaBasedAutowiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired(required = true)
	private AccountDao dao;

	public String createAccount(String accNo, String accName, String accType, int balance) {
		return dao.create(accNo, accName, accType, balance);
	}

	public String searchAccount(String accNo) {
		return dao.search(accNo);
	}

	public Account getAccount(String accNo) {
		return dao.getAccount(accNo);
	}

	public String updateAccount(String accNo, String accName, String accType, int balance) {
		return dao.update(accNo, accName, accType, balance);
	}

	public String deleteAcount(String accNo) {
		return dao.delete(accNo);
	}

	public List<Account> getAllAccounts() {
		
		return dao.getAllAccounts();
	}

}
