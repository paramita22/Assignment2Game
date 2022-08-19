package game;
import java.util.*;
public class Guesser {
	int guessNum;
	public int guessNumber(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number:");
		guessNum=sc.nextInt();
		return guessNum;
	}

}
class Player{
	int pguessNum;
	public int guessNumber(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter player number");
		int st=sc.nextInt();
		switch(st) {
		case 1:	System.out.println("Player1 kindly guess the number");
				pguessNum=sc.nextInt();
				break;
		
		case 2:	System.out.println("Player2 kindly guess the number:");
				pguessNum=sc.nextInt();
				break;
				
		case 3:	System.out.println("Player3 kindly guess the number:");
				pguessNum=sc.nextInt();
				break;
				
		default:System.out.println("Guesser reveal the number. No more player to guess.");
				break;
		}
		return pguessNum;
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int flag=0;
	
	public void collectNumFromGuesser(){
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
	}
	public void collectNumFromPlayer(){
		Player p1=new Player();
		numFromPlayer1=p1.guessNumber();
		Player p2=new Player();
		numFromPlayer2=p2.guessNumber();
		Player p3=new Player();
		numFromPlayer3=p3.guessNumber();
	}
	int compare() {
		if(numFromGuesser!=numFromPlayer1&&numFromGuesser!=numFromPlayer2&&numFromGuesser!=numFromPlayer3) {
			System.out.println("Game Lost!Try Again");
		}
		else if(numFromGuesser==numFromPlayer1) {
			if(numFromGuesser==numFromPlayer2&&numFromGuesser==numFromPlayer3) {
				System.out.println("Game tied all three Players guessed correctly. Guesser join in as Player4.Lets play Knockout");
				flag=1;
			}
			else if(numFromGuesser==numFromPlayer2) {
				System.out.println("Player1 and Player2 won the game. Lets try knockout");
				flag=1;
			}
			else if(numFromGuesser==numFromPlayer3) {
				System.out.println("Player1 and Player3 won the game. Lets try knockout");
				flag=1;
			}
			else {
			System.out.println("Player1 won the game. You are the nextGuesser");
			flag=0;
			}
		}
		else if(numFromGuesser==numFromPlayer2) {
			if(numFromGuesser==numFromPlayer1&&numFromGuesser==numFromPlayer3) {
				System.out.println("Game tied all three Players guessed correctly. Guesser join in as Player4. Lets play Knockout");
				flag=1;
			}
			else if(numFromGuesser==numFromPlayer1) {
				System.out.println("Player1 and Player2 won the game. Lets try knockout");
				flag=1;
			}
			else if(numFromGuesser==numFromPlayer3) {
				System.out.println("Player2 and Player3 won the game. Lets try knockout");
				flag=1;
			}
			else {
			System.out.println("Player2 won the game. You are the next Guesser");
			flag=0;
			}
		}
		else{
			if(numFromGuesser==numFromPlayer1&&numFromGuesser==numFromPlayer2) {
				System.out.println("Game tied all three Players guessed correctly. Guesser join in as PLayer4. Lets play Knockout");
				flag=1;
			}
			else if(numFromGuesser==numFromPlayer1) {
				System.out.println("Player1 and Player3 won the game. Lets try knockout");
				flag=1;
			}
			else if(numFromGuesser==numFromPlayer2) {
				System.out.println("Player2 and Player3 won the game. Lets try knockout");
				flag=1;
			}
			else {
			System.out.println("Player3 won the game. You are the next Guesser");
			flag=0;
		}
	}
		return flag;
	}
		void knockout(int flag) {
			flag=1;
			Scanner sc=new Scanner(System.in);
			int firstPlayer;
			int secondPlayer;
			System.out.println("The first guesser of toss wins. Player please enter your number:");
			firstPlayer=sc.nextInt();
			System.out.println("Player"+firstPlayer+"give your preference of toss(H/T):");
			char ch;
			ch=sc.next().charAt(0);
			if(firstPlayer==1&&ch=='T') {
				System.out.println("Player1 wins");
			}
			else if(firstPlayer==2&&ch=='H') {
				System.out.println("Player2 wins");
			}
			else if(firstPlayer==3&&ch=='H') {
				System.out.println("Player3 wins");
			}
			else if(firstPlayer==4&&ch=='T') {
				System.out.println("Player4 wins");
			}
			else {
				System.out.println("The non guesser wins");
			}
		}
	
}
