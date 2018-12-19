import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		
		int[][] gameboard = Board.createBoard(8,8);
		Board.printBoard(gameboard);
		
		Scanner input = new Scanner(System.in);
		
		while (1 > 0) {
		int row = input.nextInt();
		int col = input.nextInt();
		Player.shoot(gameboard, row,col);
		Board.printBoard(gameboard);
		}
	}

}
