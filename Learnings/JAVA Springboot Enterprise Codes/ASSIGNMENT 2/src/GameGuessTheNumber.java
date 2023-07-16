import java.util.Scanner;

class Gusser{
	
	int GusserNumber;
	
	int gusser() {
		
		System.out.print("Gusser Please guess a Number Between 1 To 10 : ");
		Scanner scan = new Scanner(System.in);
		GusserNumber = scan.nextInt();
		return GusserNumber;
		
	}
}

class Player1{
	
	int GusserNumber;
	int i;
	
	int PlayerNumber() {

		System.out.print("Player 1 enter a number between 1 to 10: ");
		
		Scanner scan = new Scanner(System.in);
		GusserNumber = scan.nextInt();
		
		return GusserNumber;
		
	}
}

class Player2{
	
	int GusserNumber;
	int i;
	
	int PlayerNumber() {

		System.out.print("Player 2 enter a number between 1 to 10: ");
		
		Scanner scan = new Scanner(System.in);
		GusserNumber = scan.nextInt();
		
		return GusserNumber;
		
	}
}

class Player3{
	
	int GusserNumber;
	int i;
	
	int PlayerNumber() {

		System.out.print("Player 3 enter a number between 1 to 10: ");
		
		Scanner scan = new Scanner(System.in);
		GusserNumber = scan.nextInt();
		
		return GusserNumber;
		
	}
}

class Umpire{
	
	int GusserNumber;
	int P1Number;
	int P2Number;
	int P3Number;
	 
	
	void result() {
		
		Gusser guess = new Gusser();
		GusserNumber = guess.gusser();
		
		Player1 P1 = new Player1();
		P1Number = P1.PlayerNumber();
		
		Player2 P2 = new Player2();
		P2Number = P2.PlayerNumber();
		
		Player3 P3 = new Player3();
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

class PlayAgain{
	void game() {
		
		Umpire finalResult= new Umpire();
		String ans = "yes";
		System.out.print("Do you want to continue the game(yes/No): ");
		Scanner scan = new Scanner(System.in);
		
		
		String input = scan.next();
		System.out.println(input);
	
			if(ans.equals(input)) {
				GameGuessTheNumber again = new GameGuessTheNumber();
				finalResult.result();
				finalResult.compair();
				
			}
			else {
			System.out.println("Thank you for playing....");
			}
	}	
}

		

public class GameGuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
			Umpire finalResult= new Umpire();
			finalResult.result();
			finalResult.compair();
		
			PlayAgain again = new PlayAgain();
			again.game();
		

		
		
		

	}

}