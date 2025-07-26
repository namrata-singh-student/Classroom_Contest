/*
You are given a non-empty string S which may contain letters (uppercase and lowercase), digits, spaces, and special characters .

Your task is to :

Ignore all spaces in the string.
Convert all letters to lowercase.
Count the frequency of each character (letters and digits only; exclude special characters like @, #, !, etc.).
Print the characters and their frequencies sorted by character in increasing order (lexicographically).
Input Format

A single line containing the string S.
Constraints

1 ≤ |S| ≤ 10^5
S can contain letters (a–z, A–Z), digits (0–9), spaces, and special characters.
Output Format

Output - c : f

c is the character (a lowercase letter or digit)
f is its frequency count in the cleaned string
✅ The output must be sorted by character in increasing order (i.e. digits 0–9 first, then letters a–z).
Sample Input 0

Hello World! 123
Sample Output 0

1 : 1
2 : 1
3 : 1
d : 1
e : 1
h : 1
l : 3
o : 2
r : 1
w : 1
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<unordered_map>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    string s;
    getline(cin , s);
    //int n = s.length();
    //int freq[62] = {0};
    unordered_map<char, int>freq;
    for (char ch : s) {
        if(isalnum(ch)) {
            ch = tolower(ch);
            freq[ch]++;
        }
    }
    for(char ch = '0'; ch <= '9'; ch++) {
        if(freq.count(ch)) {
            cout << ch << " : " << freq[ch] << endl;
        }
    }

    for(char ch = 'a'; ch <= 'z'; ch++) {
        if(freq.count(ch)) {
            cout << ch << " : " << freq[ch] << endl;
        }
    }
    return 0;
}
