package com.springcore.autoDiscoveryStereoTypes;

import java.util.List;

public interface AccountService {
			public String createAccount(String accNo, String accName, String accType, int 
			balance);
			public String searchAccount(String accNo);
			public Account getAccount(String accNo);
			public String updateAccount(String accNo, String accName, String accType, int 
			balance);
			public String deleteAcount(String accNo);
			
			public List<Account> getAllAccounts();	
			
}
