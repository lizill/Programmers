package JavaLevel01;

import java.util.Arrays;

public class CrainGame {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		solution(board, moves);
	}
	
	public static void solution(int[][] board, int[] moves) {

		/*
		 * 0 0 0 0 0
		 * 0 0 1 0 3
		 * 0 2 5 0 1
		 * 4 2 4 4 2
		 * 3 5 1 3 1
		 * 
		 * 1 5 3 5 1 2 1 4
		 */
		
		int[] basket = new int[moves.length];
		int basketIndex = 0;
		int count = 0;
		
		displayBoardAndBasket(board, basket);

		for(int i=0; i<moves.length; i++) {
			boolean confirmZero = true;
			for(int j=0; j<board.length; j++) {
				if(board[j][moves[i]-1]!=0) {
					basket[basketIndex++] = board[j][moves[i]-1];
					board[j][moves[i]-1] = 0;
					confirmZero = false;
					break;
				}
			}
			if(confirmZero) continue;

			if(basketIndex>1) {
				if(basket[basketIndex-1] == basket[basketIndex-2]) {
					basket[basketIndex-1] = 0;
					basket[basketIndex-2] = 0;
					basketIndex = basketIndex - 2;
					count++;
				}
			}
		}

		displayBoardAndBasket(board, basket);
		System.out.println(count*2);
	}
	
	private static void displayBoardAndBasket(int[][] board, int[] basket) {
		System.out.println();
		for(int i=0; i<board.length; i++) {
			System.out.println(Arrays.toString(board[i]));
		}
		System.out.println("---------------------");
		System.out.println(Arrays.toString(basket));
	}
	
}
