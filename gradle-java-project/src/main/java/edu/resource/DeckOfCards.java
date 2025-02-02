package edu.resource;

import edu.model.Card;

public class DeckOfCards {

	public static void main(String[] args) {
		DeckOfCards app = new DeckOfCards();
		app.createDeck();
		app.getDeck();
		app.shuffle();
		app.getDeck();
		
		for(int j=0;j<60;j++)
		{
			app.dealOneCard();
		}
	}

	private String suits[] = { "hearts", "diamonds", "clubs", "spades" };
	private String values[] = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	
	private int deckSize = 52;
	private Card deck[] = new Card[deckSize];
	
	public void createDeck() {
		for (int i = 0; i < deck.length; i++) {
			deck[i] = new Card(suits[i / 13], values[i % 13]);
		}
		System.out.println("Deck created");
	}

	public void getDeck() {
		for (int i = 0; i < (deck.length - returnedCards); i++) {
			System.out.println(deck[i].getSuit() + " " + deck[i].getValue());
		}
	}

	public void shuffle() {
		for (int i = 0; i < (deck.length - returnedCards); i++) {
			int j = (int) (Math.random() * 52);
			// swap cards
			Card temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
		}

		System.out.println("shuffle completed");
	}

	private int returnedCards = 0;
	
	public Card dealOneCard() {
		System.out.println("Deal One Card : ");
		if (returnedCards < deckSize) {
			returnedCards++;
			System.out.println(deck[returnedCards-1].getSuit() + " " + deck[returnedCards-1].getValue());
			return deck[returnedCards-1];
		}
		System.out.println("no card is dealt");
		return null;
	}
}
