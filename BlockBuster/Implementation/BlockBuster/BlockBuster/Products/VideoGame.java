package BlockBuster.Products;

import java.math.BigDecimal;

public class VideoGame extends Product {

	private static final PlatformType platform = PlatformType.DVD;

	public VideoGame(String title, int releaseDate, BigDecimal dailyRentalCost, BigDecimal originalPrice) {
		super(title, releaseDate, dailyRentalCost, originalPrice);
	}
}