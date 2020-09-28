package be.pxl.ja.streamingservice.model;

import be.pxl.ja.streamingservice.exception.InvalidDateException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PaymentInfoSetExpirationDateTest {

	private PaymentInfo paymentInfo;

	@BeforeEach
	public void init() {
		paymentInfo = new PaymentInfo();
	}

	@Test
	public void throwsInvalidDateExceptionWhenExpirationDayWithinOneMonth() {
		LocalDate withinOneMonth = LocalDate.now().plusMonths(1).minusDays(1);
		assertThrows(InvalidDateException.class, () -> paymentInfo.setExpirationDate(withinOneMonth));
	}

	@Test
	public void expirationDayWithinExactlyOneMonthIsAllowed() {
		LocalDate exactlyOneMonth = LocalDate.now().plusMonths(1);
		paymentInfo.setExpirationDate(exactlyOneMonth);

		assertNotNull(paymentInfo.getExpirationDate());
		assertEquals(exactlyOneMonth, paymentInfo.getExpirationDate());
	}

	@Test
	public void expirationDayOverOneMonthIsAllowed() {
		LocalDate overOneMonth = LocalDate.now().plusMonths(1).plusDays(1);
		paymentInfo.setExpirationDate(overOneMonth);

		assertNotNull(paymentInfo.getExpirationDate());
		assertEquals(overOneMonth, paymentInfo.getExpirationDate());
	}

}
