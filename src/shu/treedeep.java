package shu;

public class treedeep {
	 public class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 
	//deep 104/////////////////////////////////////////////////////////////
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else
            return 1+java.lang.Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    //////////////////////////////////////////////////////////////////////
    //ƽ�������110���߶�������1
    //���deep���������Զ����º���������
    //�Զ����� 1
    public boolean isBalanced1(TreeNode root) {
        
        if(root == null)
            return true;
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left-right)<2)
            return isBalanced1(root.left)&&isBalanced1(root.right);
        else
            return false;

    }
    public int height(TreeNode root)
    {
        if(root == null)
            return 0;
        else
            return Math.max(height(root.left),height(root.right))+1;
    }
    //�Ե�����2
    private boolean result = true;

    public boolean isBalanced2(TreeNode root) {
        maxDepth(root);
        return result;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1) result = false;
        return 1 + Math.max(l, r);
    }
    //////////////////////////////////////////////////////////////////////
    //543·����ֱ������������·�������ֵ����ȸı�
    private int num=0;//��¼��������֮�͵����ֵ
    public int diameterOfBinaryTree(TreeNode root) {
    	
    	deepth2(root);
    	return num;
    }	
    	
    	
    public int deepth2(TreeNode root) {
    		if(root == null) return 0;
    		int l = deepth2(root.left);
    		int r = deepth2(root.right);
    		
    		num = Math.max(l+r, num);
    		return 1+Math.max(l,r);
    		
    	}
    ///////////////////////////////////////////////////////////////
    //226��ת������
    //����������ʣ����µ��Ϸ�ת
    public TreeNode invertTree(TreeNode root) {
    	if(root == null) return root;
    	TreeNode l = root.left;
    	root.left = invertTree(root.right);
    	root.right = invertTree(l);
    	return root;

    }
    //617 �ϲ���
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    	if(t1 == null) return t2;
    	if(t2 == null ) return t1;
    	if(t1==null && t2 ==null) return null;
    	t1.left = mergeTrees(t1.left,t2.left);
    	t1.right= mergeTrees(t1.right,t2.right);
    	t1.val += t2.val; //��ǰ���ֵ���
    	return t1;			//������ɶ���ͷ���ɶ

    }
    //112 ·���ܺ� �ݹ�
    public boolean hasPathSum(TreeNode root, int sum) {
    	if(root == null) return false;
    	if(root.val == sum && root.left ==null && root.right == null) return true;
    	return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);

    }
    //437 ·���ܺ�
    public int pathSum(TreeNode root, int sum) {
    	if (root == null) return 0;
    	return getnum(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);

    }
    public int  getnum(TreeNode root , int sum) {
        if(root ==null ) return 0;
    	int i = 0;
    	if(sum == root.val) i++; 
    	if(root == null &&sum!=0) return i;
    	
    	return i+getnum(root.left,sum-root.val)+getnum(root.right,sum-root.val);
    	
    }
    //572
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        return isSubtreeWithRoot(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSubtreeWithRoot(TreeNode s, TreeNode t) {
        if (t == null && s == null) return true;
        if (t == null || s == null) return false;
        if (t.val != s.val) return false;
        return isSubtreeWithRoot(s.left, t.left) && isSubtreeWithRoot(s.right, t.right);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
