package BlockBuster.Products.Watchable;

import BlockBuster.Products.PlatformType;
import BlockBuster.Products.Product;

import java.math.BigDecimal;

public abstract class WatchableProduct extends Product {
	private PlatformType platform;

	public WatchableProduct(String title, int releaseDate, BigDecimal dailyRentalCost, BigDecimal originalPrice) {
		super(title, releaseDate, dailyRentalCost, originalPrice);
	}

	protected void setPlatformType(int releaseDate){
		if (releaseDate < 2000){
			platform = PlatformType.VHS;
		}else if(releaseDate > 2000 && releaseDate < 2010){
			platform = PlatformType.DVD;
		}else {
			platform = PlatformType.BLU_RAY;
		}
	}
}