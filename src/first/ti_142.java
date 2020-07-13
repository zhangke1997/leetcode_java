package first;
//滑行链表 判断入口  数组找重复的值

public class ti_142 {
	public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {//判环
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        //找出口
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
