package Train.Trains.PersonalTransports;


import java.math.BigDecimal;
import java.util.UUID;

public class InterCity extends PersonalTransport {

	private static final BigDecimal TICKET_PRICE = BigDecimal.valueOf(2.00);
	private static final BigDecimal COST = BigDecimal.valueOf(1200);

	public InterCity(UUID serialNumber, int productionYear) {
		super(serialNumber, productionYear, COST, TICKET_PRICE);
	}
}