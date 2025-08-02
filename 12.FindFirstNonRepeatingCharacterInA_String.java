/*
Given a string S consisting of lowercase English letters, find the first non-repeating character in the string.

A non-repeating character is a character that occurs exactly once in the string.
If no non-repeating character exists, output "NO".
Your task is to find and print the first such character (based on its position in the string).

Input Format

A single line containing the string S.
Constraints

1 ≤ |S| ≤ 10^5

String S consists of lowercase English letters only.

Output Format

Print the first non-repeating character in S.
If there is no non-repeating character, print "NO" (without quotes).
Sample Input 0

abacabad
Sample Output 0

c
Explanation 0

Frequencies: a=4, b=2, c=1, d=1

First non-repeating: c at position 3.
  */

//JAVA CODE
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch , mp.getOrDefault(ch , 0) +1);
        }
        
        for(char ch : s.toCharArray()){
            if(mp.get(ch) == 1){
                System.out.println(ch);
                return ;
            }
        }
        System.out.print("NO");
    }
}

//One more optimal way
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int[] freq = new int[256];
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }
        
        for(int i = 0; i<s.length() ;i++){
            if(freq[s.charAt(i)] == 1){
                System.out.print(s.charAt(i));
                return ;
            }
        }
        System.out.print("NO");
    }
}

//C++ Code
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <unordered_map>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    string s;
    cin>>s;
    
    unordered_map<char , int> freq;
    for(char ch : s){
        freq[ch]++;
    }
    for(char ch : s){
        if(freq[ch] == 1){
            cout<< ch ; 
            return 0;
        }
    }
    cout<<"NO";
    return 0;
}
