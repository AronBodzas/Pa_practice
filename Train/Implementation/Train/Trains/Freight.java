package Train.Trains;

import Train.Cargo.Cargo;

import java.math.BigDecimal;
import java.util.UUID;

public class Freight extends Train {

	private final Cargo cargo;
	private final BigDecimal baseRevenue = BigDecimal.valueOf(550);
	private static final BigDecimal COST = BigDecimal.valueOf(300);


	public Freight(UUID serialNumber, int productionYear, Cargo cargo) {
		super(serialNumber, productionYear, COST);
		this.cargo = cargo;
	}
}