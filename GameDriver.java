import java.util.Scanner;
public class GameDriver {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String test;
        String playerInput;
        int playerHP;
        int playerAttackDamage;
        int playerBlock = 5;
        int verSlimeHP;
        int verSlimeAttackDamage = 5;
        int verSlimeBlock = 4;
        int mudSlimeHP = 28;
        int mudSlimeAttackDamage = 7;
        int mudSlimeBlock = 5;
        int iceSlimeHP = 42;
        int iceSlimeAttackDamage = 8;
        int iceSlimeBlock = 6;

        while(true){
            System.out.println("Welcome to the game Project Duplicity. Do you have what it takes to make it to the peak of Mt. Eskervon and beat your nemesis?");
            System.out.println("Type 'exit' to quit the game, or press enter to begin the game.");

            test = scan.nextLine();
            if(test.equals("exit")){
                System.out.println("Thanks for playing!");
                scan.close();
                break;
            }
            else if(test.equals("\n")){
                continue;
            }
            System.out.println("Which monster do you want to confront?\t");
            System.out.println("1. Verdant Slime (easy)");
            System.out.println("2. Mud Slime (medium)");
            System.out.println("3. Ice Slime (hard)");
            System.out.println("Enter the name of the selected monster below.");
            test = scan.nextLine();
            System.out.println("Selection complete. \nMonster name entered: " + test);

            if(test.equals("Verdant Slime"))
            {
                System.out.println("You confront the Verdant Slime.");
                verSlimeHP = 14;
                playerHP = 100;
                while (verSlimeHP > 0) {
                    playerAttackDamage = 7;
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
                System.out.println("You have defeated the Verdant Slime!");
                test = "";
            }
            System.out.println("Play again?\nEnter yes/no: ");
            WinLoss.playAgain();
        }

    }
}
