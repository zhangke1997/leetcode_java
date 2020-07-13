package first;
//验证二叉搜索树  中序遍历 判断是否从小到大

public class ti_98 {
	class Solution {
	    long pre = Long.MIN_VALUE;
	    public boolean isValidBST(TreeNode root) {
	        if (root == null) {
	            return true;
	        }
	        // 访问左子树
	        if (!isValidBST(root.left)) {
	            return false;
	        }
	        // 访问当前节点：如果当前节点小于等于中序遍历的前一个节点，说明不满足BST，返回 false；否则继续遍历。
	        if (root.val <= pre) {
	            return false;
	        }
	        pre = root.val;
	        // 访问右子树
	        return isValidBST(root.right);
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
