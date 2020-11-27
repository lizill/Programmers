package JavaLevel01;

import java.util.Arrays;

public class CrainGame {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		solution(board, moves);
	}
	
	public static void solution(int[][] board, int[] moves) {
//	        int answer = 0;
	        
	        /*
	         * 0 0 0 0 0
	         * 0 0 1 0 3
	         * 0 2 5 0 1
	         * 4 2 4 4 2
	         * 3 5 1 3 1
	         * 
	         * 0 0 0 0 0 0 0 0
	         * 4 3 1 1 3 2 0 4
	         */
	        
	        int[] tmp = new int[moves.length];
	        for(int i=0; i<tmp.length; i++) {
	        	tmp[i]=0;
	        }
	        
	        boolean zero = false;
	        for(int i=0; i<moves.length; i++) {
	        	for(int j=0; j<board.length; j++) {
	        		if(board[j][moves[i]-1] != 0) {
	        			tmp[i] = board[j][moves[i]-1];
	        			board[j][moves[i]-1] = 0;
	        			zero = false;
	        			break;
	        		}
	        	}
	        	if(zero) {
	        		tmp[i] = 0;
	        	}
	        }
	        
	        System.out.println(Arrays.toString(tmp));
	        
	        int[] tmp2 = new int[tmp.length];
	        int count = 0;
	        
	        for(int i=0; i<tmp.length; i++) { // tmp2의 첫번째 자리를 입력
	        	if(tmp[i] != 0) tmp2[0] = tmp[i];
	        }
	        
	        for(int i=1; i<tmp2.length; i++) {
	        	for(int j=1; j<tmp.length; j++) {
	        		if(tmp[j] != tmp[i-1] && tmp[j] != 0) {
	        			tmp2[i] = tmp[j];
	        		} else if (tmp[j] == 0) {
	        			continue;
	        		} else if (tmp[j] == tmp[i-1]) {
	        			count++;
//	        			i--;
	        			break;
	        		}
	        	}
	        }
	        
	        System.out.println(count);
	}
}
