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
		
		// 새 바구니
		int[] basket = new int[moves.length];
		int basketIndex = 0;
		int count = 0;
		
		// 보드와 바구니를 그림
		displayBoardAndBasket(board, basket);

		for(int i=0; i<moves.length; i++) {
			// i가 1씩 증가 순서대로 -1 번째에서 첫번째로 나온 0이외의 숫자를 뽑아냄 없으면 다음으로 넘어감
			
			// 0이 아닌 숫자가 있으면 false -> 한개씩 차례로 옮겨담기
			boolean confirmZero = true;
			for(int j=0; j<board.length; j++) {
				if(board[j][moves[i]-1]!=0) {
					// 바구니에 넣고 인덱스 +1, 보드는 0으로 바꿔줌, true
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
