public class Encounter {

    private int encounterType;
    private double encounterChance;

    public void instanceDialogue()
    {
        //The actual dialogue for any given encounter type

        //------enemy encounter------
        System.out.println("You encounter a [creature name here].");

        //if enemy has initiative
        System.out.println("[creature name here] has the first strike!");

        //if player has initiative
        System.out.println("You have the first move!");

        //if player is hit
        System.out.println("You are hit for [damage value] damage!");

        //if block value holds up
        System.out.println("Your defenses hold up against [creature name here]'s attacks!");

        //if block value doesn't hold up
        System.out.println("[creature name here]'s attacks breach your defenses, hurting you for [damage value after block] damage!");

        //if win
        System.out.println("You have defeated [creature name here] and can upgrade a card!");
        System.out.println("Please select from one of your non-upgraded cards below.");
        //upgrade method call would go here
        //send player to next area

        //if win against boss
        System.out.println("You have slain [boss name here]! Their evil will no longer blight this land.");
        System.out.println("For your victory, you are able to upgrade a card, and can move onto the next stage.");
        System.out.println("Please select from one of your non-upgraded cards below.");
        //upgrade method call would go here
        //send player to next stage

        //first to second area cutscene
        System.out.println("Having slain Yvatra the Prowler, you realize that the source of the evil you seek to vanquish comes from somewhere far more earthen.");
        System.out.println("After taking a rest, you embark to the next stage, Dalihark Pass, in search of more answers. There is said to be a horrid half-giant who went mad some time ago, and now obsessively collects jewels in the mineral-rich mining system of the area.");

        //second to third area cutscene
        System.out.println("You slew Sefrekis, Keeper of Jewels, but it barely brought you closer to finding the source of the evil. Then, you find a journal left by the deceased half-giant, and in amidst the incoherent scribbles, you find a depiction of a terrible mountain.");
        System.out.println("You know full well this depicted mountain must be Mt. Eskervon, an oppressively cold and tall landform in the northern regions of the land. You have heard rumors of the place becoming host to a dark, foreign presence, but previously dismissed them.");
        System.out.println("Now you know the rumors are true, however, and rest up for the journey that lies ahead of you.");

        //if win against final boss
        System.out.println("You have claimed victory over The Mercurial Conqueror! At last, the world is at peace, at least for now.");
        //win method call would go here

        //if lost
        System.out.println("[creature name here] has slain you.");
        //death method call would go here

        //if lost against boss or final boss
        System.out.println("[boss name here] has slain you, and their reign of terror will unfortunately continue.");
        //death method call would go here

        //------rest area encounter------
        System.out.println("You find yourself at a rest area after a significant trek, which is free of monsters.");

        //if HP = full
        System.out.println("However, you are uninjured, so you take the time to upgrade one of your cards instead.");
        System.out.println("Please select from one of your non-upgraded cards below.");
        //upgrade method call would go here

        //if HP is not full
        //set health to full
        System.out.println("After a brief respite, you feel refreshed and ready to continue your trek.");
        //send player to next area
    }

    public void restArea(double encounterChance)
    {
        //Initiates a rest area
    }
    public void npcInteraction(double encounterChance)
    {
        //Initiates an interaction with an NPC
    }
    public void battle(double encounterChance)
    {
        //Initiates a combat instance
    }
}
