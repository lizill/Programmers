package JavaLevel02;

public class PiBoNaChi {
	public static void main(String[] args) {
		// 1 2 3 5 
		int n = 2141;
		
		int[] f = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		
		for(int i=2; i<n+1; i++) {
			f[i] = f[i-1] + f[i-2];
			if(f[i]>1234567) f[i] -= 1234567;
		}
		
		int ans = f[n]%1234567;
		
		int answer = ans;
		System.out.println(answer);
	}
}
