// AP Computer Science Java
// Josh Finkel
// project 3
// Nevin LaBrusciano

import java.util.Scanner;

public class project_3
{
    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);

        String ua;
        int mt = 10;
        int b;

        //starting the game
        System.out.print("Press \"p\" to play the slots!");
        ua = ui.next();

        while (ua.equals("p"))
        {
            System.out.println("You have $" + mt);

            //choosing how much money you want to bet
            System.out.println("How much money do you want to bet?");
            b = ui.nextInt();

            //deciding the three slot numbers
            int rn1 = (int)(Math.random()*10)+1;
            int rn2 = (int)(Math.random()*10)+1;
            int rn3 = (int)(Math.random()*10)+1;

            System.out.println(rn1 + "\t" + rn2 + "\t" + rn3);

            //declaring how much money you've won
            if (rn1 == rn2 || rn1 == rn3 || rn2 == rn3)
            {
                System.out.println("You won $" + (b * 3));

                mt -= b;
                mt += b * 3;

                System.out.println("your balance is now $" + mt);
            }

            else if (rn1 == rn2 && rn1 == rn3 && rn2 == rn3)
            {
                System.out.println("You won Jackpot!");

                mt -= b;
                mt += b * 10;

                System.out.println("your balance is now $" + mt);
            }

            else
            {
                System.out.println("you won nothing.");
                mt -= b;
            }

            //determining if you lose
            if (mt == 0)
            {
                System.out.println("You have no money :( you lose!");
                break;
            }

            //restarting the loop
            System.out.print("Press \"p\" to play the slots! or press \"w\" to withdrawl.");
            ua = ui.next();

            //What happens if you withdraw
            if (ua.equals("w"))
            {
                System.out.println("Congrats, goodbye!");
                break;
            }
        }

        ui.close();

    }
}
