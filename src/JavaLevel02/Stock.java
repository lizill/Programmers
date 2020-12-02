package JavaLevel02;

import java.util.Arrays;

public class Stock {
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		
		System.out.println(Arrays.toString(solution(prices)));
	}
	
    public static int[] solution(int[] prices) {
        int[] answer = {};
        int[] count = new int[prices.length];
        
        for(int i=0; i<prices.length; i++) {
        	
        	for(int j=i+1; j<prices.length; j++) {
        		if(prices[i] <= prices[j]) {
        			count[i]++;
        		} else {
        			count[i]++;
        			break;
        		}
        	}
        	
        }
        
        answer = count;
        
        return answer;
    }
}
