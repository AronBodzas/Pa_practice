package Casiono.Games;

import java.math.BigDecimal;
import java.util.UUID;

public class SlotMachine extends Game {

	private static final int NUMBER_OF_PLAYERS = 1;
	private int rollsSinceLastWin;

	public SlotMachine(int numberOfPlayers, BigDecimal gameBank, UUID id) {
		super(NUMBER_OF_PLAYERS, gameBank, id);
	}
}