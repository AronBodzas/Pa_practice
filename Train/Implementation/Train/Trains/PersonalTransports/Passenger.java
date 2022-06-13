package Train.Trains.PersonalTransports;

import java.math.BigDecimal;
import java.util.UUID;

public class Passenger extends PersonalTransport {

	private static final BigDecimal TICKET_PRICE = BigDecimal.valueOf(1.50);
	private static final BigDecimal COST = BigDecimal.valueOf(1000);

	public Passenger(UUID serialNumber, int productionYear) {
		super(serialNumber, productionYear, COST, TICKET_PRICE);
	}
}