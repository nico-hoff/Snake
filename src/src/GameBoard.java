import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

import java.util.Scanner;


public class GameBoard {
	int[][] board;
	public GameBoard() {
		this.board = setupBoard();
	}

	public static void main(String[] args) {


	}

	public void printBoard()

	}

	public static int[][] setupBoard() {
		int[][] board = new int[100][100];
		Arrays.stream(board)
			.forEach(c -> Arrays.stream(c)
				.forEach(v -> v = 0));
		return board;
	}

}
