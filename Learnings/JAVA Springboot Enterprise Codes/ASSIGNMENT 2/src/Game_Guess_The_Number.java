import java.util.Scanner;
import java.util.Random;

class NumberOfPlayers{
	int number;
	Scanner sc = new Scanner(System.in);
	int players() {
		System.out.print("Please choose the number of players from (1 - 5 ): ");
		number = sc.nextInt();
		return number;
	}
}

class Player{
	
	int GusserNumber;
	int i;
	
	int PlayerNumber() {

		System.out.print("Player 1 enter a number between 1 to 10: ");
		
		Scanner scan = new Scanner(System.in);
		GusserNumber = scan.nextInt();
		
		return GusserNumber;
		
	}
}

class Umpire1{
	
	int Numberofplayer;
	int GusserNumber;
	int P1Number;
	int P2Number;
	int P3Number;
	 
	
	void result() {
		
		Gusser2 guess = new Gusser2();
		GusserNumber = guess.gusser();
		
		NumberOfPlayers number = new NumberOfPlayers();
		Numberofplayer = number.players();
		
		Player P1 = new Player();
		P1Number = P1.PlayerNumber();
		
		Player P2 = new Player();
		P2Number = P2.PlayerNumber();
		
		Player P3 = new Player();
		P3Number = P3.PlayerNumber();
		
	}
	
	
	void compair() {
		if(P1Number == GusserNumber && P2Number != GusserNumber && P3Number != GusserNumber){
			System.out.println("Player 1 won the game");
		}
		else if(P1Number != GusserNumber && P2Number == GusserNumber && P3Number != GusserNumber){
			System.out.println("Player 2 won the game");
		}
		else if(P1Number != GusserNumber && P2Number != GusserNumber && P3Number == GusserNumber){
			System.out.println("Player 3 won the game");
		}
		else if(P1Number == GusserNumber && P2Number == GusserNumber && P3Number == GusserNumber) {
			System.out.println("Player 1, Player 2 and Player 3 all three won the game");
		}
		else if(P1Number == GusserNumber && P2Number == GusserNumber ) {
			System.out.println("Player 1 and Player 2 you won the game");
		}
		else if(P2Number == GusserNumber && P3Number == GusserNumber ) {
			System.out.println("Player 2 and Player 3 you won the game");
		}
		else if(P1Number == GusserNumber && P3Number == GusserNumber ) {
			System.out.println("Player 1 and Player 3 you won the game");
		}
		else{
			System.out.println("You Lost The Game ! Try again");
		}
	}
}

class PlayAgain2{
	void game() {
		String ans = "yes";
		System.out.print("Do you want to continue the game(yes/No): ");
		Scanner scan = new Scanner(System.in);
		
		
		String input = scan.next();

	
			if(ans.equals(input)) {
				Game_Guess_The_Number again = new Game_Guess_The_Number();
				again.method();
				
			}
			else {
			System.out.println("Thank you for playing....");
			}
	}	
}

		

public class Game_Guess_The_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire1 finalResult= new Umpire1();
		finalResult.result();
		finalResult.compair();
	
		PlayAgain2 again = new PlayAgain2();
		again.game();

	}
	void method() {
		Umpire1 finalResult= new Umpire1();
		finalResult.result();
		finalResult.compair();
	
		PlayAgain2 again = new PlayAgain2();
		again.game();
	}

}
class Gusser2{
	
	int GusserNumber;
	
	int gusser() {
		String ans ="user";
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("Who will be the gusser (user/computer): ");
		String input = sc.next();
		
		if(ans.equals(input)) {
			System.out.print("Gusser Please guess a Number Between 1 To 30 : ");
			Scanner scan = new Scanner(System.in);
			GusserNumber = scan.nextInt();
			return GusserNumber; 
		}
		else {
			System.out.print("Computer guess a Number Between 1 To 30 : ");
			GusserNumber = rand.nextInt(30);
			System.out.println(GusserNumber);
			return GusserNumber; 
		}
}}

