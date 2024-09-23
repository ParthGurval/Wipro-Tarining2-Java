package com.wipro.NaiveStringMatching;

public class NaiveStringMatch {

	void search(String text, String pattern) {

		int n = text.length();
		int m = pattern.length();
		
		for(int i = 0; i <= n - m; i++) {
			
			int j;
			
			for(j = 0; j < m; j++) {
				
				if(text.charAt(i + j) != pattern.charAt(j)) {
					
					break;
				}
			}
			
			if(j == m) {
				
				System.out.println("Pattern Found at Index "+ i);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NaiveStringMatch nsm = new NaiveStringMatch();
		
		String txt1 = "AABAACAADAABAABA";
		String pat1 = "AABA";
		System.out.println("Example: 1");
		nsm.search(txt1, pat1);
		
		
		String txt2 = "agd";
		String pat2 = "g";
		System.out.println("\nExample: 2");
		nsm.search(txt2, pat2);
	}

}
