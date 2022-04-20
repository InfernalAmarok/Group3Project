import java.util.Scanner;
import java.util.regex.Pattern;
public class WinLoss //extends Health???
{
    /*
    protected boolean hasWon;
    protected boolean[] hasLost;

    public static void launchGame()
    {
        Scanner kb = new Scanner(System.in);
        String startEnd;
        final Pattern pattern = Pattern.compile("start|end");

    }

     */

    public static void playAgain()
    {
        Scanner kb = new Scanner(System.in);
        String userDecision;
        final Pattern pattern = Pattern.compile("yes|no");
        boolean flag = true;
        userDecision = kb.nextLine();
        while(flag)
        {
            if(!pattern.matcher(userDecision).matches())
            {
                System.out.println("Error, please enter 'yes', or 'no' ");
                userDecision = kb.nextLine();
            }
            else{
                flag = false;
            }
        }
        if (userDecision.matches("no"))
        {
            System.out.println("Thanks for playing!");
            kb.close();
            System.exit(0);
        }
        else{
            kb.reset();

        }
    }
    /*
    public static void success()
    {

        String text = """
                The hero has prevailed at the quest set for them,
                despite all odds! Now with The Mercurial Conqueror slain,
                the world is at peace, at least for the immediate future.
                Now the hero can take a rest, until they are needed for their next grand adventure.
                That being said, you may return to try the quest again and attempt a different journey.
                Do you wish to do so? (Y/N)
                """;
        System.out.print(text);
    }

    public static void defeat()
    {
        String text = """
                Alas, the hero has suffered an untimely demise- do not be disheartened.
                You may try again, but do you wish to do so? (Y/N)
                """;
        System.out.print(text);
    }

     */
}

