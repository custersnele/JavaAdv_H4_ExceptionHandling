package be.pxl.ja.streamingservice.model;

import be.pxl.ja.streamingservice.exception.InvalidDateException;

import java.time.LocalDate;

public class PaymentInfo {

	private String firstName;
	private String lastName;
	private CreditCardNumber cardNumer;
	private LocalDate expirationDate;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCardNumer(CreditCardNumber cardNumer) {
		this.cardNumer = cardNumer;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		if (LocalDate.now().plusMonths(1).isAfter(expirationDate)) {
			throw new InvalidDateException(expirationDate, "expirationDate", "Must be valid for at least 1 month.");
		}
		this.expirationDate = expirationDate;
	}
}
