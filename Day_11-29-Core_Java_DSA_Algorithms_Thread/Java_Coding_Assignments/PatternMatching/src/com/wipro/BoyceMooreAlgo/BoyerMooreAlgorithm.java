package com.wipro.BoyceMooreAlgo;

import java.util.*;

public class BoyerMooreAlgorithm {
	
	private void badCharHeuristic(char[] pattern, int m, int[] badChar) {
		
		Arrays.fill(badChar, -1);
		
		for(int i = 0; i < m; i++) {
			
			badChar[(int) pattern[i]] = i;
		}
		
	}
	
	private void preprocessGoodSuffix(char[] pattern, int m, int[] suffix, boolean[] prefix) {
		
		for(int i = 0; i < m; i++) {
			
			suffix[i] = -1;
			prefix[i] = false;
		}
		
		for(int i = 0; i < m - 1; i++) {
			
			int j = i;
			int k = 0;
			
			while(j >= 0 && pattern[j] == pattern[m - 1 - k]) {
				
				j--;
				k++;
				
				if( k < m) {
					
					suffix[k] = j + 1;
				}
				
			}
			
			if(j == -1) {
				
				prefix[k] = true;
			}
		}
	}
	
	private int goodSuffixShift(int j, int m, int[] suffix, boolean[] prefix) {
		
		int k = m - 1 - j;
		
		if( k >= m) {
			
			return m;
		}
		
		if(suffix[k] != -1) {
			
			return j - suffix[k] + 1;
		}
		
		for(int r = j + 2; r <= m - 1; r++) {
			
			if(prefix[m-r]) {
				
				return r;
			}
		}
		
		return m;
	}

	public void search(String text, String pattern) {
		
		char[] txt = text.toCharArray();
		char[] pat = pattern.toCharArray();
		int n = txt.length;
		int m = pat.length;
		
		int[] badChar = new int[256];
		int[] suffix = new int[m];
		boolean[] prefix = new boolean[m];
		
		badCharHeuristic(pat, m, badChar);
		preprocessGoodSuffix(pat, m, suffix, prefix);
		
		int shift = 0;
		
		while(shift <= (n - m)) {
			
			int j = m - 1;
			
			while(j >= 0 && pat[j] == txt[shift + j]) {
				
				j--;
			}
			
			if(j < 0) {
				
				System.out.println("Pattern found at index " + shift);
				shift += goodSuffixShift(0, m, suffix, prefix);
			}
			
			else {
				
				int badCharShift = j - badChar[txt[shift + j]];
				int goodSuffixShift = goodSuffixShift(j, m, suffix, prefix);
				shift += Math.max(badCharShift, goodSuffixShift);
			}
		}
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BoyerMooreAlgorithm bm = new BoyerMooreAlgorithm();
		
		String txt1 = "AABAACAADAABAABA";
		String pat1 = "AABA";
		System.out.println("Example: 1");
		bm.search(txt1, pat1);
		
		
		String txt2 = "life is a good life if life keeps life";
		String pat2 = "life";
		System.out.println("\nExample: 2");
		bm.search(txt2, pat2);
	}

}
