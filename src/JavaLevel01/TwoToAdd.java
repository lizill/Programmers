package JavaLevel01;

import java.util.TreeSet;

public class TwoToAdd {

	public static void main(String[] args) {
		
		
		int[] numbers = {2,1,3,4,1};
		
		System.out.println(solution(numbers));

	}
	
	private static TreeSet<Integer> solution(int[] numbers) {

		TreeSet<Integer> numberList = new TreeSet<Integer>();
		
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=0; j<=i; j++) {
				int num = numbers[j] + numbers[i+1];
				numberList.add(num);
			}
		}
		
		return numberList;
	}

}
