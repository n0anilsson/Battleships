
public class Player {
	public static int[][] shoot(int[][] gameboard, int col, int row) {
		gameboard[col-1][row-1] += 1;
		return gameboard;
	}
}
