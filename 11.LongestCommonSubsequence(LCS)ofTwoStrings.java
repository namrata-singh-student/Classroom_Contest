/*
Given two strings A and B, find the length of their Longest Common Subsequence (LCS).

A subsequence of a string is obtained by deleting zero or more characters without changing the relative order of the remaining characters.
The Longest Common Subsequence is the longest sequence that is a subsequence of both strings.
Input Format

The first line contains the string A.
The second line contains the string B.
Constraints

1 ≤ |A|, |B| ≤ 1000

Strings consist of lowercase English letters only.

Output Format

Print a single integer — the length of the longest common subsequence.
Sample Input 0

abcde
ace
Sample Output 0

3
  **/
import java.io.*;
import java.util.*;

public class Solution {
    public static int lcs(String A, String B) {
        int n = A.length();
        int m = B.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        
        System.out.println(lcs(A, B));
    }
}
