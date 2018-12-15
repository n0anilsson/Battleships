
public class Main {

	public static int[][] createBoard(int rows, int cols) {
		
		int[][] board = new int[rows][cols];
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				board[i][j] = 0;
			}
		}
		return board;
	}
	
	public static void printBoard(int[][] board) {
		
		System.out.println();
		System.out.println("_______________________");
		System.out.println("ROUND 1  -  HIT % ");
		System.out.println("_______________________");
		System.out.println();
		
		System.out.println("  A B C D E F G H");
		for(int i = 0; i < board.length; i++) {
			System.out.print(i+1);
			for(int j = 0; j < board[0].length; j++) {
				if(board[i][j] == 0) {
					System.out.print(" ~");
				} else if (board[i][j] == -1) {
					System.out.print(" O");
				} else {
					System.out.print(" X");
				}
			}
			System.out.println();
		}
	}
	
	public static int[][] shoot(int[][] gameboard, int col, int row) {
		gameboard[col-1][row-1] += 1;
		return gameboard;
	}
	
	public static void main(String[] args) {
		
		int[][] gameboard = createBoard(8,8);
		printBoard(gameboard);
		
		gameboard[5][6] = 1;
		gameboard[5][7] = -1;
		
		printBoard(gameboard);
		
		shoot(gameboard, 3,7);
		printBoard(gameboard);
	}

}
