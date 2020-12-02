package JavaLevel02;

import java.util.Arrays;

public class Stock {
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		
		System.out.println(Arrays.toString(solution(prices)));
	}
	
    public static int[] solution(int[] prices) {
        int[] answer = {};
        
        // 카운트를 센 자리에 넣어줌
        int[] count = new int[prices.length];
        
        // 들어온 숫자 순서로 차례대로 숫자비교
        for(int i=0; i<prices.length; i++) {
        	
        	// 뒤의 숫자들만 비교
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
