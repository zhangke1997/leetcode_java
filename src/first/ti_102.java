package first;
import java.util.*;

public class ti_102 {
	
	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	  
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	Queue<TreeNode> que = new ArrayDeque<TreeNode>();
    	if(root != null) que.add(root);
    	while(!que.isEmpty()) {
    		int n =que.size();
    		List<Integer> list2 = new ArrayList<Integer>();
    		for(;n>0;n--) {
	    		TreeNode temp = que.poll();
	    		list2.add(temp.val);
	    		if(temp.left!= null) que.add(temp.left);
	    		if(temp.right!= null) que.add(temp.right);
    		}
    		list.add(list2);
    		
    	}
    	return list;
    	

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
