import java.util.Scanner;
public class GameDriver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String test;
        String playerInput;
        Deck deck = new Deck();
        int playerHP = 100;
        int playerAttackDamage = 7;
        int playerBlock = 5;
        int bossHP = 70;
        int bossLightBlock = 5; //Charging Up, Amethyst Aegis, Instinctive Parry
        int bossHeavyBlock = 8; //Puffed Chest, Garnet Guard, Heavy Shield
        int bossRoarDamage = 4; //Scalding Roar, Beryl Breath, Sideswipe
        int bossLungeDamage = 9; //Searing Lunge, Ruby Rend, Overhead Slam
        int bossSlashDamage = 10; //Whirling Slash, Corundum Cyclone, Serrated Blade

        while (true) {
            Text.introText();
            test = scan.nextLine();
            if (test.equals("exit")) {
                System.out.println("Thanks for playing!");
                scan.close();
                break;
            } else if (test.equals("\n")) {
                continue;
            }
            Text.locationText(); //text for location bit
            test = scan.nextLine();
            System.out.println("Entry successful: " + test);
            System.out.println("----------------------------------");
            Text.bossEncounter1Text();
            System.out.println("----------------------------------");

            //----------------------------------------------------------------------------
            // Start of boss 1
            deck.clear();
            deck.add();
            deck.printCards();
            while (bossHP > 0 && playerHP > 0) {
                System.out.println("Yvatra the Prowler's HP: " + bossHP);
                System.out.println("Your HP: " + playerHP);
                Text.optionsText();
                playerInput = scan.nextLine();

                // Attack
                if (playerInput.equals("A")) {
                    bossHP -= playerAttackDamage;
                    System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + " damage.");
                    System.out.println("It has " + bossHP + " HP left.");
                    if (bossHP <= 0) {
                        break;
                    }
                }

                // Defend
                else if (playerInput.equals("D")) {
                    System.out.println("You now take 5 less damage from Yvatra's next attack.");
                }

                // Special
                else if (playerInput.equals("S")) {
                    System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                    deck.printCards();
                    playerInput = scan.nextLine();
                    if (playerInput.equals("1") && deck.hasCard(0)) {
                        deck.playCard(0);
                        bossHP -= playerAttackDamage + 1;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+1) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("2") && deck.hasCard(1)) {
                        deck.playCard(1);
                        bossHP -= playerAttackDamage + 2;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+2) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("3") && deck.hasCard(2)) {
                        deck.playCard(2);
                        bossHP -= playerAttackDamage + 3;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+3) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }
                }

                //No move
                else {
                    System.out.println("You fumble with your cards and miss your turn!");
                }

                //Boss move
                System.out.println("Yvatra the Prowler makes its move: Charging Up!");
                playerAttackDamage -= bossLightBlock;
                System.out.println("Your next attack is reduced by " + bossLightBlock + " damage.");

                //----------------------------------------------------------------------------
                //Turn 2
                Text.optionsText();
                playerInput = scan.nextLine();

                //Attack
                if (playerInput.equals("A")) {
                    bossHP -= playerAttackDamage;
                    System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + " damage.\n" + "It has " + bossHP + " HP left.");
                    if (bossHP <= 0) {
                        break;
                    }
                }

                //Defend
                else if (playerInput.equals("D")) {
                    bossLungeDamage -= playerBlock;
                    System.out.println("You now take 5 less damage from Yvatra's next attack.");
                }

                //Special
                else if (playerInput.equals("S")) {
                    System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                    deck.printCards();
                    playerInput = scan.nextLine();
                    if (playerInput.equals("1") && deck.hasCard(0)) {
                        deck.playCard(0);
                        bossHP -= playerAttackDamage + 1;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+1) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("2") && deck.hasCard(1)) {
                        deck.playCard(1);
                        bossHP -= playerAttackDamage + 2;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+2) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("3") && deck.hasCard(2)) {
                        deck.playCard(2);
                        bossHP -= playerAttackDamage + 3;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+3) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }
                }

                //No move
                else {
                    System.out.println("You fumble with your cards and miss your turn!");
                }

                //Enemy move
                System.out.println("Yvatra the Prowler makes its move: Searing Lunge!");
                playerHP -= bossLungeDamage;
                System.out.println("You take " + bossLungeDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0) {
                    break;
                }
                playerAttackDamage = 7;
                bossLungeDamage = 9;

                //----------------------------------------------------------------------------
                //Turn 3
                Text.optionsText();
                playerInput = scan.nextLine();

                //Attack
                if (playerInput.equals("A")) {
                    bossHP -= playerAttackDamage;
                    System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + " damage.\n" + "It has " + bossHP + " HP left.");
                    if (bossHP <= 0) {
                        break;
                    }
                }

                //Defend
                else if (playerInput.equals("D")) {
                    bossSlashDamage -= playerBlock;
                    System.out.println("You now take 5 less damage from Yvatra's next attack.");
                }

                //Special
                else if (playerInput.equals("S")) {
                    System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                    deck.printCards();
                    playerInput = scan.nextLine();
                    if (playerInput.equals("1") && deck.hasCard(0)) {
                        deck.playCard(0);
                        bossHP -= playerAttackDamage + 1;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+1) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("2") && deck.hasCard(1)) {
                        deck.playCard(1);
                        bossHP -= playerAttackDamage + 2;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+2) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("3") && deck.hasCard(2)) {
                        deck.playCard(2);
                        bossHP -= playerAttackDamage + 3;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+3) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }
                }

                //No move
                else {
                    System.out.println("You fumble with your cards and miss your turn!");
                }

                //Enemy move
                System.out.println("Yvatra the Prowler makes its move: Whirling Slash!");
                playerHP -= bossSlashDamage;
                System.out.println("You take 4 hits, resulting in " + bossSlashDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0) {
                    break;
                }
                bossSlashDamage = 10;

                //----------------------------------------------------------------------------
                //Turn 4
                Text.optionsText();
                playerInput = scan.nextLine();

                //Attack
                if (playerInput.equals("A")) {
                    bossHP -= playerAttackDamage;
                    System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + " damage.\n" + "It has " + bossHP + " HP left.");
                    if (bossHP <= 0) {
                        break;
                    }
                }

                //Defend
                else if (playerInput.equals("D")) {
                    System.out.println("You now take 5 less damage from Yvatra's next attack.");
                }

                //Special
                else if (playerInput.equals("S")) {
                    System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                    deck.printCards();
                    playerInput = scan.nextLine();
                    if (playerInput.equals("1") && deck.hasCard(0)) {
                        deck.playCard(0);
                        bossHP -= playerAttackDamage + 1;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+1) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("2") && deck.hasCard(1)) {
                        deck.playCard(1);
                        bossHP -= playerAttackDamage + 2;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+2) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("3") && deck.hasCard(2)) {
                        deck.playCard(2);
                        bossHP -= playerAttackDamage + 3;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+3) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }
                }

                //No move
                else {
                    System.out.println("You fumble with your cards and miss your turn!");
                }

                //Enemy move
                System.out.println("Yvatra the Prowler makes its move: Puffed Chest!");

                //----------------------------------------------------------------------------
                //Turn 5
                playerAttackDamage -= bossHeavyBlock;
                System.out.println("Your next attack is reduced by 8 damage.");
                Text.optionsText();
                playerInput = scan.nextLine();

                //Attack
                if (playerInput.equals("A")) {
                    bossHP -= playerAttackDamage;
                    System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + " damage.\n" + "It has " + bossHP + " HP left.");
                    if (bossHP <= 0) {
                        break;
                    }
                }

                //Defend
                else if (playerInput.equals("D")) {
                    System.out.println("You now take 5 less damage from Yvatra's next attack.");
                }

                //Special
                else if (playerInput.equals("S")) {
                    System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                    deck.printCards();
                    playerInput = scan.nextLine();
                    if (playerInput.equals("1") && deck.hasCard(0)) {
                        deck.playCard(0);
                        bossHP -= playerAttackDamage + 1;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+1) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("2") && deck.hasCard(1)) {
                        deck.playCard(1);
                        bossHP -= playerAttackDamage + 2;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+2) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("3") && deck.hasCard(2)) {
                        deck.playCard(2);
                        bossHP -= playerAttackDamage + 3;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+3) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }
                }

                //No move
                else {
                    System.out.println("You fumble with your cards and miss your turn!");
                }

                //Enemy move
                System.out.println("Yvatra the Prowler makes its move: Rest!");
                bossHP = bossHP + 3;
                System.out.println("It healed 3 HP. Its HP is now: " + bossHP);
                playerAttackDamage = 7;


                //----------------------------------------------------------------------------
                //Turn 6
                Text.optionsText();
                playerInput = scan.nextLine();

                //Attack
                if (playerInput.equals("A")) {
                    bossHP -= playerAttackDamage;
                    System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + " damage.\n" + "It has " + bossHP + " HP left.");
                    if (bossHP <= 0) {
                        break;
                    }
                }

                //Defend
                else if (playerInput.equals("D")) {
                    bossRoarDamage -= playerBlock;
                    System.out.println("You now take 5 less damage from Yvatra's next attack.");
                }

                //Special
                else if (playerInput.equals("S")) {
                    System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                    deck.printCards();
                    playerInput = scan.nextLine();
                    if (playerInput.equals("1") && deck.hasCard(0)) {
                        deck.playCard(0);
                        bossHP -= playerAttackDamage + 1;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+1) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("2") && deck.hasCard(1)) {
                        deck.playCard(1);
                        bossHP -= playerAttackDamage + 2;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+2) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("3") && deck.hasCard(2)) {
                        deck.playCard(2);
                        bossHP -= playerAttackDamage + 3;
                        System.out.println("You attack Yvatra the Prowler for " + playerAttackDamage + "(+3) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }
                }

                //No move
                else {
                    System.out.println("You fumble with your cards and miss your turn!");
                }

                //Enemy move
                System.out.println("Yvatra the Prowler makes its move: Scalding Roar!");
                playerHP -= bossRoarDamage;
                System.out.println("You take " + bossRoarDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0) {
                    break;
                }
                bossRoarDamage = 4;
            }
            if (playerHP <= 0) {
                System.out.println("----------------------------------");
                System.out.println("Alas, the hero has suffered an untimely demise- do not be disheartened.");
                System.out.println("Do you wish to play again?\nEnter yes/no: ");
                WinLoss.playAgain();
            }
            Text.yvatraDefeatedText();
            deck.clear();
            //Boss 1 defeated (End of encounter)
            //----------------------------------------------------------------------------
            Text.bossEncounter2Text();
            //----------------------------------------------------------------------------
            // Start of Boss 2
            playerHP = 120;
            playerAttackDamage = 9;
            playerBlock = 7;
            bossHP = 110;
            bossLightBlock = 7; //Amethyst Aegis
            bossHeavyBlock = 10; //Garnet Guard
            bossRoarDamage = 6; //Beryl Breath
            bossLungeDamage = 11; //Ruby Rend
            bossSlashDamage = 12; //Corundum Cyclone
            deck.add();
            deck.printCards();
            while (bossHP > 0 && playerHP > 0) {
                System.out.println("Sefrekis' HP: " + bossHP);
                System.out.println("Your HP: " + playerHP);
                Text.optionsText();
                playerInput = scan.nextLine();

                //Attack
                if (playerInput.equals("A")) {
                    bossHP -= playerAttackDamage;
                    System.out.println("You attack Sefrekis for " + playerAttackDamage + " damage.");
                    System.out.println("He has " + bossHP + " HP left.");
                    if (bossHP <= 0) {
                        break;
                    }
                }

                //Defend
                else if (playerInput.equals("D")) {
                    System.out.println("You now take " + playerBlock + " less damage from Sefrekis' next attack.");
                }

                //Special
                else if (playerInput.equals("S")) {
                    System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                    deck.printCards();
                    playerInput = scan.nextLine();
                    if (playerInput.equals("1") && deck.hasCard(0)) {
                        deck.playCard(0);
                        bossHP -= playerAttackDamage + 1;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+1) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("2") && deck.hasCard(1)) {
                        deck.playCard(1);
                        bossHP -= playerAttackDamage + 2;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+2) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("3") && deck.hasCard(2)) {
                        deck.playCard(2);
                        bossHP -= playerAttackDamage + 3;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+3) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }
                }

                //No move
                else {
                    System.out.println("You fumble with your cards and miss your turn!");
                }

                //Enemy move
                System.out.println("Sefrekis makes his move: Amethyst Aegis!");

                //----------------------------------------------------------------------------
                //Turn 2
                playerAttackDamage -= bossLightBlock;
                System.out.println("Your next attack is reduced by " + bossLightBlock + " damage.");
                Text.optionsText();
                playerInput = scan.nextLine();

                //Attack
                if (playerInput.equals("A")) {
                    bossHP -= playerAttackDamage;
                    System.out.println("You attack Sefrekis for " + playerAttackDamage + " damage.\n" + "He has " + bossHP + " HP left.");
                    if (bossHP <= 0) {
                        break;
                    }
                }

                //Defend
                else if (playerInput.equals("D")) {
                    bossLungeDamage -= playerBlock;
                    System.out.println("You now take " + playerBlock + " less damage from Sefrekis' next attack.");
                }

                //Special
                else if (playerInput.equals("S")) {
                    System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                    deck.printCards();
                    playerInput = scan.nextLine();
                    if (playerInput.equals("1") && deck.hasCard(0)) {
                        deck.playCard(0);
                        bossHP -= playerAttackDamage + 1;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+1) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("2") && deck.hasCard(1)) {
                        deck.playCard(1);
                        bossHP -= playerAttackDamage + 2;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+2) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("3") && deck.hasCard(2)) {
                        deck.playCard(2);
                        bossHP -= playerAttackDamage + 3;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+3) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }
                }

                //No move
                else {
                    System.out.println("You fumble with your cards and miss your turn!");
                }

                //Enemy move
                System.out.println("Sefrekis makes his next move: Ruby Rend!");
                playerHP -= bossLungeDamage;
                System.out.println("You take " + bossLungeDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0) {
                    break;
                }
                System.out.println("Sefrekis' HP: " + bossHP);
                playerAttackDamage = 9;
                bossLungeDamage = 11;

                //----------------------------------------------------------------------------
                //Turn 3
                Text.optionsText();
                playerInput = scan.nextLine();

                //Attack
                if (playerInput.equals("A")) {
                    bossHP -= playerAttackDamage;
                    System.out.println("You attack Sefrekis for " + playerAttackDamage + " damage.\n" + "He has " + bossHP + " HP left.");
                    if (bossHP <= 0) {
                        break;
                    }
                }

                //Defend
                else if (playerInput.equals("D")) {
                    bossSlashDamage -= playerBlock;
                    System.out.println("You now take " + playerBlock + " less damage from Sefrekis' next attack.");
                }

                //Special
                else if (playerInput.equals("S")) {
                    System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                    deck.printCards();
                    playerInput = scan.nextLine();
                    if (playerInput.equals("1") && deck.hasCard(0)) {
                        deck.playCard(0);
                        bossHP -= playerAttackDamage + 1;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+1) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("2") && deck.hasCard(1)) {
                        deck.playCard(1);
                        bossHP -= playerAttackDamage + 2;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+2) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("3") && deck.hasCard(2)) {
                        deck.playCard(2);
                        bossHP -= playerAttackDamage + 3;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+3) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }
                }

                //No move
                else {
                    System.out.println("You fumble with your cards and miss your turn!");
                }

                //Enemy move
                System.out.println("Sefrekis makes his next move: Corundum Cyclone!");
                playerHP -= bossSlashDamage;
                System.out.println("You take 3 hits, resulting in " + bossSlashDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0) {
                    break;
                }
                bossSlashDamage = 12;

                //----------------------------------------------------------------------------
                //Turn 4
                Text.optionsText();
                playerInput = scan.nextLine();

                //Attack
                if (playerInput.equals("A")) {
                    bossHP -= playerAttackDamage;
                    System.out.println("You attack Sefrekis for " + playerAttackDamage + " damage.\n" + "He has " + bossHP + " HP left.");
                    if (bossHP <= 0) {
                        break;
                    }
                }

                //Defend
                else if (playerInput.equals("D")) {
                    System.out.println("You now take " + playerBlock + " less damage from Sefrekis' next attack.");
                }

                //Special
                else if (playerInput.equals("S")) {
                    System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                    deck.printCards();
                    playerInput = scan.nextLine();
                    if (playerInput.equals("1") && deck.hasCard(0)) {
                        deck.playCard(0);
                        bossHP -= playerAttackDamage + 1;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+1) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("2") && deck.hasCard(1)) {
                        deck.playCard(1);
                        bossHP -= playerAttackDamage + 2;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+2) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("3") && deck.hasCard(2)) {
                        deck.playCard(2);
                        bossHP -= playerAttackDamage + 3;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+3) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }
                }

                //No move
                else {
                    System.out.println("You fumble with your cards and miss your turn!");
                }

                //Enemy move
                System.out.println("Sefrekis makes his move: Garnet Guard!");

                //----------------------------------------------------------------------------
                //Turn 5
                playerAttackDamage -= bossHeavyBlock;
                System.out.println("Your next attack is reduced by 10 damage.");
                Text.optionsText();
                playerInput = scan.nextLine();

                //Attack
                if (playerInput.equals("A")) {
                    bossHP -= playerAttackDamage;
                    System.out.println("You attack Sefrekis for " + playerAttackDamage + " damage.\n" + "He has " + bossHP + " HP left.");
                    if (bossHP <= 0) {
                        break;
                    }
                }

                //Defend
                else if (playerInput.equals("D")) {
                    System.out.println("You now take " + playerBlock + " less damage from Sefrekis' next attack.");
                }

                //Special
                else if (playerInput.equals("S")) {
                    System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                    deck.printCards();
                    playerInput = scan.nextLine();
                    if (playerInput.equals("1") && deck.hasCard(0)) {
                        deck.playCard(0);
                        bossHP -= playerAttackDamage + 1;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+1) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("2") && deck.hasCard(1)) {
                        deck.playCard(1);
                        bossHP -= playerAttackDamage + 2;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+2) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("3") && deck.hasCard(2)) {
                        deck.playCard(2);
                        bossHP -= playerAttackDamage + 3;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+3) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }
                }

                //No move
                else {
                    System.out.println("You fumble with your cards and miss your turn!");
                }

                //Enemy move
                System.out.println("Sefrekis makes his next move: Tourmaline Tonic!");
                bossHP = bossHP + 4;
                System.out.println("He healed 4 HP. His HP is now: " + bossHP);
                playerAttackDamage = 9;

                //----------------------------------------------------------------------------
                //Turn 6
                Text.optionsText();
                playerInput = scan.nextLine();

                //Attack
                if (playerInput.equals("A")) {
                    bossHP -= playerAttackDamage;
                    System.out.println("You attack Sefrekis for " + playerAttackDamage + " damage.\n" + "He has " + bossHP + " HP left.");
                    if (bossHP <= 0) {
                        break;
                    }
                }

                //Defend
                else if (playerInput.equals("D")) {
                    bossRoarDamage -= playerBlock;
                    System.out.println("You now take " + playerBlock + " less damage from Sefrekis' next attack.");
                }

                //Special
                else if (playerInput.equals("S")) {
                    System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                    deck.printCards();
                    playerInput = scan.nextLine();
                    if (playerInput.equals("1") && deck.hasCard(0)) {
                        deck.playCard(0);
                        bossHP -= playerAttackDamage + 1;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+1) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("2") && deck.hasCard(1)) {
                        deck.playCard(1);
                        bossHP -= playerAttackDamage + 2;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+2) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("3") && deck.hasCard(2)) {
                        deck.playCard(2);
                        bossHP -= playerAttackDamage + 3;
                        System.out.println("You attack Sefrekis for " + playerAttackDamage + "(+3) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }
                }

                //No move
                else {
                    System.out.println("You fumble with your cards and miss your turn!");
                }

                //Enemy move
                System.out.println("Sefrekis makes his next move: Beryl Breath!");
                playerHP -= bossRoarDamage;
                System.out.println("You take " + bossRoarDamage + " damage. Your HP is now " + playerHP + ".");
                if (playerHP <= 0) {
                    break;
                }
                bossRoarDamage = 6;
            }
            if (playerHP <= 0) {
                System.out.println("----------------------------------");
                System.out.println("Alas, the hero has suffered an untimely demise- do not be disheartened.");
                System.out.println("Do you wish to play again?\nEnter yes/no: ");
                WinLoss.playAgain();
            }
            Text.sefrekisDefeatedText(); //text for whatever that is
            deck.clear();
            // End of boss 2
            //----------------------------------------------------------------------------
            Text.bossEncounter3Text();
            //----------------------------------------------------------------------------
            // Start of boss 3
            playerHP = 140;
            playerAttackDamage = 11;
            playerBlock = 9;
            bossHP = 150;
            bossLightBlock = 9; //Instinctive Parry
            bossHeavyBlock = 12; //Heavy Shield
            bossRoarDamage = 8; //Sideswipe
            bossLungeDamage = 13; //Overhead Slam
            bossSlashDamage = 14; //Serrated Blade
            deck.add();
            deck.printCards();
            while (bossHP > 0 && playerHP > 0) {
                System.out.println("Conqueror' HP: " + bossHP);
                System.out.println("Your HP: " + playerHP);
                Text.optionsText();
                if (test.equals("Mr. Rochelle is cool")) {
                    deck.addGodCard();
                    System.out.println("You also notice an extra card that mysteriously appeared in your deck. Type the letter S to play it from your deck.");
                    System.out.println("*You must play it this turn or it will disappear.*");
                }
                playerInput = scan.nextLine();

                //Attack
                if (playerInput.equals("A")) {
                    bossHP -= playerAttackDamage;
                    System.out.println("You attack The Mercurial Conqueror for " + playerAttackDamage + " damage.");
                    System.out.println("He has " + bossHP + " HP left.");
                    if (bossHP <= 0) {
                        break;
                    }
                }

                //Defend
                else if (playerInput.equals("D")) {
                    System.out.println("You now take " + playerBlock + " less damage from The Mercurial Conqueror's next attack.");
                }

                //Special
                else if (playerInput.equals("S")) {
                    System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                    deck.printCards();
                    playerInput = scan.nextLine();
                    if (playerInput.equals("1") && deck.hasCard(0)) {
                        deck.playCard(0);
                        bossHP -= playerAttackDamage + 1;
                        System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+1) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("2") && deck.hasCard(1)) {
                        deck.playCard(1);
                        bossHP -= playerAttackDamage + 2;
                        System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+2) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    } else if (playerInput.equals("3") && deck.hasCard(2)) {
                        deck.playCard(2);
                        bossHP -= playerAttackDamage + 3;
                        System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+3) damage.");
                        System.out.println("It has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    }   else if (playerInput.equals("4") && deck.hasCard(3)) {
                        deck.playCard(3);
                        System.out.println("You play the card, and suddenly, both you and The Mercurial Conqueror hear an angelic choir.");
                        System.out.println("Then, down comes a beam of light, which eradicates The Mercurial Conqueror, leaving only dust behind.");
                        bossHP = 0;
                        break;
                    }   else {
                            System.out.println("You fumble with your cards and miss your turn!");
                        }
                }

                    //No move
                    else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }

                    //Enemy move
                    System.out.println("The Mercurial Conqueror makes his move: Instinctive Parry!");

                    //----------------------------------------------------------------------------
                    //Turn 2
                    playerAttackDamage -= bossLightBlock;
                    System.out.println("Your next attack is reduced by 9 damage.");
                    Text.optionsText();
                    playerInput = scan.nextLine();

                    //Attack
                    if (playerInput.equals("A")) {
                        bossHP -= playerAttackDamage;
                        System.out.println("You attack Conqueror for " + playerAttackDamage + " damage.\n" + "He has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    //Defend
                    } else if (playerInput.equals("D")) {
                        bossLungeDamage -= playerBlock;
                        System.out.println("You now take " + playerBlock + " less damage from The Mercurial Conqueror's next attack.");
                    }

                    //Special
                    else if (playerInput.equals("S")) {
                        System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                        deck.printCards();
                        playerInput = scan.nextLine();
                        if (playerInput.equals("1") && deck.hasCard(0)) {
                            deck.playCard(0);
                            bossHP -= playerAttackDamage + 1;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+1) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        } else if (playerInput.equals("2") && deck.hasCard(1)) {
                            deck.playCard(1);
                            bossHP -= playerAttackDamage + 2;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+2) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        } else if (playerInput.equals("3") && deck.hasCard(2)) {
                            deck.playCard(2);
                            bossHP -= playerAttackDamage + 3;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+3) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        }   else {
                            System.out.println("You fumble with your cards and miss your turn!");
                        }
                    }

                    //No move
                    else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }

                    //Enemy move
                    System.out.println("The Mercurial Conqueror makes his next move: Overhead Slam!");
                    playerHP -= bossLungeDamage;
                    System.out.println("You take " + bossLungeDamage + " damage. Your HP is now " + playerHP + ".");
                    if (playerHP <= 0) {
                        break;
                    }
                    System.out.println("The Mercurial Conqueror's HP: " + bossHP);
                    playerAttackDamage = 11;
                    bossLungeDamage = 13;

                    //----------------------------------------------------------------------------
                    //Turn 3
                    Text.optionsText();
                    playerInput = scan.nextLine();

                    //Attack
                    if (playerInput.equals("A")) {
                        bossHP -= playerAttackDamage;
                        System.out.println("You attack The Mercurial Conqueror for " + playerAttackDamage + " damage.\n" + "He has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    //Defend
                    } else if (playerInput.equals("D")) {
                        bossSlashDamage -= playerBlock;
                        System.out.println("You now take " + playerBlock + " less damage from The Mercurial Conqueror's next attack.");
                    }

                    //Special
                    else if (playerInput.equals("S")) {
                        System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                        deck.printCards();
                        playerInput = scan.nextLine();
                        if (playerInput.equals("1") && deck.hasCard(0)) {
                            deck.playCard(0);
                            bossHP -= playerAttackDamage + 1;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+1) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        } else if (playerInput.equals("2") && deck.hasCard(1)) {
                            deck.playCard(1);
                            bossHP -= playerAttackDamage + 2;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+2) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        } else if (playerInput.equals("3") && deck.hasCard(2)) {
                            deck.playCard(2);
                            bossHP -= playerAttackDamage + 3;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+3) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        }   else {
                            System.out.println("You fumble with your cards and miss your turn!");
                        }
                    }

                    //No move
                    else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }

                    //Enemy move
                    System.out.println("The Mercurial Conqueror makes his next move: Serrated Blade!");
                    playerHP -= bossSlashDamage;
                    System.out.println("You take 3 hits, resulting in " + bossSlashDamage + " damage. Your HP is now " + playerHP + ".");
                    if (playerHP <= 0) {
                        break;
                    }
                    bossSlashDamage = 14;

                    //----------------------------------------------------------------------------
                    //Turn 4
                    Text.optionsText();
                    playerInput = scan.nextLine();

                    //Attack
                    if (playerInput.equals("A")) {
                        bossHP -= playerAttackDamage;
                        System.out.println("You attack The Mercurial Conqueror for " + playerAttackDamage + " damage.\n" + "He has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }

                    //Defend
                    } else if (playerInput.equals("D")) {
                        System.out.println("You now take " + playerBlock + " less damage from The Mercurial Conqueror's next attack.");
                    }

                    //Special
                    else if (playerInput.equals("S")) {
                        System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                        deck.printCards();
                        playerInput = scan.nextLine();
                        if (playerInput.equals("1") && deck.hasCard(0)) {
                            deck.playCard(0);
                            bossHP -= playerAttackDamage + 1;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+1) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        } else if (playerInput.equals("2") && deck.hasCard(1)) {
                            deck.playCard(1);
                            bossHP -= playerAttackDamage + 2;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+2) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        } else if (playerInput.equals("3") && deck.hasCard(2)) {
                            deck.playCard(2);
                            bossHP -= playerAttackDamage + 3;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+3) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        }   else {
                            System.out.println("You fumble with your cards and miss your turn!");
                        }
                    }

                    //No move
                    else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }

                    //Enemy move
                    System.out.println("The Mercurial Conqueror makes his next move: Heavy Shield!");

                    //----------------------------------------------------------------------------
                    //Turn 5
                    playerAttackDamage -= bossHeavyBlock;
                    System.out.println("Your next attack is reduced by 12 damage.");
                    Text.optionsText();
                    playerInput = scan.nextLine();

                    //Attack
                    if (playerInput.equals("A")) {
                        bossHP -= playerAttackDamage;
                        System.out.println("You attack The Mercurial Conqueror for " + playerAttackDamage + " damage.\n" + "He has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }

                    //Defend
                    } else if (playerInput.equals("D")) {
                        System.out.println("You now take " + playerBlock + " less damage from The Mercurial Conqueror's next attack.");
                    }

                    //Special
                    else if (playerInput.equals("S")) {
                        System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                        deck.printCards();
                        playerInput = scan.nextLine();
                        if (playerInput.equals("1") && deck.hasCard(0)) {
                            deck.playCard(0);
                            bossHP -= playerAttackDamage + 1;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+1) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        } else if (playerInput.equals("2") && deck.hasCard(1)) {
                            deck.playCard(1);
                            bossHP -= playerAttackDamage + 2;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+2) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        } else if (playerInput.equals("3") && deck.hasCard(2)) {
                            deck.playCard(2);
                            bossHP -= playerAttackDamage + 3;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+3) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        }   else {
                            System.out.println("You fumble with your cards and miss your turn!");
                        }
                    }

                    //No move
                    else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }

                    //Enemy move
                    System.out.println("The Mercurial Conqueror makes his next move: Hasty Patching!");
                    bossHP += 5;
                    System.out.println("He healed 5 HP. His HP is now: " + bossHP);
                    playerAttackDamage = 11;

                    //----------------------------------------------------------------------------
                    //Turn 6
                    Text.optionsText();
                    playerInput = scan.nextLine();

                    //Attack
                    if (playerInput.equals("A")) {
                        bossHP -= playerAttackDamage;
                        System.out.println("You attack The Mercurial Conqueror for " + playerAttackDamage + " damage.\n" + "He has " + bossHP + " HP left.");
                        if (bossHP <= 0) {
                            break;
                        }
                    //Defend
                    } else if (playerInput.equals("D")) {
                        bossRoarDamage -= playerBlock;
                        System.out.println("You now take " + playerBlock + " less damage from The Mercurial Conqueror's next attack.");
                    }

                    //Special
                    else if (playerInput.equals("S")) {
                        System.out.println("What card would you like to use? (Type 1, 2, or 3)");
                        deck.printCards();
                        playerInput = scan.nextLine();
                        if (playerInput.equals("1") && deck.hasCard(0)) {
                            deck.playCard(0);
                            bossHP -= playerAttackDamage + 1;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+1) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        } else if (playerInput.equals("2") && deck.hasCard(1)) {
                            deck.playCard(1);
                            bossHP -= playerAttackDamage + 2;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+2) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        } else if (playerInput.equals("3") && deck.hasCard(2)) {
                            deck.playCard(2);
                            bossHP -= playerAttackDamage + 3;
                            System.out.println("You attack Mercurial Conqueror for " + playerAttackDamage + "(+3) damage.");
                            System.out.println("It has " + bossHP + " HP left.");
                            if (bossHP <= 0) {
                                break;
                            }
                        }   else {
                            System.out.println("You fumble with your cards and miss your turn!");
                        }
                    }

                    //No move
                    else {
                        System.out.println("You fumble with your cards and miss your turn!");
                    }

                    //Enemy move
                    System.out.println("Conqueror makes his next move: Sideswipe!");
                    playerHP -= bossRoarDamage;
                    System.out.println("You take " + bossRoarDamage + " damage. Your HP is now " + playerHP + ".");
                    if (playerHP <= 0) {
                        break;
                    }
                    bossRoarDamage = 8;
                }
                if (playerHP <= 0) {
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
