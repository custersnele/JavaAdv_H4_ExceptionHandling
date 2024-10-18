package be.pxl.ja.exercise2;

public enum EPCScore {
	A_PLUS(1.5),
	A(1.2),
	B(1),
	C(0.98),
	D(0.90),
	E(0.80),
	F(0.75);
	private final double percentage;

	EPCScore(double percentage) {
		this.percentage = percentage;
	}

	public double getPercentage() {
		return percentage;
	}
}
