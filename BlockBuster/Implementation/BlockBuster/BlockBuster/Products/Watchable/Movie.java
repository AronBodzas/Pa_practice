package BlockBuster.Products.Watchable;

import java.math.BigDecimal;

public class Movie extends WatchableProduct {
    public Movie(String title, int releaseDate, BigDecimal dailyRentalCost, BigDecimal originalPrice) {
        super(title, releaseDate, dailyRentalCost, originalPrice);
        setPlatformType(releaseDate);
    }

}