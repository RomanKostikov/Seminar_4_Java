package Classwork.task001;

// import java.util.LinkedList;

// Given the head of a singly linked list, reverse the list, and return the reversed list.
// При наличии заголовка отдельно связанного списка сторнируйте список и верните обратный список.

public class Task001 {
    public static void main(String[] args) {
        System.out.println(head);
    }

    // Definition for singly-LinkedList list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode current = head;
            ListNode nextNode = null;
            while (current != null) {
                ListNode node = new ListNode(current.val);
                node.next = nextNode;
                nextNode = node;
                current = current.next;
            }
            return nextNode;
        }
    }
}