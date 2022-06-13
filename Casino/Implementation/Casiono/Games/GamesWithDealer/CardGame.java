package Casiono.Games.GamesWithDealer;

import Casiono.Dealers.Dealer;
import Casiono.Games.Game;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class CardGame extends Game {

	private Dealer dealer;

	public CardGame(int numberOfPlayers, BigDecimal gameBank, UUID id, Dealer dealer) {
		super(numberOfPlayers, gameBank, id);
		this.dealer = dealer;
	}
}