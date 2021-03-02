package JavaLevel02;

public class Land124 {

	public static void main(String[] args) {
		int n = 10;
		
		System.out.println(solution(n));
	}

	public static String solution(int n) {
		String answer = "";
		boolean b = false;
		
		while(n>3) {
			switch(n%3) {
			case 0:
				answer = '4' + answer;
				break;
			case 1:
				answer = '1' + answer;
				break;
			case 2:
				answer = '2' + answer;
				break;
			}
			n = n/3 + n%3;
			
			b = true;
		}
		
		System.out.println(n);
		
		return answer;
	}
	
}