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
