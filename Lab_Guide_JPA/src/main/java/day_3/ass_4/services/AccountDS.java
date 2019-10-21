package day_3.ass_4.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import day_3.ass_4.entities.Account;

public class AccountDS {
	public static void main(String arg[]) throws Exception {
		int accountNo;
		double balance;
		String customerName;
		String userId;
		EntityManager em = null;
		System.out.println("Enter Account Number: ");
		accountNo = Integer.parseInt(ReadData.acceptString());
		System.out.println("Enter Account Balance: ");
		balance = Double.parseDouble(ReadData.acceptString());
		System.out.println("Enter Customer Name: ");
		customerName = ReadData.acceptString();
		System.out.println("Enter UserId: ");
		userId = ReadData.acceptString();
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("FirstProject");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			Account account = new Account();
			account.setAccountNo(accountNo);
			account.setBalance(balance);
			account.setCustomerName(customerName);
			account.setUserId(userId);
			em.persist(account);
			em.getTransaction().commit();
			System.out.println("Persisted");
		}
		finally{
			ReadData.close();
			em.close();
		}
	}
}