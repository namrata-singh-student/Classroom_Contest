/*
You are given an array of integers. Your task is to remove all duplicate elements while preserving the order of first occurrence.

Print the resulting array of unique elements in the order they first appeared in the input.

Input Format

The first line contains an integer n — the number of elements in the array.
The second line contains n space-separated integers.
Constraints

1 ≤ n ≤ 10^5
-10^9 ≤ arr[i] ≤ 10^9
Output Format

Print a single line with the unique elements separated by spaces, in their original order of first appearance.

Sample Input 0

8
1 2 3 2 1 4 5 3
Sample Output 0

1 2 3 4 5
*/

//Brute Force Approach----
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<unordered_map>
#include<set>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n ; 
    cin>>n;
    vector<int>arr(n);
    for(int i = 0; i<n ;i++){
        cin>>arr[i];
    }
    sort(arr.begin() , arr.end());
    for(int i = 0; i<n ;i++){
        bool isDuplicate = false;
        for(int j=0; j<i ;j++){
            if(arr[i] == arr[j]){
                isDuplicate = true;
                break;
            }
        }
        if(!isDuplicate){
            cout<< arr[i] << " ";
        }
    }
    return 0;
}


//Otimal Approach

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<unordered_map>
#include<set>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n ; 
    cin>>n;
    vector<int>arr(n);
    for(int i = 0; i<n ;i++){
        cin>>arr[i];
    }
    set<int> st;
    for(int num : arr){
        st.insert(num);
    }
    for(int num : st){
        cout << num << " ";
    }
    return 0;
}
