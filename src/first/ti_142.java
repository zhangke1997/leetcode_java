package first;
//�������� �ж����  �������ظ���ֵ

public class ti_142 {
	public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {//�л�
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        //�ҳ���
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
