/*
You are given a singly linked list. Your task is to determine whether it contains a cycle.

A cycle in a linked list occurs when a node’s next pointer points to a previous node in the list, creating a loop.
Return true if a cycle exists, otherwise return false.
Input Format

The first line contains an integer n — the number of nodes in the linked list.

The second line contains n space-separated integers — the values of the nodes in order.

The third line contains an integer pos: - -1 if there is no cycle. - Otherwise, it represents the 0-based index of the node that the last node points to (forming a cycle).

Constraints

0 ≤ n ≤ 10^5
-10^9 ≤ node value ≤ 10^9
-1 ≤ pos < n
Output Format

Print true if there is a cycle.
Print false otherwise.
Sample Input 0

3
1 2 3
1
Sample Output 0

true
Explanation 0

3 points to node at index 1 (value 2), creating a cycle.
  */

import java.io.*;
import java.util.*;

public class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         
            fast = fast.next.next; 

            if (slow == fast) return true; 
        }

        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] values = new int[n];
        
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        
        int pos = sc.nextInt();

        ListNode head = null;
        ListNode tail = null;
        ListNode[] nodeArr = new ListNode[n];

        for (int i = 0; i < n; i++) {
            ListNode newNode = new ListNode(values[i]);
            nodeArr[i] = newNode;
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        if (pos != -1 && n > 0) {
            tail.next = nodeArr[pos];
        }

        System.out.println(hasCycle(head));
    }
 
}
