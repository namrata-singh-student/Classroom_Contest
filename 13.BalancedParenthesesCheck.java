/*
You are given a string S consisting only of the characters '(', ')', '{', '}', '[', and ']'.

Your task is to determine whether the parentheses/brackets in S are balanced.

Parentheses are balanced if every opening bracket has a corresponding closing bracket of the same type, and brackets are closed in the correct order.

For example:

"()", "[()]", and "{[]}" are balanced.

"(]", "([)]", and "(((" are not.

Input Format

A single line containing the string S.
Constraints

1 ≤ |S| ≤ 10^5
S contains only the characters '(', ')', '{', '}', '[', and ']'.
Output Format

Print "YES" if the parentheses are balanced.
Print "NO" otherwise.
Sample Input 0

()[]
Sample Output 0

YES
Explanation 0

Both () and [] are correctly matched and properly ordered.
*/

//C++ Code----------------------------------------------------------------
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <stack>
using namespace std;
int isBalancedParentheses(string &s){
    stack<char>st;
    for(char ch : s){
        if(st.empty() ||ch == '(' || ch == '{' || ch == '['){
            st.push(ch);
            continue;
        }
        if(ch == ')'){
            if(st.top() == '('){
                st.pop();
            }else{
                return false;
            }
        }else if(ch == '}'){
            if(st.top() == '{'){
                st.pop();
            }else{
                return false;
            }
        }else if(ch == ']'){
            if(st.top() == '['){
                st.pop();
            }else{
                return false;
            }
        }
    }
    return st.empty();
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    string s;
    cin>>s;
    
    if(isBalancedParentheses(s)){
        cout<< "YES";
    }else{
        cout<< "NO";
    }
    return 0;
}


//JAVA Code-------------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isBalancedParentheses(String s){
        Stack<Character> st = new Stack<>();
        char[] chars = s.toCharArray();
        for(char ch : chars){
            if(st.isEmpty() || ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
                continue;
            }
            if(ch == ')'){
                if(st.peek() == '('){
                    st.pop();
                }else{
                    return false;
                }
            }else if(ch == '}'){
                if(st.peek() == '{'){
                    st.pop();
                }else{
                    return false;
                }
            }else if(ch == ']'){
                if(st.peek() == '['){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        if(isBalancedParentheses(s)){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
