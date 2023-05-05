import java.util.Random;
import java.util.Scanner;
class GNumG
{
public static void guessingNumberGame()
{
Scanner sc = new Scanner(System.in);
// Generate the numbers
int number = 1 + (int)(100* Math.random());
Random ran = new Random();
number = ran.nextInt(100) ;
// Given attempt
int attempt = 7;
int i, guess;
String player_name;
System.out.println("------------------------------------------------------------------------------------------");
System.out.println(" Hello, What's your name? ");
player_name = sc.next();
System.out.println("------------------------------------------------------------------------------------------");
System.out.println(" Ohhkay!\n " + player_name );
System.out.println(" WELCOME TO GUESS THE NUMBER GAME \n "
 + "You Will Be Asked To Guess A Number To Win The Game \n " 
 + "You have Maximum 7 Attempt Limit ");
 System.out.println("------------------------------------------------------------------------------------------");
System.out.println(" SO... " + player_name + " you have to Guess a number between 1 and 100 :");
System.out.println("------------------------------------------------------------------------------------------");
for (i = 0; i < attempt; i++)
{
System.out.print(" Guess the number: ");
guess = sc.nextInt();
// If the number is guessed
if (number == guess)
{
System.out.println("------------------------------------------------------------------------------------------");
System.out.println(" OOhhOO!\n" + " Congratulations!\n"
 + " Your Number is Correct.\n" + " You Win the Game!");
 System.out.println("------------------------------------------------------------------------------------------");
break;
}
else if (number > guess && i != attempt - 1)
{
System.out.println(" The number is greater than " + guess);
}
else if (number < guess && i != attempt - 1)
{
System.out.println(" The number is less than " + guess);
}
}
if (i == attempt)
{
System.out.println("------------------------------------------------------------------------------------------");
System.out.println(" OOPSSS....!\n" + " Sorryyy.....!\n" 
+ " You have exceeded the maximum attempt.\n" + " Try Again\n" );
System.out.println(" The GUESSED number was " + number);
System.out.println("------------------------------------------------------------------------------------------");
}
}
public static void main(String arg[])
{
try
{
guessingNumberGame();
}
catch(Exception e)
{
System.out.println("Opss ! sorry you have to type a number ");
}
}
}