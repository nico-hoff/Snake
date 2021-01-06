import java.util.Arrays;

public class GameBoard {
	int[][] board;

	public GameBoard() {
		//inport int (size)
		this.board = setupBoard(size);
	}

	public static void main(String[] args) {
		GameBoard gameBoard = new GameBoard();
		gameBoard.printBoard();
	}

	public void printBoard() {
		for(int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println("");
		}
	}

	public static int[][] setupBoard(int size) {
		int[][] board = new int[size][size];
		Arrays.stream(board)
			.forEach(c -> Arrays.stream(c)
				.forEach(v -> v = 0));
		return board;
	}

}
