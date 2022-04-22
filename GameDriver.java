import java.util.Scanner;
public class GameDriver {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String test;
        String playerInput;
        int playerHP; //default is 100
        int playerAttackDamage = 7;
        int playerBlock = 5;
        int verSlimeHP; //default is 14
        int verSlimeAttackDamage = 5;
        int verSlimeBlock = 4;
        int yvatraHP; //default is 70
        int yvatraLightBlock = 5; //Charging Up
        int yvatraHeavyBlock = 8; //Puffed Chest
        int yvatraRoarDamage = 4; //Scalding Roar
        int yvatraLungeDamage = 9; //Searing Lunge
        int yvatraSlashDamage = 10; //Whirling Slash
        int mudSlimeHP; //default is 28
        int mudSlimeAttackDamage = 7;
        int mudSlimeBlock = 5;
        int sefrekisHP; //default is 110
        int sefrekisLightBlock = 7; //Amethyst Aegis
        int sefrekisHeavyBlock = 10; //Garnet Guard
        int sefrekisRoarDamage = 6; //Beryl Breath
        int sefrekisLungeDamage = 11; //Ruby Rend
        int sefrekisSlashDamage = 12; //Corundum Cyclone
        int iceSlimeHP; //default is 42
        int iceSlimeAttackDamage = 8;
        int iceSlimeBlock = 6;
        int conquerorHP; //default is 150
        int conquerorLightBlock = 9; //Instinctive Parry
        int conquerorHeavyBlock = 12; //Heavy Shield
        int conquerorRoarDamage = 8; //Sideswipe
        int conquerorLungeDamage = 13; //Overhead Slam
        int conquerorSlashDamage = 14; //Serrated Blade

