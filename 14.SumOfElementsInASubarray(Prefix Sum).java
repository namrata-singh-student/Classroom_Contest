/*
You are given an array of integers A of size n. You will also receive q queries. Each query consists of two integers L and R, and your task is to efficiently calculate the sum of elements from index L to R (1-based indexing, inclusive).

To ensure performance on large inputs, you must use a prefix sum approach.

Input Format

The first line contains two integers: n (number of elements in the array) and q (number of queries).
The second line contains n space-separated integers representing the array A[1..n].
The next q lines each contain two integers L and R, representing a query.
Constraints

1 ≤ n, q ≤ 10^5
1 ≤ L ≤ R ≤ n
-10^4 ≤ A[i] ≤ 10^4
Output Format

For each query, print a single integer — the sum of the elements from index L to R (inclusive).
Sample Input 0

5 3
1 2 3 4 5
1 3
2 4
1 5
Sample Output 0

6
9
15
Explanation 0

Query 1: sum(1 to 3) = 1 + 2 + 3 = 6

Query 2: sum(2 to 4) = 2 + 3 + 4 = 9

Query 3: sum(1 to 5) = 1 + 2 + 3 + 4 + 5 = 15
*/

/*
Time Complexity	O(q × n)
Space Complexity	O(n)
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0 ;i< n ; i++){
            arr[i] = sc.nextInt();
        }
        while(q-->0){
            int L = sc.nextInt();
            int R = sc.nextInt();
            int sum = 0;
            for(int i = L-1 ;i < R ;i++){
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}
