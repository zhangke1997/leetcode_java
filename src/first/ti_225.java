package first;

import java.util.*;
//一个队列实现栈
public class ti_225 {
	
	private Queue<Integer> qu;

	public ti_225() {
		qu = new LinkedList<>();

    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	qu.offer(x);
    	int cout =qu.size();//插入时顺便倒序
    	while(cout-->1)
    	{
    		qu.offer(qu.remove());//1  12》21  213》321
    	}
    }

    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	if(!qu.isEmpty())
    		return qu.poll();
    	throw new RuntimeException("没有元素");

    }
    
    /** Get the top element. */
    public int top() {

    	if(!qu.isEmpty())
    		return qu.peek();
    	throw new RuntimeException("没有元素");

    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
    	return qu.isEmpty();

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ti_225 a =new ti_225();
		a.push(1);
		a.push(2);
		a.push(4);
		System.out.println(a.empty());
		System.out.println(a.pop());
		System.out.println(a.empty());
		System.out.println(a.pop());
		System.out.println(a.top());

	}

}
