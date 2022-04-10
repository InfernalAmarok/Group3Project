public class WinLoss {

    protected boolean[] hasWon;
    protected boolean[] hasLost;

    public void success()
    {
        //Declares that the player is a winner and prompts them if they want to retry
        System.out.println("The hero has prevailed at the quest set for them, despite all odds! Now with The Mercurial Conqueror slain, the world is at peace, at least for the immediate future.");
        System.out.println("Now the hero can take a rest, until they are needed for their next grand adventure.");
        System.out.println("That being said, you may return to try the quest again and attempt a different journey.");
        System.out.println("Do you wish to do so? (YES / NO)");
    }

    public void defeat()
    {
        //Declares that the player has lost and prompts them if they want to retry
        System.out.println("Alas, the hero has suffered an untimely demise- do not be disheartened.");
        System.out.println("You may try again, but do you wish to do so? (YES / NO)");
    }
}
