/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Spades"};
		int[] values = {11, 12, 13};
		Deck deck1 = new Deck(ranks, suits, values);
		System.out.println(deck1.deal());
	}
}
