package warGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private int score;
	private String playerName;
	
	public Player(String playerName) {
		hand = new ArrayList<Card>();
		this.playerName = playerName;
		score = 0;
	}
	
	public void describe() {
		System.out.println("Name: " + playerName);
		for (int i = 0; i < hand.size(); i++) {
			Card card = hand.get(i);
			card.describe();
		}
		System.out.println(playerName + "'s score:" + score + "\n");
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public int getScore() {
		return score;
	}
	
	public void incrememntScore() {
		score++;
	}
	
}
