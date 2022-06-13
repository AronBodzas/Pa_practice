package Train.Trains.PersonalTransports;

import Train.Trains.Train;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class PersonalTransport extends Train {

	private int numberOfCoaches;
	private BigDecimal ticketPrice;
	private static final int dailyPeopleCount = 50;
	private static final int onTrainTicketPercentage = 25;
	private static final BigDecimal onTrainTicketPriceDifference = BigDecimal.valueOf(2);

	public PersonalTransport(UUID serialNumber, int productionYear, BigDecimal cost, BigDecimal ticketPrice) {
		super(serialNumber, productionYear, cost);
		this.ticketPrice = ticketPrice;
	}
}