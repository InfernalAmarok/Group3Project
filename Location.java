public class Location {

    private boolean[] isNewStage;
    protected int encounterType;

    public void restoreHealth(boolean isNewStage)
    {
        //Restores the player's health if they have entered a new stage, only for 2nd and 3rd
        if (isNewStage)
        {
            //hitPoints is set equal to playerHealth (the max capacity), or something along that train of thought
        }
    }

    public void restArea()
    {
        //Parameters for the rest area, like healing the player or allowing them to upgrade if they don't need healing
    }

    public void combatArea()
    {
        //Parameters for a combat instance, such as what monsters can be used depending on the area or if it's a boss
    }

    public void dialogueArea()
    {
        //Parameters for NPC interaction, such as what dialogue is used when and what the player's options are
    }

    public void stage1()
    {
        //Parameters for the first stage, name pending
    }

    public void stage2()
    {
        //Parameters for the second stage, name pending
    }

    public void stage3()
    {
        //Parameters for the third and final stage, name pending, including ending the game if the player beats the final boss
    }

}
