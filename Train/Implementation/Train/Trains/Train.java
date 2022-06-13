package Train.Trains;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Train {

	private UUID serialNumber;
	private int productionYear;
	private BigDecimal cost;

	public Train(UUID serialNumber, int productionYear, BigDecimal cost) {
		this.serialNumber = serialNumber;
		this.productionYear = productionYear;
		this.cost = cost;
	}
}