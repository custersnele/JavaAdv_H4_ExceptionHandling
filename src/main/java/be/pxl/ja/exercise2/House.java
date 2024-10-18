package be.pxl.ja.exercise2;

public class House {

	private static final double BASE_PRICE = 2356.75;
	private final String code;
	private String description;
	private int area;
	private String city;
	private Status status;
	private EPCScore epcScore;

	public House(String code, String description, int area, EPCScore epcScore) {
		this.code = code;
		this.description = description;
		this.area = area;
		this.epcScore = epcScore;
		this.status = Status.FOR_SALE;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setEpcScore(EPCScore epcScore) {
		this.epcScore = epcScore;
	}

	public String getCode() {
		return code;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public Status getStatus() {
		return status;
	}

	public EPCScore getEpcScore() {
		return epcScore;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void markAsSold() {
		if (Status.FOR_SALE == status) {
			status = Status.SOLD;
		} else {
			throw new IllegalStateException("House is already marked as sold.");
		}
	}

	public double getPrice() {
		double price = area * BASE_PRICE * epcScore.getPercentage();
		if ("Hasselt".equals(city) || "Genk".equals(city)) {
			price *= 1.25;
		}
		return price;
	}
}
