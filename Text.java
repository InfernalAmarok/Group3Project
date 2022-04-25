public class Text
{
    public static void linesText (int lineLength){
        for (int i = 0; i <= lineLength; i++)
        {
            System.out.print("-");
        }
    }
    public static void optionsText(){               //new method to replace the printOptions method
        String options = """
                It's your turn now.\040
                Type the letter A to play an attack card,\040
                the letter D to use a defend card,\040
                or S to use a special card.
                
                """;
        System.out.println(options);
    }
    public static void introText(){
        String intro = """
            Hello, and welcome to Project Duplicity, made by Group 3.
            If you are a first time player, or require a refresher of the rules,
            please consult the Rules.txt file in the root folder.
            With that out of the way:
            Press Enter to begin, or type 'exit' and press Enter to end the program here.
            """;
        System.out.println(intro);
    }

    public static void defeatText(){
        String defeated = """
                Alas, the hero has suffered an untimely demise- do not be disheartened.
                You may try again, but do you wish to do so? (yes/no)
                """;
        System.out.print(defeated);
    }

    public static void locationText(){
        String locations = """
                You will face a series of challenges back to back on your way to the peak of Mt. Eskervon.\040
                Death will mean a restart, so think carefully as you fight.
                    In order of progression:
                       1. Cirtelgo Plains
                       2. Dalihark Pass
                       3. Mt. Eskervon
                       
                Type any phrase to continue.
                """;
        System.out.println(locations);
    }
    public static void bossEncounter1Text(){
        String bossEncounter = """
                As you tread your way through Cirtelgo Plains, headed towards Mt. Eskervon, a menacing, lion-like creature with two tails and ram horns appears to confront you.
                One of the nomads in the area told you on the way that it was given a horrible moniker by travelers, to dissuade foolhardy adventurers.
                You're hardy but by no means a fool, however, so you face your challenge head-on.
                
                You now confront Yvatra the Prowler! Its mane flares with a sense of dominance.
                """;
        System.out.println(bossEncounter);
    }
    public static void yvatraDefeatedText(){
        String yvatraDefeated = """
                You have defeated Yvatra the Prowler and feel yourself growing stronger!
                All your wounds are healed from before, your max HP increases to 120,
                and your attack card now deals 9 damage.
                Your defend card is also sturdier, taking 7 damage before faltering.
                
                You continue on your trek, entering Dalihark Pass. Wary from your previous fights in Cirtelgo Plains,\040
                you keep your attack cards at the ready as you go through this earthen area, to make sure nothing gets the drop on you.
                
                
                """;
        System.out.println(yvatraDefeated);
    }

    public static void bossEncounter2Text(){
        String bossEncounter2 = """
                Making your way into a tunnel system, you come across a half-giant surrounded by shinies.
                His voice is incoherent, but his tone is clear: you're an interloper and he wants you gone.
                You're ready to put up a fight, though. Not because of the gems he hoards, but because of your objective.
                
                You now confront Sefrekis, Keeper of Jewels!
                He growls incoherently, clutching a sack of magic jewels with a malicious look in his eyes.
                """;
        System.out.println(bossEncounter2);
    }
    public static void sefrekisDefeatedText(){
        String sefrekisDefeated = """
                You have defeated Sefrekis, Keeper of Jewels, and feel yourself growing stronger!
                All your wounds are healed from before, your max HP increases to 140, and your attack now deals 11 damage.
                Your defend is also sturdier than ever, taking 9 damage before faltering.
                
                Making your way out of the other end of the tunnel system, you find yourself near the base of Mt. Eskervon.
                This intimidating mountain has claimed many unprepared adventurers, but with your skills and equipment,\040
                you can continue your journey unimpeded.
                
                """;
        System.out.println(sefrekisDefeated);
    }
    public static void bossEncounter3Text(){
        String bossEncounter3 = """
                Now you move up to the summit of Mt. Eskervon, and waiting for you there is a hulking marvel of a man... if he even is human.
                He stands roughly 9 feet tall and carries several dangerous-looking weapons,\040
                and you can't help but feel a bit of fear as you face him directly.
                Then, you remember who he is: the source of the evil blighting this land. You steel yourself and prepare for combat.
                
                You now confront The Mercurial Conqueror!
                He lets out a hearty boast above the howling mountain winds, “You got this far, but will go no further, adventurer!”
                """;
        System.out.println(bossEncounter3);
    }

    public static void mercurialDefeatedText(){
        String mercurialDefeated = """
                You have defeated The Mercurial Conqueror and are victorious,\040
                having made your way to your final destination to bring peace back to the land!
                For now, all has been righted, and you can finally take a well-deserved rest.
                
                Play again?\040
                
                
                Enter yes/no:
                """;
        System.out.print(mercurialDefeated);
    }
}
