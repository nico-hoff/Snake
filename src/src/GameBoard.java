import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

import java.util.Scanner;

public class GameBoard {
	Scanner sc = new Scanner(System.in);
	int[][] board;

	public GameBoard() {
		this.board = setupBoard();
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

	public int[][] setupBoard() {
		System.out.println("Please enter board size: ");
		int size = sc.nextInt();
		int[][] board = new int[size][4*size];
		Arrays.stream(board)
			.forEach(c -> Arrays.stream(c)
				.forEach(v -> v = 0));
		return board;
	}

}
