package com.wipro.OptimalBST;

public class OptimalBST {

    
    static int optimalBST(int[] keys, int n) {
        int[][] cost = new int[n][n];

        
        for (int i = 0; i < n; i++) {
            cost[i][i] = 0;
        }

       
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                cost[i][j] = Integer.MAX_VALUE;

               
                for (int r = i; r <= j; r++) {
                    
                    int c = ((r > i) ? cost[i][r - 1] : 0) +
                            ((r < j) ? cost[r + 1][j] : 0) +
                            sum(keys, i, j);

                    
                    if (c < cost[i][j]) {
                        cost[i][j] = c;
                    }
                }
            }
        }

        
        return cost[0][n - 1];
    }

    
    static int sum(int[] keys, int i, int j) {
        int s = 0;
        for (int k = i; k <= j; k++) {
            s += keys[k];
        }
        return s;
    }

    
    public static void main(String[] args) {
        int[] keys = {10, 20, 30, 40, 50, 60, 70};
        int n = keys.length;

        System.out.println("The Cost of Optimal BST is " + optimalBST(keys, n));
    }
}