        while(true){
            System.out.println("Welcome to the game Project Duplicity, by Group 3. This is a test version of the game, with more rudimentary features to act as a proof of concept.");
            System.out.println("Some extra features are not yet implemented, so please be patient.");
            System.out.println("For those not familiar with the rules, please consult Rules.txt in the game's root folder.");
            System.out.println("With that out of the way, type 'exit' to quit the game, or press enter to begin the game.");
            test = scan.nextLine();
            if(test.equals("exit")){
                System.out.println("Thanks for playing!");
                scan.close();
                break;
            }
            else if(test.equals("\n")){
                continue;
            }
            System.out.println("You will face a series of challenges back to back on your way to the peak of Mt. Eskervon. Death will mean a restart, so think carefully as you fight.");
            System.out.println("In order of progression:\t");
            System.out.println("1. Cirtelgo Plains");
            System.out.println("2. Dalihark Pass");
            System.out.println("3. Mt. Eskervon");
            System.out.println("Type any phrase to continue.");
            test = scan.nextLine();
            System.out.println("Entry successful: " + test);
            System.out.println("----------------------------------");
            System.out.println("As you tread your way through Cirtelgo Plains, headed towards Mt. Eskervon, out comes a foe to ambush you!");
            System.out.println("----------------------------------");
            System.out.println("You confront the Verdant Slime.");
            verSlimeHP = 14;
            playerHP = 100;
            playerAttackDamage = 7;
            while (verSlimeHP > 0 && playerHP > 0)
            {
                System.out.println("Verdant Slime HP: " + verSlimeHP);
                System.out.println("Your HP: " + playerHP);
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    verSlimeHP = verSlimeHP - playerAttackDamage;
                    System.out.println("You attack the Verdant Slime for " + playerAttackDamage + " damage.\n" + "It has " + verSlimeHP + " HP left.");
                    if (verSlimeHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                     verSlimeAttackDamage = verSlimeAttackDamage - playerBlock;
                     System.out.println("You now take 5 less damage from the Verdant Slime's next attack.");
                }
                System.out.println("The Verdant slime makes its move: Hop!");
                playerHP = playerHP - verSlimeAttackDamage;
                System.out.println("You take " + verSlimeAttackDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0)
                {
                    break;
                }
                System.out.println("Verdant Slime HP: " + verSlimeHP);
                playerAttackDamage = 7;
                verSlimeAttackDamage = 5;
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    verSlimeHP = verSlimeHP - playerAttackDamage;
                    System.out.println("You attack the Verdant Slime for 7 damage.");
                    System.out.println("It has " + verSlimeHP + " HP left.");
                    if (verSlimeHP <= 0)
                    {
                        break;
                    }
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
            if (playerHP <= 0)
            {
                System.out.println("----------------------------------");
                System.out.println("Alas, the hero has suffered an untimely demise- do not be disheartened.");
                System.out.println("Do you wish to play again?\nEnter yes/no: ");
                WinLoss.playAgain();
            }
            System.out.println("----------------------------------");
            System.out.println("You have defeated the Verdant Slime! Statuses cleared.");
            System.out.println("As you proceed, a menacing, lion-like creature with two tails and ram horns appears to confront you.");
            System.out.println("One of the nomads in the area told you on the way that it was given a horrible moniker by travelers, to dissuade foolhardy adventurers.");
            System.out.println("You're hardy but by no means a fool, however, so you face your challenge head-on.");
            System.out.println("----------------------------------");
            System.out.println("You confront Yvatra the Prowler!");
            System.out.println("Its mane flares with a sense of dominance.");
            yvatraHP = 70;
            playerAttackDamage = 7;
            while (yvatraHP > 0 && playerHP > 0)
            {
                System.out.println("Yvatra the Prowler's HP: " + yvatraHP);
                System.out.println("Your HP: " + playerHP);
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    yvatraHP = yvatraHP - playerAttackDamage;
                    System.out.println("You attack Yvatra the Prowler for 7 damage.");
                    System.out.println("It has " + yvatraHP + " HP left.");
                    if (yvatraHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    System.out.println("You now take 5 less damage from Yvatra's next attack.");
                }
                System.out.println("Yvatra the Prowler makes its move: Charging Up!");
                playerAttackDamage = playerAttackDamage - yvatraLightBlock;
                System.out.println("Your next attack is reduced by 5 damage.");
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    yvatraHP = yvatraHP - playerAttackDamage;
                    System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + " damage.\n" + "It has " + yvatraHP + " HP left.");
                    if (yvatraHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    yvatraLungeDamage = yvatraLungeDamage - playerBlock;
                    System.out.println("You now take 5 less damage from Yvatra's next attack.");
                }
                System.out.println("Yvatra the Prowler makes its move: Searing Lunge!");
                playerHP = playerHP - yvatraLungeDamage;
                System.out.println("You take " + yvatraLungeDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0)
                {
                    break;
                }
                System.out.println("Yvatra the Prowler's HP: " + yvatraHP);
                playerAttackDamage = 7;
                yvatraLungeDamage = 9;
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    yvatraHP = yvatraHP - playerAttackDamage;
                    System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + " damage.\n" + "It has " + yvatraHP + " HP left.");
                    if (yvatraHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    yvatraSlashDamage = yvatraSlashDamage - playerBlock;
                    System.out.println("You now take 5 less damage from Yvatra's next attack.");
                }
                System.out.println("Yvatra the Prowler makes its move: Whirling Slash!");
                playerHP = playerHP - yvatraSlashDamage;
                System.out.println("You take 4 hits, resulting in " + yvatraSlashDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0)
                {
                    break;
                }
                yvatraSlashDamage = 10;
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    yvatraHP = yvatraHP - playerAttackDamage;
                    System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + " damage.\n" + "It has " + yvatraHP + " HP left.");
                    if (yvatraHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    System.out.println("You now take 5 less damage from Yvatra's next attack.");
                }
                System.out.println("Yvatra the Prowler makes its move: Puffed Chest!");
                playerAttackDamage = playerAttackDamage - yvatraHeavyBlock;
                System.out.println("Your next attack is reduced by 8 damage.");
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    yvatraHP = yvatraHP - playerAttackDamage;
                    System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + " damage.\n" + "It has " + yvatraHP + " HP left.");
                    if (yvatraHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    System.out.println("You now take 5 less damage from Yvatra's next attack.");
                }
                System.out.println("Yvatra the Prowler makes its move: Rest!");
                yvatraHP = yvatraHP + 3;
                System.out.println("It healed 3 HP. Its HP is now: " + yvatraHP);
                playerAttackDamage = 7;
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    yvatraHP = yvatraHP - playerAttackDamage;
                    System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + " damage.\n" + "It has " + yvatraHP + " HP left.");
                    if (yvatraHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    yvatraRoarDamage = yvatraRoarDamage - playerBlock;
                    System.out.println("You now take 5 less damage from Yvatra's next attack.");
                }
                System.out.println("Yvatra the Prowler makes its move: Scalding Roar!");
                playerHP = playerHP - yvatraRoarDamage;
                System.out.println("You take " + yvatraRoarDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0)
                {
                    break;
                }
                yvatraRoarDamage = 4;
            }
            if (playerHP <= 0)
            {
                System.out.println("----------------------------------");
                System.out.println("Alas, the hero has suffered an untimely demise- do not be disheartened.");
                System.out.println("Do you wish to play again?\nEnter yes/no: ");
                WinLoss.playAgain();
            }
            System.out.println("----------------------------------");
            System.out.println("You have defeated Yvatra the Prowler and feel yourself growing stronger!");
            System.out.println("All your wounds are healed from before, your max HP increases to 120, and your attack card now deals 9 damage.");
            System.out.println("Your defend card is also sturdier, taking 7 damage before faltering.");
            System.out.println("----------------------------------");
            System.out.println("Wary from your previous fights in Cirtelgo Plains, you keep your attack cards at the ready as you go through Dalihark Pass, to make sure nothing gets the drop on you.");
            System.out.println("Sure enough, that preparedness comes in handy, when a glob of mud becomes animate...");
            System.out.println("----------------------------------");
            System.out.println("You confront the Mud Slime.");
            mudSlimeHP = 28;
            playerHP = 120;
            playerAttackDamage = 9;
            playerBlock = 7;
            while (mudSlimeHP > 0 && playerHP > 0)
            {
                System.out.println("Mud Slime HP: " + mudSlimeHP);
                System.out.println("Your HP: " + playerHP);
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    mudSlimeHP = mudSlimeHP - playerAttackDamage;
                    System.out.println("You attack the Mud Slime for " + playerAttackDamage + " damage.\n" + "It has " + mudSlimeHP + " HP left.");
                    if (mudSlimeHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    mudSlimeAttackDamage = mudSlimeAttackDamage - playerBlock;
                    System.out.println("You now take " + playerBlock + " less damage from the Mud Slime's next attack.");
                }
                System.out.println("The Mud slime makes its move: Rock Hop!");
                playerHP = playerHP - mudSlimeAttackDamage;
                System.out.println("You take " + mudSlimeAttackDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0)
                {
                    break;
                }
                System.out.println("Mud Slime HP: " + mudSlimeHP);
                playerAttackDamage = 9;
                mudSlimeAttackDamage = 7;
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    mudSlimeHP = mudSlimeHP - playerAttackDamage;
                    System.out.println("You attack the Mud Slime for " + playerAttackDamage + " damage.");
                    System.out.println("It has " + mudSlimeHP + " HP left.");
                    if (mudSlimeHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    mudSlimeAttackDamage = mudSlimeAttackDamage - playerBlock;
                    System.out.println("You now take " + playerBlock + " less damage from the Mud Slime's next attack.");
                }
                    System.out.println("The Mud slime makes its move: Muddy Guard!");
                    playerAttackDamage = playerAttackDamage - mudSlimeBlock;
                    System.out.println("Your next attack is reduced by 5 damage.");
            }
            if (playerHP <= 0)
            {
                System.out.println("----------------------------------");
                System.out.println("Alas, the hero has suffered an untimely demise- do not be disheartened.");
                System.out.println("Do you wish to play again?\nEnter yes/no: ");
                WinLoss.playAgain();
            }
            System.out.println("----------------------------------");
            System.out.println("You have defeated the Mud Slime! Statuses cleared.");
            System.out.println("Making your way into a tunnel system, you come across a half-giant surrounded by shinies.");
            System.out.println("His voice is incoherent, but his tone is clear: you're an interloper and he wants you gone.");
            System.out.println("You're ready to put up a fight, though. Not because of the gems he hoards, but because of your objective.");
            System.out.println("----------------------------------");
            System.out.println("You confront Sefrekis, Keeper of Jewels!");
            sefrekisHP = 110;
            playerAttackDamage = 9;
            while (sefrekisHP > 0 && playerHP > 0)
            {
                System.out.println("Sefrekis' HP: " + sefrekisHP);
                System.out.println("Your HP: " + playerHP);
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    sefrekisHP = sefrekisHP - playerAttackDamage;
                    System.out.println("You attack Sefrekis for " + playerAttackDamage + " damage.");
                    System.out.println("He has " + sefrekisHP + " HP left.");
                    if (sefrekisHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    System.out.println("You now take " + playerBlock + " less damage from Sefrekis' next attack.");
                }
                System.out.println("Sefrekis makes his move: Amethyst Aegis!");
                playerAttackDamage = playerAttackDamage - sefrekisLightBlock;
                System.out.println("Your next attack is reduced by 7 damage.");
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    sefrekisHP = sefrekisHP - playerAttackDamage;
                    System.out.println("You attack Sefrekis for " + playerAttackDamage + " damage.\n" + "He has " + sefrekisHP + " HP left.");
                    if (sefrekisHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    sefrekisLungeDamage = sefrekisLungeDamage - playerBlock;
                    System.out.println("You now take " + playerBlock + " less damage from Sefrekis' next attack.");
                }
                System.out.println("Sefrekis makes his next move: Ruby Rend!");
                playerHP = playerHP - sefrekisLungeDamage;
                System.out.println("You take " + sefrekisLungeDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0)
                {
                    break;
                }
                System.out.println("Sefrekis' HP: " + sefrekisHP);
                playerAttackDamage = 9;
                sefrekisLungeDamage = 11;
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    sefrekisHP = sefrekisHP - playerAttackDamage;
                    System.out.println("You attack Sefrekis for " + playerAttackDamage + " damage.\n" + "He has " + sefrekisHP + " HP left.");
                    if (sefrekisHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    sefrekisSlashDamage = sefrekisSlashDamage - playerBlock;
                    System.out.println("You now take " + playerBlock + " less damage from Sefrekis' next attack.");
                }
                System.out.println("Sefrekis makes his next move: Corundum Cyclone!");
                playerHP = playerHP - sefrekisSlashDamage;
                System.out.println("You take 3 hits, resulting in " + sefrekisSlashDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0)
                {
                    break;
                }
                sefrekisSlashDamage = 12;
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    sefrekisHP = sefrekisHP - playerAttackDamage;
                    System.out.println("You attack Sefrekis for " + playerAttackDamage + " damage.\n" + "He has " + sefrekisHP + " HP left.");
                    if (sefrekisHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    System.out.println("You now take " + playerBlock + " less damage from Sefrekis' next attack.");
                }
                System.out.println("Sefrekis makes his move: Garnet Guard!");
                playerAttackDamage = playerAttackDamage - sefrekisHeavyBlock;
                System.out.println("Your next attack is reduced by 10 damage.");
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    sefrekisHP = sefrekisHP - playerAttackDamage;
                    System.out.println("You attack Sefrekis for " + playerAttackDamage + " damage.\n" + "He has " + sefrekisHP + " HP left.");
                    if (sefrekisHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    System.out.println("You now take " + playerBlock + " less damage from Sefrekis' next attack.");
                }
                System.out.println("Sefrekis makes his next move: Tourmaline Tonic!");
                sefrekisHP = sefrekisHP + 4;
                System.out.println("He healed 4 HP. His HP is now: " + sefrekisHP);
                playerAttackDamage = 9;
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    sefrekisHP = sefrekisHP - playerAttackDamage;
                    System.out.println("You attack Sefrekis for " + playerAttackDamage + " damage.\n" + "He has " + sefrekisHP + " HP left.");
                    if (sefrekisHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    sefrekisRoarDamage = sefrekisRoarDamage - playerBlock;
                    System.out.println("You now take " + playerBlock + " less damage from Sefrekis' next attack.");
                }
                System.out.println("Sefrekis makes his next move: Beryl Breath!");
                playerHP = playerHP - sefrekisRoarDamage;
                System.out.println("You take " + sefrekisRoarDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0)
                {
                    break;
                }
                sefrekisRoarDamage = 6;
            }
            if (playerHP <= 0)
            {
                System.out.println("----------------------------------");
                System.out.println("Alas, the hero has suffered an untimely demise- do not be disheartened.");
                System.out.println("Do you wish to play again?\nEnter yes/no: ");
                WinLoss.playAgain();
            }
            System.out.println("----------------------------------");
            System.out.println("You have defeated Sefrekis, Keeper of Jewels, and feel yourself growing stronger!");
            System.out.println("All your wounds are healed from before, your max HP increases to 140, and your attack now deals 11 damage.");
            System.out.println("Your defend is also sturdier than ever, taking 9 damage before faltering.");
            System.out.println("----------------------------------");
            playerAttackDamage = 11;
            playerHP = 140;
            playerBlock = 9;
            System.out.println("Now you trek towards the peak of Mt. Eskervon.\nBefore you can get to the summit, however, a blob of ice makes its presence known.");
            System.out.println("----------------------------------");
            System.out.println("You confront the Ice Slime.");
            iceSlimeHP = 42;
            while (iceSlimeHP > 0 && playerHP > 0)
            {
                System.out.println("Ice Slime HP: " + iceSlimeHP);
                System.out.println("Your HP: " + playerHP);
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    iceSlimeHP = iceSlimeHP - playerAttackDamage;
                    System.out.println("You attack the Ice Slime for " + playerAttackDamage + " damage.\n" + "It has " + iceSlimeHP + " HP left.");
                    if (iceSlimeHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    iceSlimeAttackDamage = iceSlimeAttackDamage - playerBlock;
                    System.out.println("You now take " + playerBlock + " less damage from the Ice Slime's next attack.");
                }
                System.out.println("The Ice slime makes its move: Frost Jiggle!");
                playerHP = playerHP - iceSlimeAttackDamage;
                System.out.println("You take " + iceSlimeAttackDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0)
                {
                    break;
                }
                System.out.println("Ice Slime HP: " + iceSlimeHP);
                playerAttackDamage = 11;
                iceSlimeAttackDamage = 8;
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    iceSlimeHP = iceSlimeHP - playerAttackDamage;
                    System.out.println("You attack the Ice Slime for " + playerAttackDamage + " damage.");
                    System.out.println("It has " + iceSlimeHP + " HP left.");
                    if (iceSlimeHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    iceSlimeAttackDamage = iceSlimeAttackDamage - playerBlock;
                    System.out.println("You now take " + playerBlock + " less damage from the Ice Slime's next attack.");
                }
                    System.out.println("The Ice slime makes its move: Flake Barrier!");
                    playerAttackDamage = playerAttackDamage - iceSlimeBlock;
                    System.out.println("Your next attack is reduced by 6 damage.");
            }
            if (playerHP <= 0)
            {
                System.out.println("Alas, the hero has suffered an untimely demise- do not be disheartened.");
                System.out.println("Do you wish to play again?\nEnter yes/no: ");
                WinLoss.playAgain();
            }
            System.out.println("----------------------------------");
            System.out.println("You defeat the Ice Slime! Now you move up to the summit of Mt. Eskervon, and waiting for you is a hulking marvel of a man... if he even is human.");
            System.out.println("He stands roughly 9 feet tall and carries several dangerous-looking weapons, and you can't help but feel a bit of fear as you face him directly.");
            System.out.println("Then, you remember who he is: the source of the evil blighting this land. You steel yourself and prepare for combat.");
            System.out.println("----------------------------------");
            System.out.println("You confront The Mercurial Conqueror!");
            conquerorHP = 150;
            playerAttackDamage = 11;
            while (conquerorHP > 0 && playerHP > 0)
            {
                System.out.println("Conqueror' HP: " + conquerorHP);
                System.out.println("Your HP: " + playerHP);
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                if (test.equals("Mr. Rochelle is cool"))
                {
                    System.out.println("You also notice an extra card that mysteriously appeared in your bag. Type the letter M to play it.");
                }
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    conquerorHP = conquerorHP - playerAttackDamage;
                    System.out.println("You attack The Mercurial Conqueror for " + playerAttackDamage + " damage.");
                    System.out.println("He has " + conquerorHP + " HP left.");
                    if (conquerorHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    System.out.println("You now take " + playerBlock + " less damage from The Mercurial Conqueror's next attack.");
                }
                else if (playerInput.equals("M") && test.equals("Mr. Rochelle is cool"))
                {
                    System.out.println("You play the card, and suddenly, both you and The Mercurial Conqueror hear an angelic choir.");
                    System.out.println("Then, down comes a beam of light, which eradicates The Mercurial Conqueror, leaving only dust behind.");
                    conquerorHP = 0;
                    break;
                }
                System.out.println("The Mercurial Conqueror makes his move: Instinctive Parry!");
                playerAttackDamage = playerAttackDamage - conquerorLightBlock;
                System.out.println("Your next attack is reduced by 9 damage.");
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    conquerorHP = conquerorHP - playerAttackDamage;
                    System.out.println("You attack Conqueror for " + playerAttackDamage + " damage.\n" + "He has " + conquerorHP + " HP left.");
                    if (conquerorHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    conquerorLungeDamage = conquerorLungeDamage - playerBlock;
                    System.out.println("You now take " + playerBlock + " less damage from The Mercurial Conqueror's next attack.");
                }
                System.out.println("The Mercurial Conqueror makes his next move: Overhead Slam!");
                playerHP = playerHP - conquerorLungeDamage;
                System.out.println("You take " + conquerorLungeDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0)
                {
                    break;
                }
                System.out.println("The Mercurial Conqueror's HP: " + conquerorHP);
                playerAttackDamage = 11;
                conquerorLungeDamage = 13;
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    conquerorHP = conquerorHP - playerAttackDamage;
                    System.out.println("You attack The Mercurial Conqueror for " + playerAttackDamage + " damage.\n" + "He has " + conquerorHP + " HP left.");
                    if (conquerorHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    conquerorSlashDamage = conquerorSlashDamage - playerBlock;
                    System.out.println("You now take " + playerBlock + " less damage from The Mercurial Conqueror's next attack.");
                }
                System.out.println("The Mercurial Conqueror makes his next move: Serrated Blade!");
                playerHP = playerHP - conquerorSlashDamage;
                System.out.println("You take 3 hits, resulting in " + conquerorSlashDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0)
                {
                    break;
                }
                conquerorSlashDamage = 14;
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    conquerorHP = conquerorHP - playerAttackDamage;
                    System.out.println("You attack The Mercurial Conqueror for " + playerAttackDamage + " damage.\n" + "He has " + conquerorHP + " HP left.");
                    if (conquerorHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    System.out.println("You now take " + playerBlock + " less damage from The Mercurial Conqueror's next attack.");
                }
                System.out.println("The Mercurial Conqueror makes his next move: Heavy Shield!");
                playerAttackDamage = playerAttackDamage - conquerorHeavyBlock;
                System.out.println("Your next attack is reduced by 12 damage.");
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    conquerorHP = conquerorHP - playerAttackDamage;
                    System.out.println("You attack The Mercurial Conqueror for " + playerAttackDamage + " damage.\n" + "He has " + conquerorHP + " HP left.");
                    if (conquerorHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    System.out.println("You now take " + playerBlock + " less damage from The Mercurial Conqueror's next attack.");
                }
                System.out.println("The Mercurial Conqueror makes his next move: Hasty Patching!");
                conquerorHP = conquerorHP + 5;
                System.out.println("He healed 5 HP. His HP is now: " + conquerorHP);
                playerAttackDamage = 11;
                System.out.println("It's your turn now. Type the letter A to play an attack card, or the letter D to use a defend card.");
                playerInput = scan.nextLine();
                if (playerInput.equals("A"))
                {
                    conquerorHP = conquerorHP - playerAttackDamage;
                    System.out.println("You attack The Mercurial Conqueror for " + playerAttackDamage + " damage.\n" + "He has " + conquerorHP + " HP left.");
                    if (conquerorHP <= 0)
                    {
                        break;
                    }
                }
                else if (playerInput.equals("D"))
                {
                    conquerorRoarDamage = conquerorRoarDamage - playerBlock;
                    System.out.println("You now take " + playerBlock + " less damage from The Mercurial Conqueror's next attack.");
                }
                System.out.println("Conqueror makes his next move: Sideswipe!");
                playerHP = playerHP - conquerorRoarDamage;
                System.out.println("You take " + conquerorRoarDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0)
                {
                    break;
                }
                conquerorRoarDamage = 8;
            }
            if (playerHP <= 0)
            {
                System.out.println("Alas, the hero has suffered an untimely demise- do not be disheartened.");
                System.out.println("Do you wish to play again?\nEnter yes/no: ");
                WinLoss.playAgain();
            }
            System.out.println("----------------------------------");
            System.out.println("You have defeated The Mercurial Conqueror and are victorious, having made your way to your final destination to bring peace back to the land!");
            System.out.println("For now, all has been righted, and you can finally take a well-deserved rest.");
            System.out.println("Play again?\nEnter yes/no: ");
            WinLoss.playAgain();
        }

    }
}
