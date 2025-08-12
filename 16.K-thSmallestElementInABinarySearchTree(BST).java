/*
You are given a Binary Search Tree (BST) with unique integer values.

Your task is to find the K-th smallest element in the BST (when its elements are listed in sorted order via in-order traversal).

If K is invalid (e.g., larger than the number of nodes), output -1.
Input Format

The first line contains an integer n — the number of nodes in the BST.
The second line contains n space-separated integers — the node values, given in the order of insertion (they form the BST).
The third line contains an integer k
Constraints

1 ≤ n ≤ 10^5
1 ≤ node value ≤ 10^9 (all unique)
1 ≤ k ≤ 10^5
Output Format

Print a single integer — the K-th smallest element in the BST.
Print -1 if k is invalid.
Sample Input 0

7
5 3 7 2 4 6 8
3
Sample Output 0

4
Explanation 0

In-order traversal: [2, 3, 4, 5, 6, 7, 8]

3rd smallest = 4.
  */


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if( k > n){
            System.out.print(-1);
            return;
        }
        Arrays.sort(arr);
        
        System.out.print(arr[k-1]);
    }
}
