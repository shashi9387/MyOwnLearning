import java.util.Scanner;
import java.util.Random;

class NumberOfPlayers{
	int number;
	Scanner sc = new Scanner(System.in);
	
	int players() {
		System.out.print("Please choose the number of players: ");
		number = sc.nextInt();
		return number;
	}
	
}
class Player{
	
	int GusserNumber;
	int i;
	
	int PlayerNumber() {

		Scanner scan = new Scanner(System.in);
		GusserNumber = scan.nextInt();
		
		return GusserNumber;
		
	}
}

class Umpire{
	
	int Numberofplayer;
	NumberOfPlayers num = new NumberOfPlayers();
	int GusserNumber;
	Gusser guess = new Gusser();
	int i = 1; 
	Player player = new Player();
	int arr[] = new int[100];

	void result() {
		Numberofplayer = num.players();
		arr[99] = guess.gusser();
		
		while(i < num.number+1) {
			System.out.print("Player " + i + " enter a number between 1 to 100: " ); 
			arr[i]=player.PlayerNumber();
			i++;
		}
	}

	void compair() {
		System.out.print("Player ");
		int array[] = new int[100];
		int i = 0 ;
		
		while(i < num.number+1 ) {
			if(arr[i]==arr[99]) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println("won the game");
	}
}

class PlayAgain{
	void game() {
		String ans = "yes";
		System.out.print("Do you want to continue the game(yes/No): ");
		Scanner scan = new Scanner(System.in);
		
		
		String input = scan.next();

	
			if(ans.equals(input)) {
				GameGuessTheNumber again = new GameGuessTheNumber();
				again.method();
				
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
	void method() {
		Umpire finalResult= new Umpire();
		finalResult.result();
		finalResult.compair();
	
		PlayAgain again = new PlayAgain();
		again.game();
	}
}
class Gusser{
	
	int GusserNumber;
	Scanner sc = new Scanner(System.in);
	int gusser() {
		String ans ="user";
		Random rand = new Random();
		
		System.out.print("Who will be the gusser (user/computer): ");
		String input = sc.next();
		
		if(ans.equals(input)) {
			System.out.print("Gusser Please guess a Number Between 1 To 100 : ");
			GusserNumber = sc.nextInt();
			return GusserNumber; 
		}
		else {
			System.out.print("Computer guess a Number Between 1 To 100 : ");
			GusserNumber = rand.nextInt(100);
			System.out.println(GusserNumber);
			return GusserNumber; 
		}
}}
