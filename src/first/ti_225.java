package first;

import java.util.*;
//һ������ʵ��ջ
public class ti_225 {
	
	private Queue<Integer> qu;

	public ti_225() {
		qu = new LinkedList<>();

    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	qu.offer(x);
    	int cout =qu.size();//����ʱ˳�㵹��
    	while(cout-->1)
    	{
    		qu.offer(qu.remove());//1  12��21  213��321
    	}
    }

    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	if(!qu.isEmpty())
    		return qu.poll();
    	throw new RuntimeException("û��Ԫ��");

    }
    
    /** Get the top element. */
    public int top() {

    	if(!qu.isEmpty())
    		return qu.peek();
    	throw new RuntimeException("û��Ԫ��");

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
