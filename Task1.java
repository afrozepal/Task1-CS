/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package afroze.task1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author afroz
 */
public class Task1 {

    public static void main(String[] args) {
        
        Random random = new Random();

    int min_range=1;
    int max_range=100;
    int turns=3;
    int margin =5;  //to check whether number too high or too low
    int score=0;
    int guess=0;
        int randomNumber;
        // Generate a random number within the range
                randomNumber = random.nextInt(max_range -min_range +1) + 1;
                
        System.out.println("------------Welcome to Guess Game-------------- ");
        System.out.println("There will be max " + turns + " turns in one round.");
        System.out.println("You have to guess correctly for number of turns to move to another round");
        System.out.println("Every turn and round will have new generated random number. It can or cannot be same as previous ones");
        System.out.println("For every succesfull attempt you will get score of 20");
        System.out.println("On completing a round you will be awarded with score of 30");
        System.out.println("While with every wrong attempt , it will -1");
        System.out.println("Click enter to start");
        Scanner s=new Scanner(System.in);
        s.nextLine();
        for (int i=1; i>=0 ;i++)
        {
                System.out.println("Lets start Round " + i );
            for(int j=0;j<turns;)
            {
                
                
                System.out.println("Enter the guess of randomly generated number between 1-100: ");
                guess=s.nextInt();
                if(guess-randomNumber==0)
                {
                    System.out.println("Congratulations! \n Your guess is right");
                    j++;
                    score+=20;
                    // Generate a random number within the range
                randomNumber = random.nextInt(max_range -min_range +1) + 1;
                }
                else if(Math.abs(guess-randomNumber)<=margin)
                {
                    if(guess-randomNumber>0)
                    {
                    System.out.println("Ops! you missed it. Your guess is close but high.");
                    score--;
                    }
                    else if(guess-randomNumber<0)
                    {
                    System.out.println("Ops! you missed it. Your guess is close but low .");
                    score--;
                    }
                }
                else if(guess-randomNumber<0)
                {
                    System.out.println("Ops! Your guess is too far and low from generated random number");
                    score--;
                }
                else
                {
                    System.out.println("Ops! Your guess is too far and high from generated random number");
                    score--;
                }
            }
            System.out.println("If you want to play again , enter 'p', Anyother letter and Game End");
            char c = s.next().charAt(0);
            if(c!='p')
            {
                break;
            }
            else
            {
                score+=30;
                System.out.println("READY FOR ANOTHER ROUND--------LETS GO---------");
            }
        }
        
            System.out.println("You played very well");
                System.out.println("Score Earned " + score );
                    System.out.println("===============Game End===============");
        
    }
}
