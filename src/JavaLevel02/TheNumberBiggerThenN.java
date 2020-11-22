package JavaLevel02;

import java.util.Scanner;

public class TheNumberBiggerThenN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = n + 1; // 다음 큰수
		
		String firstNum = Integer.toBinaryString(n);
		int fNcountOne = 0; 
		
		for(int i=0; i<firstNum.length(); i++) { // 입력받은 수 1의 갯수
			if(firstNum.charAt(i)=='1') fNcountOne++;
		}
		
		while(true) {
			String secondNum = Integer.toBinaryString(m); // 다음 큰수 2진수
			int sNcountOne = 0; // 다음 큰수 1의 갯수
			
			for(int i=0; i<secondNum.length(); i++) { // 다음 큰수 1의 갯수
				if(secondNum.charAt(i)=='1') sNcountOne++;
			}
			if(fNcountOne==sNcountOne) break;
			else m++;
		}
		
		System.out.println(m);
		
		input.close();
	}
}