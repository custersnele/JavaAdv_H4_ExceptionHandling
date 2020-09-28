package be.pxl.ja;

import be.pxl.ja.streamingservice.model.Account;

import java.security.NoSuchAlgorithmException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		Account newAccount = new Account("daffy@duckstad.be", "daffy123!");
		System.out.println(newAccount.verifyPassword("daffy123"));
		System.out.println(newAccount.verifyPassword("daffy123!"));
	}
}
