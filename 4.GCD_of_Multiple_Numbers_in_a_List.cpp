// You are given a list of N positive integers. Your task is to find the Greatest Common Divisor (GCD) of all the numbers in the list.

// The GCD of a list of numbers is the largest positive integer that divides each of them without leaving a remainder.

// Input Format

// The first line contains a single integer N — the number of elements in the list.
// The second line contains N space-separated positive integers.
// Constraints

// 2 ≤ N ≤ 10^5
// 1 ≤ Ai ≤ 10^12
// Output Format

// Print a single integer — the GCD of all the numbers in the list.
// Sample Input 0

// 3
// 12 18 24
// Sample Output 0

// 6

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
    vector<long long>nums(n);
    for (int i = 0; i < n; i++) {
        cin >>nums[i];
    }
    long long result = nums[0];
    for (int i = 1; i< n;i++) {
        result = __gcd(result, nums[i]);
    }
    cout<< result<<endl;
    return 0;
}
