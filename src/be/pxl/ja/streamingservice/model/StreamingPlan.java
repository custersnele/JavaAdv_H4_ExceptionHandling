package be.pxl.ja.streamingservice.model;

import java.math.BigDecimal;

public enum StreamingPlan {
	BASIC(1, BigDecimal.valueOf(7.99)),
	STANDARD(2, BigDecimal.valueOf(11.99)),
	PREMIUM(4, BigDecimal.valueOf(15.99));

	private int numberOfScreens;
	private BigDecimal price;

	StreamingPlan(int numberOfScreens, BigDecimal price) {
		this.numberOfScreens = numberOfScreens;
		this.price = price;
	}
}
