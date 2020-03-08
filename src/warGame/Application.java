package warGame;

public class Application {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("Chester");
		Player player2 = new Player("Albert");
		
		deck.shuffle();
		deck.shuffle();
		deck.shuffle();
		//deck.describe();
		
		
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		
		player1.describe();
		player2.describe();
		
		for (int i = 0; i < 26; i++) {
			System.out.println("Turn " + i + ":");
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrememntScore();
				System.out.println(player1.getPlayerName() + "'s Score: " + player1.getScore() + "\n" + 
						player2.getPlayerName() + "'s Score:" + player2.getScore() + "\n");
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrememntScore();
				System.out.println(player2.getPlayerName() + "'s Score: " + player2.getScore() + "\n" + 
						player1.getPlayerName() + "'s Score: " + player1.getScore() + "\n");
			} else {
				System.out.println("Round draw.");
			}
		}
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getPlayerName() + " is victorious!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getPlayerName() + " is victorious!");
		} else {
			System.out.println("DRAW NO WINNER CAN BE DECLARED");
		}
		
	}

}
