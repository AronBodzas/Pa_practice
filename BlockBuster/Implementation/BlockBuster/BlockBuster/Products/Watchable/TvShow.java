package BlockBuster.Products.Watchable;


import java.math.BigDecimal;

public class TvShow extends WatchableProduct {


    public TvShow(String title, int releaseDate, BigDecimal dailyRentalCost, BigDecimal originalPrice) {
        super(title, releaseDate, dailyRentalCost, originalPrice);
        setPlatformType(releaseDate);
    }

}