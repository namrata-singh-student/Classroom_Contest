/*
You are given an array of integers (which may contain duplicate values, negative numbers, and very large or small values).

Your task is to find the second largest distinct element in the array.

If there is no second distinct largest element (because all elements are the same), print "NO".

Important:

The "second largest" must be different from the largest.
Duplicates do not count as different elements.
Input Format

The first line contains an integer n — the number of elements in the array.
The second line contains n space-separated integers.
Constraints

2 ≤ n ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
Output Format

Print the second largest distinct element.
If it does not exist, print NO.
Sample Input 0

6
5 3 9 1 9 5
Sample Output 0

5
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        // if(n < 2){
        //     System.out.print("NO");
        //     return;
        // }
        Arrays.sort(arr);
        long largest = arr[n-1];
        long secondLargest = Integer.MIN_VALUE;
        for(int i = n-2; i>=0 ;i--){
            if(arr[i] != largest){
                secondLargest = arr[i];
                break;
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("NO SECOND LARGEST");
        }
        else{
            System.out.println(secondLargest);
        }
        sc.close();
    }
}
