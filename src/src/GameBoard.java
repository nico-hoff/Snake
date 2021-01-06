import java.util.Arrays;

public class GameBoard {
	int[][] board;
	public GameBoard() {
		this.board = setupBoard();
	}

	public static void main(String[] args) {
		GameBoard gameBoard = new GameBoard();
		gameBoard.printBoard();
	}

	public void printBoard() {
		for(int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.println(board[i][j]);
			}
		}
	}

	public static int[][] setupBoard() {
		int[][] board = new int[100][100];
		Arrays.stream(board)
			.forEach(c -> Arrays.stream(c)
				.forEach(v -> v = 0));
		return board;
	}

}
