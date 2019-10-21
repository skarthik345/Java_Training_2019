package day_3.ass_4.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Account {
	public Account() {
		super();
	}

	@Id
	@Column(precision = 15)
	private int accountNo;
	@Column(precision = 8, scale = 2)
	private double balance;
	@Column(length = 25, nullable = false)
	private String customerName;
	@Column(length = 25, nullable = false, unique = true)
	private String userId;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
