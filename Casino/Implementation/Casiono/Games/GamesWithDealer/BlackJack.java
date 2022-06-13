package Casiono.Games.GamesWithDealer;

import Casiono.Dealers.Dealer;

import java.math.BigDecimal;
import java.util.UUID;

public class BlackJack extends CardGame {

	private static final int NUMBER_OF_PLAYERS = 6;

	public BlackJack(int numberOfPlayers, BigDecimal gameBank, UUID id, Dealer dealer) {
		super(NUMBER_OF_PLAYERS, gameBank, id, dealer);
	}
}