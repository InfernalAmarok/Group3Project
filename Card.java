public class Card {
    private String cardType; //This is both a card's "name" and "function", ideally it should be something simple
    private int actionValue; //Potency of a card, this could be its damage value, how much it blocks, or how much it heals
    private String cardTooltip; //A short tidbit about the card
    private boolean isUpgraded; //Is the card upgraded or not

    public Card(String cardType, int actionValue, String cardTooltip, boolean isUpgraded)
    {
       this.cardType = cardType;
       this.actionValue = actionValue;
       this.cardTooltip = cardTooltip;
       this.isUpgraded = isUpgraded;
    }

    public void cardUpgrades()
    {
        //All in this method is purely tentative, just until more is solidified

        if(cardType == "Strike")
        {
            actionValue = actionValue + 6; //Initial AV would be 7
        }
        if(cardType == "Defend")
        {
            actionValue = actionValue + 3; //Initial AV would be 5
        }
        if(cardType == "Heal Wounds")
        {
            actionValue = actionValue + 5; //Initial AV would be 5
        }
    }

    public String toString()
    {
        String output = "";
        output += cardType + "\n";
        output += "Action Value: " + actionValue + "\n";
        output += "Description: " + cardTooltip + "\n";
        output += "Upgraded: " + isUpgraded;
        return output;
    }

}
