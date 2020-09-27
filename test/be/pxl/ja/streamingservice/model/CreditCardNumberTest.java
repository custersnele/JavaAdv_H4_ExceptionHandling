package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CreditCardNumberTest {

	@Test
	public void validVisaCard() {
		CreditCardNumber creditCardNumber = new CreditCardNumber("4321876532147654", "123");

		assertEquals(CreditCardType.VISA, creditCardNumber.getType());
		assertEquals("123", creditCardNumber.getCvc());
		assertEquals("4321876532147654", creditCardNumber.getNumber());
	}

	@Test
	public void validVisaCardWithBlanks() {
		CreditCardNumber creditCardNumber = new CreditCardNumber("  43218 76532 1476 54  ", " 1 2 3 ");

		assertEquals(CreditCardType.VISA, creditCardNumber.getType());
		assertEquals("123", creditCardNumber.getCvc());
		assertEquals("4321876532147654", creditCardNumber.getNumber());
	}

	@Test
	public void validMasterCard() {
		CreditCardNumber creditCardNumber = new CreditCardNumber("5321876532147654", "123");

		assertEquals(CreditCardType.MASTERCARD, creditCardNumber.getType());
		assertEquals("123", creditCardNumber.getCvc());
		assertEquals("5321876532147654", creditCardNumber.getNumber());
	}

	@Test
	public void validMasterCardWithBlanks() {
		CreditCardNumber creditCardNumber = new CreditCardNumber("  53218 76532 1476 54  ", " 1 2 3 ");

		assertEquals(CreditCardType.MASTERCARD, creditCardNumber.getType());
		assertEquals("123", creditCardNumber.getCvc());
		assertEquals("5321876532147654", creditCardNumber.getNumber());
	}

	@Test
	public void throwsInvalidArgumentExceptionWhenNumberTooShort() {
		assertThrows(IllegalArgumentException.class, () -> {
					new CreditCardNumber("  53218 76532 1476  ", " 1 2 3 ");
				});
	}

	@Test
	public void throwsInvalidArgumentExceptionWhenNumberTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new CreditCardNumber("  53218 76532 1476 4445  ", " 1 2 3 ");
		});
	}

	@Test
	public void throwsInvalidArgumentExceptionWhenInvalidCardType() {
		assertThrows(IllegalArgumentException.class, () -> {
			new CreditCardNumber("7321876532147654", "123");
		});
	}
}
