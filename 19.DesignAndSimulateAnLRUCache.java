/*
You need to implement an LRU Cache of fixed capacity.

Your cache must support the following two operations:

1️⃣ GET key:

If the key exists in the cache, return its value.

Else, return -1.

2️⃣ PUT key value:

Insert or update the value of the key.

If the cache exceeds its capacity, evict the least recently used item.

✅ Accessing a key (via GET or PUT) makes it the most recently used.

You need to process Q queries of these two types and print the results of GET queries.

Input Format

The first line contains two integers: C (capacity of the cache), Q (number of queries).

Each of the next Q lines is either:

GET key
PUT key value
Constraints

1 ≤ C ≤ 10^5
1 ≤ Q ≤ 10^5
0 ≤ key, value ≤ 10^9
All keys are integers.
Output Format

For every GET operation, output the value (or -1) on a new line.
Sample Input 0

2 7
PUT 1 10
PUT 2 20
GET 1
PUT 3 30
GET 2
GET 3
GET 1
Sample Output 0

10
-1
30
10
Explanation 0

PUT 1 10 → cache: {1=10}

PUT 2 20 → cache: {1=10, 2=20}

GET 1 → 10, makes 1 most recently used

PUT 3 30 → evicts 2 → cache: {1=10, 3=30}

GET 2 → -1 (evicted)

GET 3 → 30

GET 1 → 10
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int q=sc.nextInt();
        List<Integer> keys=new ArrayList<>();
        List<Integer> values=new ArrayList<>();
        for(int i=0; i<q; i++){
            String str=sc.next();
            if(str.equals("PUT")){
                int key=sc.nextInt();
                int val=sc.nextInt();
                int index=keys.indexOf(key);
                if(index!=-1){
                    keys.remove(index);
                    values.remove(index);
                }
                else if(keys.size()==c){
                    keys.remove(keys.size()-1);
                    values.remove(values.size()-1);
                }
                keys.add(0,key);
                values.add(0,val);
            }
            else if(str.equals("GET")){
                int key=sc.nextInt();
                int index=keys.indexOf(key);
                if(index==-1){
                    System.out.println(-1);
                }
                else {
                    int val=values.get(index);
                    keys.remove(index);
                    values.remove(index);
                    keys.add(0, key);
                    values.add(0, val);
                    System.out.println(val);
                }
            }
        }
    }
}
