package linkedlist;

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

class Solutions {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry =0;
        while (l1!=null || l2!=null || carry!=0) {
            int sum = carry;
            if (l1!=null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2!=null) {
                sum+= l2.val;
                l2 = l2.next;
            }
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
        }
        return dummy.next;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1!=null && list2!=null) {
            if (list1.val <= list2.val) {
                curr.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                curr.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if (list1!=null) {
                curr.next = new ListNode(list1.val);
        }
        if (list2!=null) {
                curr.next = new ListNode(list2.val);
        }
        return dummy.next;
    }
}
