/*
You are given two sorted arrays in non-decreasing order. Your task is to merge them into a single sorted array in non-decreasing order, without using any built-in sort function.

You must maintain the order and efficiently combine both arrays.

Input Format

The first line contains an integer n — the size of the first array.
The second line contains n space-separated integers — the elements of the first array (sorted).
The third line contains an integer m — the size of the second array.
The fourth line contains m space-separated integers — the elements of the second array (sorted).
Constraints

1 ≤ n, m ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
Both arrays are already sorted in non-decreasing order.
Output Format

Print a single line containing the merged sorted array with all elements separated by spaces.

Sample Input 0

5
1 3 5 7 9
4
2 4 6 8
Sample Output 0

1 2 3 4 5 6 7 8 9
*/

//C++ code----------------------------------------------------------------------------
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n ;
    cin>>n;
    vector<int>arr1(n + 100000);
    for(int i = 0; i<n ;i++){
        cin>>arr1[i];
    }
    int m ;
    cin>>m;
    vector<int>arr2(m);
    for(int i = 0; i<m ;i++){
        cin>>arr2[i];
    }
    int  i = n-1 , j= m-1;
    int index = m+n-1;
    while(i>= 0 && j>=0){
        if(arr1[i] >= arr2[j]){
            arr1[index] = arr1[i];
            index--;
            i--;
        }else{
            arr1[index] = arr2[j];
            index--; j--;
        }
    }
    while (j >= 0) {
        arr1[index--] = arr2[j--];
    }
    for(int  k = 0 ; k<(m+n) ; k++){
        cout<< arr1[k]<<" ";
    }
    return 0;
}
//Java Code---------------------------------------------------------------------------
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i = 0; i<n ;i++){
            A[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int B[] = new int[m];
        for(int i = 0; i<m ;i++){
            B[i] = sc.nextInt();
        }
        int i = n-1, j= m-1;
        int ans[] = new int[n+m];
        int index = m+n-1;
        while(i>=0 && j>=0){
            if(A[i] >= B[j]){
                ans[index] = A[i];
                index--;
                i--;
            }else{
                ans[index] = B[j];
                index--;
                j--;
            }
        }
        while(j>=0){
            ans[index] = B[j];
            index--; j--;
        }
        while(i>=0){
            ans[index] = A[i];
            index--; i--;
        }
        
        for(int x = 0; x<(m+n) ; x++){
            System.out.print(ans[x]+" ");
        }
    }
}
