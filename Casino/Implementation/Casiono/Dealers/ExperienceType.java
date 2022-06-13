package Casiono.Dealers;

import java.math.BigDecimal;

public enum ExperienceType {
	NEWBIE(50000),
	MID_LEVEL(80000),
	PRO(120000);

	private BigDecimal salary;

	ExperienceType(int i) {
	}
}