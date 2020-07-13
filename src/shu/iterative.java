package shu;

public class iterative {
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x){
	        val=x;
	    }
	    @Override
	    public String toString(){
	        return "val: "+val;
	    }
	}
    public void visit(TreeNode node){
        System.out.print(node.val+" ");
    }
    /**
     * �ݹ��������
     * */
    public void preOrderRecursion(TreeNode node){
        if(node==null) //������Ϊ���򷵻�
            return;
        visit(node);//���ʸ��ڵ�
        preOrderRecursion(node.left);//��������
        preOrderRecursion(node.right);//�����Һ���
    }
    /**
     * �ǵݹ��������������
     * */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resultList=new ArrayList<>();
        Stack<TreeNode> treeStack=new Stack<>();
        if(root==null) //���Ϊ�����򷵻�
            return resultList;
        treeStack.push(root);
        while(!treeStack.isEmpty()){
            TreeNode tempNode=treeStack.pop(); 
            if(tempNode!=null){
                resultList.add(tempNode.val);//���ʸ��ڵ�
                treeStack.push(tempNode.right); //��ջ�Һ���
                treeStack.push(tempNode.left);//��ջ����
            }
        }
        return resultList;
    }
    /**
     * �ݹ��������
     * */
    public void preOrderRecursion(TreeNode node){
        if(node==null) //������Ϊ���򷵻�
            return;
        preOrderRecursion(node.left);//��������
        visit(node);//���ʸ��ڵ�
        preOrderRecursion(node.right);//�����Һ���
    }
    /**
     * �ǵݹ��������
     * */
    public List<Integer> inorderTraversalNonCur(TreeNode root) {
        List<Integer> visitedList=new ArrayList<>();
        Map<TreeNode,Integer> visitedNodeMap=new HashMap<>();//�����ѷ��ʵĽڵ�
        Stack<TreeNode> toBeVisitedNodes=new Stack<>();//�����ʵĽڵ�
        if(root==null)
            return visitedList;
        toBeVisitedNodes.push(root);
        while(!toBeVisitedNodes.isEmpty()){
            TreeNode tempNode=toBeVisitedNodes.peek(); //ע��������peek������pop
            while(tempNode.left!=null){ //����ýڵ����ڵ㻹δ�����ʣ������ȷ�������ڵ�
                if(visitedNodeMap.get(tempNode.left)!=null) //�ýڵ��Ѿ������ʣ�������ĳ���ڵ��ѱ����ʵ�����ڵ㻹δ�����ʵ������
                    break;
                toBeVisitedNodes.push(tempNode.left);
                tempNode=tempNode.left;
            }
            tempNode=toBeVisitedNodes.pop();//���ʽڵ�
            visitedList.add(tempNode.val);
            visitedNodeMap.put(tempNode, 1);//���ڵ�����ѷ���map
            if(tempNode.right!=null) //���ҽ����ջ
                toBeVisitedNodes.push(tempNode.right);
        }
        return visitedList;
    }
    //�����
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;

        while(cur!=null || !stack.empty()){
            while(cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }

        return list;
    }
    /**
     * �ݹ�������
     * */
    public void postOrderRecursion(TreeNode node){
        if(node==null) //������Ϊ���򷵻�
            return;
        preOrderRecursion(node.left);//��������
       
        preOrderRecursion(node.right);//�����Һ��� 
        visit(node);//���ʸ��ڵ�
    }
    /**
     * �ǵݹ�������
     * */
    public List<Integer> postOrderNonCur(TreeNode root){
        List<Integer> resultList=new ArrayList<>();
        if(root==null)
            return resultList;
        Map<TreeNode,Integer> visitedMap=new HashMap<>();
        Stack<TreeNode> toBeVisitedStack=new Stack<>();
        toBeVisitedStack.push(root);
        while(!toBeVisitedStack.isEmpty()){
            TreeNode tempNode=toBeVisitedStack.peek(); //ע��������peek������pop
            if(tempNode.left==null && tempNode.right==null){ //���û�����Һ��������
                resultList.add(tempNode.val);
                visitedMap.put(tempNode, 1);
                toBeVisitedStack.pop();
                continue;
            }else if(!((tempNode.left!=null&&visitedMap.get(tempNode.left)==null )|| (tempNode.right!=null && visitedMap.get(tempNode.right)==null))){
                //����ڵ�����Һ��Ӿ��ѱ�����            
                resultList.add(tempNode.val);
                toBeVisitedStack.pop();
                visitedMap.put(tempNode, 1);
                continue;
            }
            if(tempNode.left!=null){
                while(tempNode.left!=null && visitedMap.get(tempNode.left)==null){//����û�б�����
                    toBeVisitedStack.push(tempNode.left);
                    tempNode=tempNode.left;
                }
            }
            if(tempNode.right!=null){
                if(visitedMap.get(tempNode.right)==null){//�Һ���û�б�����
                    toBeVisitedStack.push(tempNode.right);
                }               
            }
        }
        return resultList;
    }
    // �������
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList=new ArrayList<>();
        int levelNum=0;//��¼ĳ����ж��ٸ��ڵ�
        Queue<TreeNode> treeQueue=new LinkedList<>();
        treeQueue.add(root);
        while(!treeQueue.isEmpty()){
            levelNum=treeQueue.size();
            List<Integer> levelList=new ArrayList<>();
            while(levelNum>0){
                TreeNode tempNode=treeQueue.poll();
                if(tempNode!=null){
                    levelList.add(tempNode.val);
                    treeQueue.add(tempNode.left); 
                    treeQueue.add(tempNode.right);
                }
                levelNum--;
            }
            if(levelList.size()>0) 
                resultList.add(levelList);
        }
        return resultList;        
    }


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
