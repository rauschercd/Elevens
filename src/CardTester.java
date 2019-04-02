/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("Jack", "Spades", 10);
		Card card2 = new Card("Jack", "Hearts", 10);
		Card card3 = new Card("3", "Clubs", 3);
		Card card4 = new Card("Jack", "Spades", 10);
		System.out.println(card1.matches(card2));
		System.out.println(card2.matches(card3));
		System.out.println(card1.toString());
		System.out.println(card4.matches(card1));
	}
}
