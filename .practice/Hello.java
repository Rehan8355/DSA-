package battleshipgame;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Gameboard {
	
	private int hits, misses;
	private ArrayList<Integer> shipLengthArray = new ArrayList<Integer>();
	private ArrayList<Integer> shipCharArray = new ArrayList<Integer>();
	private int level;
	private int availableMissiles;
	private int boardSize;
	private int[][] gameBoard;
	private int shipSize;
	private int shipMarker;
	private String shipString;
	private Ships ships;
	private int shotsFired = 0;
	private int Aircraft = 5;
	private int Battleship = 4;
	private int Destroyer = 3;
	private int Submarine = 3;
	private int Patrol = 2;

	Random rand = new Random();
	
	Scanner input = new Scanner(System.in);
	
	// initializing the whole board to empty (0)
	public void fillBoard() {
		for(int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				gameBoard[i][j] = 0;
			}
		}
	}

	
	// method to print board
	public void outputGame() 
	{ 
	
		char water = '~';
		char miss = '*';
		char hit = 'X';
		
		
		System.out.print("   ");
		// Print letters on top of board
		for (int i = 0; i < gameBoard[0].length; i++) {
			System.out.printf("%3d", i+1);

		}
		
		System.out.println();
		
		//loop through gameBoard's rows
		for (int row = 0; row < gameBoard[0].length; row++)
		{	
			System.out.printf("%3c", getLetter(row+1));
			
	
			// loop through columns of current row
			for (int column = 0; column < gameBoard[0].length; column++) {
					if (gameBoard[row][column] == 0)
						System.out.printf("%3c", water);
					if (gameBoard[row][column] == 1)
						System.out.printf("%3c", miss);
					if (gameBoard[row][column] == 2)
						System.out.printf("%3c", hit);
					if (gameBoard[row][column] == 'A' || gameBoard[row][column] == 'B' || gameBoard[row][column] == 'D' || gameBoard[row][column] == 'S' || gameBoard[row][column] == 'P')
					System.out.printf("%3c", water);
	
			}
	
			System.out.println();

		}
	}
	
	// method to track hits, score and end game 
	public void endGame() {		
		
		System.out.println(availableMissiles);
		
		while (availableMissiles != 0 && hits != 17) {
			shotsFired++;
			
			System.out.println("Choose the coordinate to attack. Enter the row you wish to attack. (Ex: A, B, C): ");
				
			String guess = input.next();
			
			// ensure input is upper case
			guess = guess.toUpperCase();
			//System.out.println(guess);
			
			char charInput = guess.charAt(0); 
			
			int coord1 = getNumber(charInput);
			//System.out.println(coord1);
			
			// ensure coord1 is within boardSize coordinates
			if (coord1 < 1 || coord1 > boardSize){
				System.out.println("You did not enter a valid guess.");
				continue;
			}
			
			// ensure coord1 prints in correct spot
			coord1 = getNumber(charInput) - 1;
			
			// prompt user to enter column coordinates
			System.out.println("Choose the column you want to attack (NUMBER): ");
			
			// ensure coord2 places in correct spot
			int coord2 = input.nextInt() - 1;
			if (coord2 > boardSize || coord2 < 0) {
				System.out.println("You did not enter a valid coordinate.");
				continue;
			}
		
			
			// determine which ship was sunk
			if (gameBoard[coord1][coord2] == 'A') {
				Aircraft--;
				if (Aircraft == 0){
					System.out.println("\n" + "You sunk the Aircraft Carrier!");
				}
			} else if (gameBoard[coord1][coord2] == 'B') {
				Battleship--;
				if (Battleship == 0){
					System.out.println("\n" + "You sunk the Battleship!");
				}
			} else if (gameBoard[coord1][coord2] == 'D') {
				System.out.println(Destroyer);
				Destroyer--;
				System.out.println(Destroyer);
				if (Destroyer == 0){
					System.out.println("\n" + "You sunk the Destroyer!");
				}
			} else if (gameBoard[coord1][coord2] == 'S') {
				Submarine--;
				if (Submarine == 0){
					System.out.println("\n" + "You sunk the Submarine!");
				}
			} else if (gameBoard[coord1][coord2] == 'P') {
				Patrol--;
				if (Patrol == 0){
					System.out.println("\n" + "You sunk the Patrol Boat!");
				}
			}
			
			
			for (int j = 0; j < shipLengthArray.size(); j++) {
			// checks to see if it was a hit or a miss
			for (int i = 0; i < shipLengthArray.get(j); i++) {
				if (gameBoard[coord1][coord2] == getLetter(shipCharArray.get(j))) {
					// convert to X when printing next board
					gameBoard[coord1][coord2] = 2;
				}
			}
		}
			
			
			// check coordinate to see if it's empty
			if (gameBoard[coord1][coord2] == 0) {
				//convert to 1 to print * on next board
				gameBoard[coord1][coord2] = 1;
				System.out.println("MISS");
				misses++;
			} else if (gameBoard[coord1][coord2] == 2) {
				//prints X on next board
				
				System.out.println("HIT");
				hits++;
			}
			
			System.out.println("HITS: " + hits);
			System.out.println("MISSES: " + misses);
			System.out.println("REMAINING MISSILES: " + availableMissiles);
			outputGame();
			availableMissiles--;
		}
		
		// Determine GAME OVER or WIN
		if (availableMissiles == 0) {
		System.out.println("You used up all your missiles :(");
		System.out.println("--------GAME OVER--------");
		} else if (hits == 17) {
			System.out.println("CONGRATULATIONS! YOU WON!");
			System.out.println("--------STATS--------");
		}
		System.out.println("You fired " + shotsFired);
		System.out.println("You missed " + misses);
		System.out.println("You hit " + hits);
		System.out.println("Total shots fired " + (shotsFired));
		int average = (hits/shotsFired) * 100;
		System.out.println("Average: " + average + "%");
	}
	
		
	// conversion method to change letters to numbers for int[][] board
	public int getNumber(char input) {
		int row = 1;
		
		switch(input){
		case 'A':
			row = 1;
			break;
		case 'B':
			row = 2;
			break;
		case 'C':
			row = 3;
			break;
		case 'D':
			row = 4;
			break;
		case 'E':
			row = 5;
			break;
		case 'F':
			row = 6;
			break;
		case 'G':
			row = 7;
			break;
		case 'H':
			row = 8;
			break;
		case 'I':
			row = 9;
			break;
		case 'J':
			row = 10;
			break;
		case 'K':
			row = 11;
			break;
		case 'L':
			row = 12;
			break;
		case 'M' :
			row = 13;
			break;
		case 'N':
			row = 14;
			break;
		case 'O':
			row = 15;
			break;
		case 'P':
			row = 16;
			break;
		case 'Q':
			row = 17;
			break;
		case 'R':
			row = 18;
			break;
		case 'S' :
			row = 19;
			break;
		case 'T':
			row = 20;
			break;
		case 'U':
			row = 21;
			break;
		case 'V':
			row = 22;
			break;
		case 'W':
			row = 23;
			break;
		case 'X':
			row = 24;
			break;
		case 'Y' :
			row = 25;
			break;
		case 'Z' :
			row = 26;
			break;
		
		}
		
		
		return row;
}

	
	
	
	// converts int to char for column
	public char getLetter(int i){
		  return (char) (i + 64);
		}
	
	// method to prompt user to choose difficulty, assign level, and print board
	public void difficultyInfo() {
		// prompt user to choose difficult
			
		System.out.print("Choose your level of difficulty.");
		System.out.print("\n" + "Enter 1 for Easy, 2 for Standard, and 3 for Advanced. ");
		level = input.nextInt();
			
		// checks to ensure valid level is chosen
		while (level != 1 && level != 2 && level != 3)
		{
			level = 0;
			System.out.print("You have not chosen a valid option. Please try again.");
				if (level == 0)
				{
					System.out.print("Choose your level of difficulty.");
					System.out.print("\n" + "Enter 1 for Easy, 2 for Standard, and 3 for Advanced. ");
					level = input.nextInt();
				} 
			}
			
			if (level == 1)
			{
				level = 1;
				System.out.println("I see you've chosen to take it EASY. Sharpen up those skills my friend."); 
				availableMissiles = 30;
				System.out.println("You have " + availableMissiles + " missiles to start with. Don't waste them.");
				boardSize = 6;
				gameBoard = new int[6][6];
				
			} else if (level == 2)
			{
				System.out.println("STANDARD eh? You're on your way!");
				availableMissiles = 50;
				System.out.println("You have " + availableMissiles + " missiles to start with. Best of luck!");
				boardSize = 9;
				gameBoard = new int[9][9];
				
			} else if (level == 3)
			{
				System.out.println("Feeling risky today huh? You're probably going to lose, but give ADVANCED a try.");
				availableMissiles = 75;
				System.out.println("You have " + availableMissiles + " missiles to start with. Put those skills to good use.");
				boardSize = 12;
				gameBoard = new int[12][12];
			}
			System.out.println();
	}
	
	public void setBoard(int[][] board){
		board = this.gameBoard;
	}
	
	public int missiles(int bombs) {
		bombs = this.availableMissiles;
		return bombs;
	}
	
	public int boardSize(int size) {
		size = this.boardSize;
		return size;
	}

	
	// SHIPS	
	public enum Ships {
		
		// int shipMarker is later converted to char.
		// these values are according to our getLetter method to convert to ascii values
		AIRCRAFT (5, 1, "Aircraft Carrier"),
		BATTLESHIP (4, 2, "Battleship"),
		DESTROYER (3, 4, "Destroyer"),
		SUBMARINE (3, 19, "Submarine"),
		PATROL (2, 16, "Patrol");
		
		// instance fields
		final int shipSize;
		final int shipMarker;
		final String shipString;
		
		// enum constructor
		Ships(int shipSize, int shipMarker, String shipString) {
			this.shipSize = shipSize;
			this.shipMarker = shipMarker;
			this.shipString = shipString;
		}
		
		public int getShipLength() {
			return shipSize;
		}
		
		public int getShipMarker() {
			return shipMarker;
		}
		
		public String getShipString() {
			return shipString;
		}
	}
	
	// add ships from enum ship class to array list
	// allows access in ship positioning method
	public void createShipArray(){
		//stores each ship length from enum
		shipLengthArray.add(ships.AIRCRAFT.getShipLength()); 
		shipLengthArray.add(ships.BATTLESHIP.getShipLength()); 
		shipLengthArray.add(ships.DESTROYER.getShipLength()); 
		shipLengthArray.add(ships.SUBMARINE.getShipLength()); 
		shipLengthArray.add(ships.PATROL.getShipLength()); 
		
		// stores each ship marker from enum
		shipCharArray.add(ships.AIRCRAFT.getShipMarker());
		shipCharArray.add(ships.BATTLESHIP.getShipMarker());
		shipCharArray.add(ships.DESTROYER.getShipMarker());
		shipCharArray.add(ships.SUBMARINE.getShipMarker());
		shipCharArray.add(ships.PATROL.getShipMarker());
	
	}
	
	// method to position ships
	public void positionShips() 
	{
			
			//loops through arrayLists that hold enum values for shipSize and shipMarker
			for (int j = 0; j < shipLengthArray.size();j++) {
				boolean shipsOnBoard = false;
				
				boolean spaceFree = false;
			
			start:
			while (!shipsOnBoard){		
				
				boolean horizontal = rand.nextBoolean();
				

				// generate random number for ship placement, either vertical or horizontal starting place
				int col = rand.nextInt(boardSize);
				int row = rand.nextInt(boardSize);
				
				// ensure row and column are not taken up 
				// if they are restart while loop
				if (gameBoard[row][col] > 0) {
					continue;
				}
				
				// if boolean horizontal is true
				if (horizontal) {
					
					for (int i = 0; i < shipLengthArray.get(j); i++) {
						// ensure entire space is free for ship
						if (gameBoard[row][i+1] != 0) {
							System.out.println("Searching!");
							continue start;
						} else {
						gameBoard[row][i+1] = getLetter(shipCharArray.get(j));
						}
					}
					
					
				// if boolean horizontal is false
				} else { //vertically
					
					for (int i = 0; i < shipLengthArray.get(j); i++) {
						System.out.println(gameBoard[row][i+1]);
						if (gameBoard[i+1][col] != 0) {
							System.out.println("Searching!");

							continue start;
						} else {
						gameBoard[i+1][col] = getLetter(shipCharArray.get(j));
						}
					}
				
					
				}
				
				shipsOnBoard = true;
			
				//}// end space free
			} // end if else statement
				
				
		} // end for loop
			
			
	 } // end for loop 

}