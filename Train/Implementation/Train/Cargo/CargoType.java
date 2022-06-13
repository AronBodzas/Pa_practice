package Train.Cargo;

public enum CargoType {
	NORMAL(0),
	NON_SOLID(150),
	DANGEROUS(300);

	private int additionalRevenue;

	CargoType(int i) {
	}
}