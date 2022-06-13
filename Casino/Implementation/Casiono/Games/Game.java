package Casiono.Games;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Game {

	private int numberOfPlayers;
	private BigDecimal gameBank;
	private UUID id;

	public Game(int numberOfPlayers, BigDecimal gameBank, UUID id) {
		this.numberOfPlayers = numberOfPlayers;
		this.gameBank = gameBank;
		this.id = id;
	}
}