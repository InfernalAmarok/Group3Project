import java.util.Scanner;
import java.util.regex.Pattern;
public class WinLoss
{

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
}

