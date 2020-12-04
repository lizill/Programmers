package JavaLevel02;

import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {
		
		int[] citations = {3,0,6,1,5};
		
		System.out.println(solution(citations));
		System.out.println(Arrays.toString(solution(citations)));
	}
	
	public static int[] solution(int[] citations) {
        int answer = 0;
        
        int[] countIndex = new int[citations.length];
        boolean brk = false;
        
        for(int i=0; i<citations.length; i++) {
            int count = 0;
        	for(int j=0; j<citations.length; j++) {
        		if(citations[i]<=citations[j]) {
        			count++;
        		}
        		if(count >= citations[i]) {
            		countIndex[i] = citations[i];
        		}
        		if(citations[i]>citations[j]) {
        			
        		}
        	}
        	if(countIndex[i]>answer) {
        		answer = countIndex[i];
        	}
        }
        
//        return answer;
        return countIndex;
    }
}