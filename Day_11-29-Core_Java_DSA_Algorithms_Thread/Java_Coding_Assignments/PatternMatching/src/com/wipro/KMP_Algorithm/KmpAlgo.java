package com.wipro.KMP_Algorithm;

public class KmpAlgo {

	void KMPSearch(String pattern, String text) {
		
		int m = pattern.length();
		int n = text.length();
		
		int[] lps = new int[n];
		int j = 0;
		
		compLpsArray(pattern, m, lps);
		
		int i = 0;
		while(i < n) {
			
			if(pattern.charAt(j) == text.charAt(i)) {
				
				j++;
				i++;
			}
			
			if(j == m) {
				
				System.out.println("Pattern Found at Index: " + (i - j));
				j = lps[j - 1];
			}
			
			else if(i < n && pattern.charAt(j) != text.charAt(i)) {
				
				if(j != 0) {
					
					j = lps[j - 1];
					
				}
				
				else {
					
					i++;
					
				}
			}
		}
		
	}
	
	void compLpsArray(String pattern, int m, int[] lps) {
		
		int len = 0;
		int i = 1;
		
		lps[0] = 0;
		
		while(i < m) {
			
			if(pattern.charAt(i) == pattern.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}
			
			else {
				
				if(len != 0) {
					
					len = lps[len - 1];
				}
				
				else {
					
					lps[i] = 0;
					i++;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KmpAlgo kmpa = new KmpAlgo();
		
		String txt1 = "AABAACAADAABAABA";
		String pat1 = "AABA";
		System.out.println("Example: 1");
		kmpa.KMPSearch(pat1, txt1);
		
		
		String txt2 = "when life gets blurry adjust focus of life";
		String pat2 = "life";
		System.out.println("\nExample: 2");
		kmpa.KMPSearch(pat2, txt2);

	}

}
