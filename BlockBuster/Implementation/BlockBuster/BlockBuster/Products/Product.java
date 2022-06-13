package BlockBuster.Products;

import java.math.BigDecimal;

public abstract class Product {

	private final String title;
	private final int releaseDate;
	private final BigDecimal dailyRentalCost;
	private final BigDecimal originalPrice;
	private static final int maxRentTime = 14;

	public Product(String title, int releaseDate, BigDecimal dailyRentalCost, BigDecimal originalPrice) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.dailyRentalCost = dailyRentalCost;
		this.originalPrice = originalPrice;

	}
}