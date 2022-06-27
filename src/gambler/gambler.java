package gambler;
import java.util.*;

/**
 * use java.uitil.* package
 * @author HP
 *
 */

public class gambler {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*/
		 * taking variables stack and bet
		 * use Random function
		 * 
		 */
		System.out.println("Welcome to Gambler Game Program");
		int stack = 100;
		int bet = 1;
		
		System.out.println("Total stack of gambler: "+stack);
		System.out.println("Gambler betting Price: "+bet);
		
		Random betting = new Random();
		int bet_1 = betting.nextInt()%2;
		
		if(bet_1<0.5) {
			System.out.println("congratulation You win the bet");
			System.out.println("Your total stack = "+(stack+bet));
		}else {
			System.out.println("sorry You lose the bet....Better Luck next Time");
			System.out.println("Your total stack = "+(stack-bet));
		}

	}

}
