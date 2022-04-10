public class Deck {
    private Card[] cards;
    private boolean[] isDealt;
    private int cardsInDeck;
    private int deckCapacity;

    public Deck()
    {
        //Constructor for a deck of cards
        deckCapacity = 10;
        cards = new Card[deckCapacity]; //new Card array set to size of deck capacity
        isDealt = new boolean[deckCapacity]; //new boolean array for establishing dealt/not dealt, set to size of deck capacity
        cardsInDeck = 0; //starting amount of cards
    }

    public void add(Card card)
    {
        //Made to add a card to the deck
        cards[cardsInDeck++] = card;
    }

    public void deal(int index)
    {
        //Deals out a specific amount of cards based on how many cards are left in the deck, up to so many at a time
        isDealt[index] = true;
    }

    public void upgrade()
    {
        //Upgrades a specific card and marks it as such
    }

    public void returnToDeck(int index)
    {
        //Return cards to deck
        isDealt[index] = false;
    }

    public String toString()
    {
        //Information for the deck, to be parsed and then distributed accordingly

        //Return the created deck
        String output = ""; //sets output to blank string
        for(int i = 0; i < cardsInDeck; i++) //for loop that outputs each card in deck and deal status
        {
            output += cards[i].toString() + "\n"; //card, new line after
            output += isDealt[i] + "\n"; //deal status, new line after
        }
        return output; //gives output
    }
}
