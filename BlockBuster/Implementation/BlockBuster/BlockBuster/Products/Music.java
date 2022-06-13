package BlockBuster.Products;

import java.math.BigDecimal;

public class Music extends Product {

	private static final PlatformType platform = PlatformType.CD;

	public Music(String title, int releaseDate, BigDecimal dailyRentalCost, BigDecimal originalPrice) {
		super(title, releaseDate, dailyRentalCost, originalPrice);
	}
}