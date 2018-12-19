
public class Board {
	
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
}