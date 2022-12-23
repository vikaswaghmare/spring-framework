package com.springcore.javaBasedAutowiring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
//@Component("accountDao")
public class AccountDaoImpl implements AccountDao {

	String status = "";
	
	@Autowired(required = true)
	private DataSource dataSource;

	public String create(String accNo, String accName, String accType, int balance) {
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from account where accNo=?");
			pst.setString(1, accNo);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				status = "existed";
			} else {
				pst = con.prepareStatement("insert into account values(?,?,?,?)");
				pst.setString(1, accNo);
				pst.setString(2, accName);
				pst.setString(3, accType);
				pst.setInt(4, balance);
				pst.executeUpdate();
				status = "success";
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

	public String search(String accNo) {
		try {
			Connection con = dataSource.getConnection();

			PreparedStatement pst = con.prepareStatement("select * from account where accNo = ?");
			pst.setString(1, accNo);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				status = "[ACCNO:" + rs.getString("ACCNO") + ",ACCNAME:" + rs.getString("ACCNAME") + ",ACCTYPE:"
						+ rs.getString("ACCTYPE") + ",BALANCE:" + rs.getInt("BALANCE") + "]";
			} else {
				status = "Account Not Existed";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public Account getAccount(String accNo) {
		Account acc = null;
		try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from account where accNO = ?");
			pst.setString(1, accNo);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if (b == true) {
				acc = new Account();
				acc.setAccNo(rs.getString("ACCNO"));
				acc.setAccName(rs.getString("ACCNAME"));
				acc.setAccType(rs.getString("ACCTYPE"));
				acc.setBalance(rs.getInt("BALANCE"));
			} else {
				acc = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return acc;
	}

	public String update(String accNo, String accName, String accType, int balance) {
			try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("update account set ACCNAME = ?, ACCTYPE = ?, BALANCE = ? where ACCNO = ?");
			pst.setString(1, accName);
			pst.setString(2, accType);
			pst.setInt(3, balance);
			pst.setString(4, accNo);
			pst.executeUpdate();
			status = "success";
			} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
			}
			return status;
			}

	
			public String delete(String accNo) {
			try {
			Connection con = dataSource.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from account where accNO = ?");
			pst.setString(1, accNo);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if(b == true) {
				pst = con.prepareStatement("delete from account where accNo = ?");
						pst.setString(1, accNo);
						pst.executeUpdate();
						status = "success";
						}else {
						status = "notexisted";
						}
						} catch (Exception e) {
						status = "failure";
						e.printStackTrace();
						}
						return status;
						}

			public List<Account> getAllAccounts() {
				List<Account> list= new ArrayList<Account>();
				Account acc=null; 
				try {
					Connection con = dataSource.getConnection();
					PreparedStatement pst = con.prepareStatement("select * from account");
					
					ResultSet rs = pst.executeQuery();
					while(rs.next()) {
						acc = new Account();
						acc.setAccNo(rs.getString("ACCNO"));
						acc.setAccName(rs.getString("ACCNAME"));
						acc.setAccType(rs.getString("ACCTYPE"));
						acc.setBalance(rs.getInt("BALANCE"));
						list.add(acc);
						
						
					
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				return list;
				
			}

}
