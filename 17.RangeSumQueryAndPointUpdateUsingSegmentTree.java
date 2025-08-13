/*
You are given an array of n integers.

Your task is to efficiently handle two types of queries:

1️⃣ Update Query: Update the value at index i to x. 2️⃣ Range Sum Query: Compute the sum of elements from index l to r (inclusive).

You must process q queries of these two types.

Input Format

The first line contains two integers n and q — the number of elements in the array and the number of queries.

The second line contains n space-separated integers — the initial array.

The next q lines each describe a query in one of the following formats:

1 i x — Update the element at index i (1-based) to x.
2 l r — Compute and print the sum of elements from index l to r (1-based inclusive).
Constraints

1 ≤ n, q ≤ 10^5
1 ≤ array elements, x ≤ 10^9
1 ≤ i, l, r ≤ n
Output Format

For each range sum query (type 2), print the sum on a new line.
Sample Input 0

5 5
1 2 3 4 5
2 1 3
1 2 10
2 1 3
1 5 20
2 4 5
Sample Output 0

6
14
24
Explanation 0

Sum(1,3) = 1+2+3 = 6
After update: [1,10,3,4,5]
Sum(1,3) = 1+10+3 = 14
After update: [1,10,3,4,20]
Sum(4,5) = 4+20 = 24
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
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        while (q-- > 0) {
            int type = sc.nextInt();
            if (type == 1) {
                int i = sc.nextInt();
                int x = sc.nextInt();
                arr[i-1] = x;
            } else if (type == 2) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int sum = 0;
                for(int  j = l-1 ; j<r ; j++){
                    sum += arr[j];
                }
                System.out.println(sum);
            }
        }

    }
}
