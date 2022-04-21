import java.util.Scanner;
public class GameDriver {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String test;
        String playerInput;
        int playerHP;
        int playerAttackDamage = 7;
        int playerBlock = 5;
        int verSlimeHP;
        int verSlimeAttackDamage = 5;
        int verSlimeBlock = 4;
        int mudSlimeHP;
        int mudSlimeAttackDamage = 7;
        int mudSlimeBlock = 5;
        int iceSlimeHP;
        int iceSlimeAttackDamage = 8;
        int iceSlimeBlock = 6;

        while(true){
            System.out.println("Welcome to the game Project Duplicity. This is a COMBAT BETA that tests the combat capabilities of the game.");
            System.out.println("For those not familiar with the rules, please consult Rules.txt in the game's root folder.");
            System.out.println("Otherwise, type 'exit' to quit the game, or press enter to begin the game.");

            test = scan.nextLine();
            if(test.equals("exit")){
                System.out.println("Thanks for playing!");
                scan.close();
                break;
            }
            else if(test.equals("\n")){
                continue;
            }
            System.out.println("You will face three monsters back to back on your way to the peak of Mt. Eskervon. In order:\t");
            System.out.println("1. Verdant Slime (easy)");
            System.out.println("2. Mud Slime (medium)");
            System.out.println("3. Ice Slime (hard)");
            System.out.println("Type any phrase to continue.");
            test = scan.nextLine();
            System.out.println("Entry successful: " + test);
            System.out.println("----------------------------------");
            System.out.println("As you tread your way through Cirtelgo Plains, out comes a foe to ambush you!");
            System.out.println("----------------------------------");
            System.out.println("You confront the Verdant Slime.");
            verSlimeHP = 14;
            playerHP = 100;
            playerAttackDamage = 7;
            while (verSlimeHP > 0) {
                System.out.println("Verdant Slime HP: " + verSlimeHP);
                System.out.println("Your HP: " + playerHP);
                System.out.println("It's your turn now. Type the letter A to attack, or the letter D to defend.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    verSlimeHP = verSlimeHP - playerAttackDamage;
                    System.out.println("You attack the Verdant Slime for " + playerAttackDamage + " damage.\n" + "It has " + verSlimeHP + " HP left.");
                }
                else if (playerInput.equals("D"))
                {
                     verSlimeAttackDamage = verSlimeAttackDamage - playerBlock;
                     System.out.println("You now take 5 less damage from the Verdant Slime's next attack.");
                }
                System.out.println("The Verdant slime makes its move: Hop!");
                playerHP = playerHP - verSlimeAttackDamage;
                System.out.println("You take " + verSlimeAttackDamage + " damage. Your HP is now " + playerHP + ".");
                System.out.println("Verdant Slime HP: " + verSlimeHP);
                playerAttackDamage = 7;
                verSlimeAttackDamage = 5;
                System.out.println("It's your turn now. Type the letter A to attack, or the letter D to defend.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    verSlimeHP = verSlimeHP - playerAttackDamage;
                    System.out.println("You attack the Verdant Slime for 7 damage.");
                    System.out.println("It has " + verSlimeHP + " HP left.");
                }
                else if (playerInput.equals("D"))
                {
                    verSlimeAttackDamage = verSlimeAttackDamage - playerBlock;
                    System.out.println("You now take 5 less damage from the Verdant Slime's next attack.");
                }
                System.out.println("The Verdant slime makes its move: Gel Guard!");
                playerAttackDamage = playerAttackDamage - verSlimeBlock;
                System.out.println("Your next attack is reduced by 5 damage.");
            }
            System.out.println("----------------------------------");
            System.out.println("You have defeated the Verdant Slime! Statuses cleared.");
            System.out.println("Now feeling a bit wary from your previous fight in Cirtelgo Plains, you keep your blade by your side as you go through Dalihark Pass, to make sure nothing gets the drop on you.");
            System.out.println("Sure enough, that preparedness comes in handy, when a glob of mud becomes animate...");
            System.out.println("----------------------------------");
            System.out.println("You confront the Mud Slime.");
            mudSlimeHP = 28;
            playerAttackDamage = 7;
            while (mudSlimeHP > 0) {
                System.out.println("Mud Slime HP: " + mudSlimeHP);
                System.out.println("Your HP: " + playerHP);
                System.out.println("It's your turn now. Type the letter A to attack, or the letter D to defend.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    mudSlimeHP = mudSlimeHP - playerAttackDamage;
                    System.out.println("You attack the Mud Slime for " + playerAttackDamage + " damage.\n" + "It has " + mudSlimeHP + " HP left.");
                }
                else if (playerInput.equals("D"))
                {
                    mudSlimeAttackDamage = mudSlimeAttackDamage - playerBlock;
                    System.out.println("You now take 5 less damage from the Mud Slime's next attack.");
                }
                System.out.println("The Mud slime makes its move: Rock Hop!");
                playerHP = playerHP - mudSlimeAttackDamage;
                System.out.println("You take " + mudSlimeAttackDamage + " damage. Your HP is now " + playerHP + ".");
                System.out.println("Mud Slime HP: " + mudSlimeHP);
                playerAttackDamage = 7;
                mudSlimeAttackDamage = 7;
                System.out.println("It's your turn now. Type the letter A to attack, or the letter D to defend.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    mudSlimeHP = mudSlimeHP - playerAttackDamage;
                    System.out.println("You attack the Mud Slime for 7 damage.");
                    System.out.println("It has " + mudSlimeHP + " HP left.");
                }
                else if (playerInput.equals("D"))
                {
                    mudSlimeAttackDamage = mudSlimeAttackDamage - playerBlock;
                    System.out.println("You now take 5 less damage from the Mud Slime's next attack.");
                }
                    System.out.println("The Mud slime makes its move: Muddy Guard!");
                    playerAttackDamage = playerAttackDamage - mudSlimeBlock;
                    System.out.println("Your next attack is reduced by 5 damage.");
            }
            System.out.println("----------------------------------");
            System.out.println("You have defeated the Mud Slime! Statuses cleared.");
            System.out.println("Now you trek towards the peak of Mt. Eskervon. You see your final challenge up ahead.");
            if(playerHP <= 50)
            {
                System.out.println("Examining yourself, you seem to be in rough shape after those first couple battles. You know full well this last one won't go easy on you, so you need to be careful.");
            }
            System.out.println("----------------------------------");
            System.out.println("You confront the Ice Slime.");
            iceSlimeHP = 42;
            playerAttackDamage = 7;
            while (iceSlimeHP > 0) {
                System.out.println("Ice Slime HP: " + iceSlimeHP);
                System.out.println("Your HP: " + playerHP);
                System.out.println("It's your turn now. Type the letter A to attack, or the letter D to defend.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    iceSlimeHP = iceSlimeHP - playerAttackDamage;
                    System.out.println("You attack the Ice Slime for " + playerAttackDamage + " damage.\n" + "It has " + iceSlimeHP + " HP left.");
                }
                else if (playerInput.equals("D"))
                {
                    iceSlimeAttackDamage = iceSlimeAttackDamage - playerBlock;
                    System.out.println("You now take 5 less damage from the Ice Slime's next attack.");
                }
                System.out.println("The Ice slime makes its move: Frost Jiggle!");
                playerHP = playerHP - iceSlimeAttackDamage;
                System.out.println("You take " + iceSlimeAttackDamage + " damage. Your HP is now " + playerHP + ".");
                System.out.println("Ice Slime HP: " + iceSlimeHP);
                playerAttackDamage = 7;
                iceSlimeAttackDamage = 8;
                System.out.println("It's your turn now. Type the letter A to attack, or the letter D to defend.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    iceSlimeHP = iceSlimeHP - playerAttackDamage;
                    System.out.println("You attack the Ice Slime for 7 damage.");
                    System.out.println("It has " + iceSlimeHP + " HP left.");
                }
                else if (playerInput.equals("D"))
                {
                    iceSlimeAttackDamage = iceSlimeAttackDamage - playerBlock;
                    System.out.println("You now take 5 less damage from the Ice Slime's next attack.");
                }
                    System.out.println("The Ice slime makes its move: Flake Barrier!");
                    playerAttackDamage = playerAttackDamage - iceSlimeBlock;
                    System.out.println("Your next attack is reduced by 6 damage.");
            }
            System.out.println("----------------------------------");
            System.out.println("You have defeated the Ice Slime and are victorious, having made your way to your final destination!");
            System.out.println("Play again?\nEnter yes/no: ");
            WinLoss.playAgain();
        }

    }
}
