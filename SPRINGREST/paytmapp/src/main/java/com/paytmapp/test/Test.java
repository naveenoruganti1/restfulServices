package com.paytmapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.paytmapp.config.JavaConfig;
import com.paytmapp.dto.Account;
import com.paytmapp.invoker.PayTMAccountInvoker;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		PayTMAccountInvoker invoker = context.getBean(PayTMAccountInvoker.class);

		/*
		 * String balance = invoker.getBalance("ac93833");
		 * System.out.println("balance : " + balance);
		 */

		/*
		 * TransactionHistory history = invoker.getPaymentHistory("ac9393", "dm3039");
		 * System.out.println(history);
		 */
		Account account = new Account();
		account.setAccountHolderName("Rick");
		account.setEmailAddress("rick@gmail.com");
		account.setIdentityType("Aadhar");
		account.setIdentityValue("aikc9038903");
		account.setMobileNo("030383088722");

		String accountNo = invoker.newAccount(account);
		System.out.println("accountNo  :" + accountNo);

	}
}
