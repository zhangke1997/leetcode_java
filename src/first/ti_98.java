package first;
//��֤����������  ������� �ж��Ƿ��С����

public class ti_98 {
	class Solution {
	    long pre = Long.MIN_VALUE;
	    public boolean isValidBST(TreeNode root) {
	        if (root == null) {
	            return true;
	        }
	        // ����������
	        if (!isValidBST(root.left)) {
	            return false;
	        }
	        // ���ʵ�ǰ�ڵ㣺�����ǰ�ڵ�С�ڵ������������ǰһ���ڵ㣬˵��������BST������ false���������������
	        if (root.val <= pre) {
	            return false;
	        }
	        pre = root.val;
	        // ����������
	        return isValidBST(root.right);
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
