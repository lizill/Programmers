package JavaLevel02;

import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] citations = {3,0,6,1,5};
		
		System.out.println(solution(citations));
		System.out.println(Arrays.toString(solution(citations)));
	}
	
	public static int[] solution(int[] citations) {
        int answer = 0;
        
        int[] countIndex = new int[citations.length];
        boolean brk = false;
        
        //처음부터 끝까지 비교
        //여러개 나올경우
        
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