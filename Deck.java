import java.util.Random;
public class Deck {
    private int[] cards;

    public Deck() {
        this.cards = new int[4];
    }

    //Populates the deck with 3 random cards
    public int[] add() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            cards[rand.nextInt(3)] += 1;
        }
        return cards;
    }

    public void playCard(int num) {
        if (cards[num] > 0) {
            cards[num] -= 1;
        }
    }

    public boolean hasCard(int num) {
        return cards[num] != 0;
    }

    // Empties the deck
    public void clear() {
        for (int i = 0; i < 4; i++) {
            cards[i] = 0;
        }
    }

    // Adds the easter egg card to the deck
    public void addGodCard() {
        cards[3] += 1;
    }

    // Prints all the cards in the deck
    public void printCards() {
        System.out.println("You currently have " + cards[0] + " +1 attack cards.");
        System.out.println("You currently have " + cards[1] + " +2 attack cards.");
        System.out.println("You currently have " + cards[2] + " +3 attack cards.");
        if (cards[3] != 0) {
            System.out.println("and you have the god card! (Type 4 to play it)");
        }
    }
}
