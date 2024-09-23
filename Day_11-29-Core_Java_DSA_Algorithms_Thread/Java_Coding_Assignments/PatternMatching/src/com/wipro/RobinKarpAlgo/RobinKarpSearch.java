package com.wipro.RobinKarpAlgo;

public class RobinKarpSearch {
	
	final static int d = 256;
	final static int q = 101;
	
	void search(String pattern, String text) {
		
		int m = pattern.length();
		int n = text.length();
		int i, j;
		int p = 0;
		int t = 0;
		int h = 1;
		
		for(i = 0; i < m - 1; i++) {
			
			h = (h * d) % q;
		}
		
		for(i = 0; i < m; i++) {
			
			p = (d * p + pattern.charAt(i)) % q;
			t = (d * t + text.charAt(i)) % q;
		}
		
		for(i = 0; i <= n - m; i++) {
			
			if(p == t) {
				
				for(j = 0; j < m; j++) {
					
					if(text.charAt(i + j) != pattern.charAt(j))
						break;
				}
				
				if(j == m) {
					System.out.println("Pattern Found at index " + i);
				}
			}
			
			if(i < n - m) {
				
				t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) %q;
				
				if(t < 0) {
					
					t = (t + q);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RobinKarpSearch rbks = new RobinKarpSearch();
		
		String txt1 = "AABAACAADAABAABA";
		String pat1 = "AABA";
		System.out.println("Example: 1");
		rbks.search(pat1, txt1);
		
		
		String txt2 = "life is a good life if life keeps life";
		String pat2 = "life";
		System.out.println("\nExample: 2");
		rbks.search(pat2, txt2);
	}

}
