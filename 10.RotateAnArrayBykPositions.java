/*
ou are given an array of integers and an integer k. Rotate the array to the right by k positions.

A single rotation to the right means: the last element moves to the first position, and all other elements shift one position to the right.
If k is larger than the size of the array, rotations wrap around (i.e. perform k % n rotations).
Your task is to output the final rotated array.

Input Format

The first line contains two integers n and k — the size of the array and the number of positions to rotate.
The second line contains n space-separated integers — the elements of the array.
Constraints

1 ≤ n ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
0 ≤ k ≤ 10^9
Output Format

Print a single line with the rotated array elements separated by spaces.
Sample Input 0

5 2
1 2 3 4 5
Sample Output 0

4 5 1 2 3
Explanation 0

After rotating 2 times to the right:

1st rotation: 5 1 2 3 4

2nd rotation: 4 5 1 2 3
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void reverse(int []arr, int left, int right){
        int n = arr.length;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ;i<n ;i++){
            arr[i] = sc.nextInt();
        }
        
        k = k%n;
        reverse(arr, 0 , n-1);
        reverse(arr, 0 , k-1);
        reverse(arr, k , n-1);
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
