/*
You are given two matrices A and B. Your task is to compute and output their matrix product C = A × B.

Matrix multiplication is defined as:

If A is of dimension p × q and B is of dimension q × r, then their product C = A × B is a p × r matrix where:

image

Input Format

First line: three integers p q r — dimensions of matrices (A is p×q, B is q×r).
Next p lines: each line contains q space-separated integers — rows of matrix A.
Next q lines: each line contains r space-separated integers — rows of matrix B.
Constraints

1 ≤ p, q, r ≤ 200
-10^4 ≤ A[i][j], B[i][j] ≤ 10^4
Output Format

Print p lines. Each line contains r space-separated integers representing a row of matrix C.
Sample Input 0

2 3 2
1 2 3
4 5 6
7 8
9 10
11 12
Sample Output 0

58 64
139 154
Explanation 0

A (2×3): 1 2 3 4 5 6

B (3×2): 7 8 9 10 11 12

Result C = A × B (2×2):

(1*7 + 2*9 + 3*11) = 58 (1*8 + 2*10 + 3*12) = 64 
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        
        int A[][] = new int[p][q];
        for(int i = 0; i<p ;i++){
            for(int j = 0; j<q ; j++){
                A[i][j] = sc.nextInt();
            }
        }
        
        int B[][] = new int[q][r];
        for(int i = 0; i<q ; i++){
            for(int j = 0 ; j<r ; j++){
                B[i][j] = sc.nextInt();
            }
        }
        
        int C[][] = new int[p][r];
        for(int i = 0; i<p ; i++){
            for(int j = 0; j<r; j++){
                for(int k = 0; k<q ; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        for(int i = 0; i<p ; i++){
            for(int j = 0; j<r ; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
