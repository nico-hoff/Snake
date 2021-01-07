import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
	public static void main(String[] args) {
		//GameBoard gameBoard = new GameBoard();
		//gameBoard.printBoard();

		//oneTothree();

		int[] four = {63, 803, 513};
		for (int num : four) {
			four(num, 0);
		}

		four(255, 2);
	}

	public static void oneTothree() {
		//info18 Aufgabe eins bis drei
		System.out.println(5 / 3);
		System.out.println(1.0 / 2);
		System.out.println("hallo" + 1 + (int) 2.99);
		System.out.println(5 + 2 + "hallo" + 'a');
		System.out.println(3 % 2 + 1 == 1 ? 2 : 3);
		int x = 1;
		x = -x++ + x;
		//1; -1 + 2 = 1
		System.out.println("x = -x++ + x; x = " + x);

		x = 1;
		x = +x-- - x;
		//1; 1 - 0 = 1
		System.out.println("x = +x-- - x; x = " + x);
	}

	public static void four(int x, int info) {
		int temp;
		int mod;
		int rest = 1;
		StringBuffer builder = new StringBuffer();
		int[] system = {16, 8, 2};
		char[][] nums = {{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'}, {'0', '1', '2', '3', '4', '5', '6', '7'}, {'0', '1'}};
		String[] code = {"Hex: 0x", "Octa: 0", "Binary: 0B"};

		if (info != 0) {
			temp = x;
			for (int j = 1; temp > 0; j++) {
				mod = temp % system[ info ];
				builder.append(nums[ info ][ mod ]);
				temp /= system[ info ];
			}
			System.out.println("Deci: " + x + " " + code[ info ] + builder);
		} else {
			for (int i = 0; i < system.length; i++) {
				temp = x;
				for (int j = 1; temp > 0; j++) {
					mod = temp % system[ i ];
					builder.append(nums[ i ][ mod ]);
					temp /= system[ i ];
				}
				System.out.println("Deci: " + x + " " + code[ i ] + builder);
				builder = new StringBuffer();
			}
		}
	}
}
