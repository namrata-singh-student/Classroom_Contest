// You are given a string s, which may contain letters (uppercase or lowercase), digits, spaces, and special characters.

// Your task is to:

// Remove all characters except alphabets and digits.
// Convert all uppercase letters to lowercase.
// Check if the cleaned-up string is a palindrome.
// A palindrome is a string that reads the same backward as forward.

//   Sample Input 0

// A man, a plan, a canal: Panama
// Sample Output 0

// YES

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

bool validPalindrome(string &s){
    int n = s.length();
    int left = 0, right = n-1;
    while(left<=right){
        if(!isalnum(s[left])){
            left++;
        }else if(!isalnum(s[right])){
            right--;
        }else if(tolower(s[left]) != tolower(s[right])){
            return false;
        }else{
            left++;
            right--;
        }
    }
    return true;
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    string s;
    getline(cin, s);
    if(validPalindrome(s)){
        cout<<"YES";
    }else{
        cout<<"NO";
    }
    return 0;
}
