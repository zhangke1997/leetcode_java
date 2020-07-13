package first;
import java.util.Stack;
//栈模拟队列   两个栈实现队列
public class ti_232 {
	private Stack<Integer> stack1;
	private Stack<Integer> stack_pop;
	public ti_232() {
		stack1 =new Stack<>();
		stack_pop =new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	stack1.push(x);

    }
    public void shift()
    {
    	if(stack_pop.isEmpty())//判空转换顺序，否则会打乱顺序， 
    	{
	    	while(!stack1.isEmpty())
	    	{
	    		stack_pop.push(stack1.pop());
	    	}
    	}
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	shift();
    	if(!stack_pop.isEmpty())
    		return stack_pop.pop();

    	throw new RuntimeException("没有元素");
    }
    
    /** Get the front element. */
    public int peek() {
    	shift();
    	if(!stack_pop.isEmpty())
    		return stack_pop.peek();
    	
    	throw new RuntimeException("没有元素");
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    	return stack1.isEmpty() && stack_pop.isEmpty();

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ti_232 obj = new ti_232();
		 obj.push(5);
		 obj.push(4);
		 obj.push(3);


		 System.out.println(obj.pop());
		 System.out.println(obj.peek());
		 System.out.println(obj.pop());
		 System.out.println(obj.pop());
		 System.out.println(obj.empty());
		 


	}

}
