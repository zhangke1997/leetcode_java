package first;
//�Զ����� ctrl+ shift +f
//ctrl +/ ����ע��

public class ti_572 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	
	
//����ⷨ����
	public boolean isSame(TreeNode to, TreeNode tw) {// ��ͬ���ж�

		if (to == null && tw == null)
			return true;
		if (to == null || tw == null)
			return false;// ֻ��һ��Ϊnull false
		return to.val == tw.val && isSame(to.left, tw.left) && isSame(to.right, tw.right);

	}

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int left = maxDepth(root.left);
			int right = maxDepth(root.right);
			return 1 + Math.max(left, right);
		}
	}

	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (s == null)
			return false; // û�ҵ����
		if (s.val == t.val && maxDepth(s) == maxDepth(t))
			return isSame(s, t);
		TreeNode sl = s.left;
		TreeNode sr = s.right;

		if (sl != null && sl.val == t.val && maxDepth(sl) == maxDepth(t))
			return isSame(sl, t);
		if (sr != null && sr.val == t.val && maxDepth(sr) == maxDepth(t))
			return isSame(sr, t);
		return isSubtree(sl, t) || isSubtree(sr, t);

	}
///
	
	//��2C++
//	class Solution {
//		public:
//		    bool check(TreeNode *o, TreeNode *t) {
//		        if (!o && !t) return true;
//		        if ((o && !t) || (!o && t) || (o->val != t->val)) return false;
//		        return check(o->left, t->left) && check(o->right, t->right);
//		    }
//
//		    bool dfs(TreeNode *o, TreeNode *t) {
//		        if (!o) return false;
//		        return check(o, t) || dfs(o->left, t) || dfs(o->right, t);
//		    }
//
//		    bool isSubtree(TreeNode *s, TreeNode *t) {
//		        return dfs(s, t);
//		    }
//		};

    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
