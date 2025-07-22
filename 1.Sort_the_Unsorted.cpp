// You are given an unsorted array of integers. Your task is to sort the array in non-decreasing order and print the sorted array.

// Input Format

// First line contains an integer n — the number of elements in the array.
// Second line contains n space-separated integers — the elements of the array.
// Constraints
// 1 ≤ n ≤ 10^5
// -10^9 ≤ arr[i] ≤ 10^9
// Output Format
// Print the sorted array in non-decreasing order, with each element separated by a space.
// Sample Input 0
// 5
// 3 1 4 2 5
// Sample Output 0
// 1 2 3 4 5



//Solution----------------------------------------------------------------
//TC = O(n log n), SC = O(log n)

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
  /* Enter your code here. Read input from STDIN. Print output to STDOUT */
  int n;
  cin >> n;
  int arr[n];
  for (int i = 0; i < n; i++)
  {
    cin >> arr[i];
  }

  sort(arr, arr + n);
  for (int i = 0; i < n; i++)
  {
    cout << arr[i] << " ";
  }
  return 0;
}
