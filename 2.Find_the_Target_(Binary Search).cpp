/*
You are given a sorted array of integers in non-decreasing order and a target value. Your task is to determine the index of the target in the array using binary search.

If the target exists in the array, print its 0-based index.
If the target does not exist in the array, print -1.
Input Format

First line contains an integer n — the size of the array.
Second line contains n space-separated integers — the elements of the array (sorted in non-decreasing order).
Third line contains an integer target — the value to search for.
Constraints

1 ≤ n ≤ 10^5
-10^9 ≤ arr[i], target ≤ 10^9
The array is sorted in non-decreasing order.
Output Format

Print a single integer — the index of target in the array, or -1 if not found.
Sample Input 0

8
-5 -2 0 3 3 3 7 9
3
Sample Output 0

3
*/



//java code---------------------------------------------------------------------
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
        int target = sc.nextInt();
        int left = 0 ,right = n-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                return;
            }
            if(arr[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        System.out.println(-1);
    }
}
//c++ code----------------------------------------------------------------------

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    cin>>n;
    int arr[n];
    for(int  i =0 ;i<n ;i++){
        cin>>arr[i];
    }
    int target;
    cin>>target;
    int st = 0, end = n-1;
    while(st<=end){
        int mid = st + (end - st)/2;
        if(arr[mid] == target){
            cout<<mid;
            return 0;
        }
        if(arr[mid] > target){
            end = mid-1;
        }else if(arr[mid]< target){
            st = mid+1;
        }
    }
    cout<< -1;
    return 0;
}
