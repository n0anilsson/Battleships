
public class Main {
		
	public static void main(String[] args) {
		
		int[][] gameboard = Board.createBoard(8,8);
		Board.printBoard(gameboard);
		
		gameboard[5][6] = 1;
		gameboard[5][7] = -1;
		
		Board.printBoard(gameboard);
		
		Player.shoot(gameboard, 3,7);
		Board.printBoard(gameboard);
	}

}
