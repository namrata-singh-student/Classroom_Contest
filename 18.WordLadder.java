/*
A start word (beginWord) ✅ A target word (endWord) ✅ A dictionary (wordList) of valid words

You need to transform beginWord into endWord by changing exactly one letter at a time, so that each transformed word exists in the wordList.

Your task is to compute the length of the shortest such transformation sequence, including the start and end words.

✅ If no such sequence exists, output 0.

Note :

Only one letter can change at a time.
Each transformed word must be in the given wordList.
You must use only words from wordList (except beginWord, which can be outside wordList).
Input Format

First line: beginWord
Second line: endWord
Third line: integer n (number of words in the dictionary)
Next n lines: each contains a word (the wordList)
Constraints

1 ≤ n ≤ 10^4
All words have the same length, 1 ≤ word length ≤ 10
Words contain only lowercase English letters.
All words in the wordList are unique.
Output Format

A single integer — the length of the shortest transformation sequence from beginWord to endWord.
Print 0 if no such sequence exists.
Sample Input 0

hit
cog
6
hot
dot
dog
lot
log
cog
Sample Output 0

5
Explanation 0

hit → hot → dot → dog → cog
*/


import java.io.*;
import java.util.*;

class Pair{
    String first;
    int second;
    Pair(String _first , int _second){
        this.first = _first;
        this.second = _second;
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String startWord = sc.next(); 
        String endWord = sc.next();
        int n = sc.nextInt();
        String[] wordList = new String[n];
        for(int i = 0 ;i<n ;i++){
            wordList[i] = sc.next();
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startWord, 1));
        Set<String> st = new HashSet<String>();
        int len = wordList.length;
        for(int i = 0; i<len ; i++){
            st.add(wordList[i]);
        }
        st.remove(startWord);
        while(!q.isEmpty()){
            String word = q.peek().first;
            int steps= q.peek().second;
            q.remove();
            if(word.equals(endWord) == true){
                System.out.print(steps);
                return;
            }
            for(int i = 0; i<word.length(); i++){
                for(char ch = 'a' ; ch <= 'z' ; ch++){
                    char replacedCharArray[] = word.toCharArray();
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);
                    if(st.contains(replacedWord) == true){
                        st.remove(replacedWord);
                        q.add(new Pair(replacedWord , steps + 1));
                    }
                }
            }
        }
        System.out.print(0);
    }
}
    }
54
}
