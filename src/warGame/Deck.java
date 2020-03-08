package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;
	private String[] cardTypes = {" of Hearts", " of Diamonds", " of Spades", " of Clubs"};
	private String[] valuesAsStrings = {"2", "3", "4", "5", "6", "7", "8", "8", "10", "Jack", "Queen", "King", "Ace"};
	
	public Deck() {
		cards = new ArrayList<Card>();
		for (String type : cardTypes) {
			for (int i = 0; i < valuesAsStrings.length; i++) {
				cards.add(new Card(i, valuesAsStrings[i] + type));
			}
		}
	}
	
	public void describe() {
		for (int i = 0; i < cards.size(); i++) {
			Card card = cards.get(i);
			card.describe();
		}
	}
	
	public void shuffle() {
		//Randomize order of cards list:
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}
	
}
