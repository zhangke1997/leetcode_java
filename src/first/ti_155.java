package first;
import java.util.*;
//��ͬ����
public class ti_155 {
	private Stack<Integer> sta;
	private Stack<Integer> sta_min;
	public ti_155() {
		sta = new Stack<Integer>();
		sta_min = new Stack<Integer>();

    }
    
    public void push(int x) {
    	sta.push(x);
    	if(sta_min.isEmpty() ||x<=sta_min.peek())//�Ⱥź���Ҫ 121   11 popӰ����Сֵ
    		sta_min.push(x);
    	//sta_mim.push(sta_min.peek());//ͬ����
    }
    
    public void pop() {
    	if(!sta.isEmpty())
    	{
	    	int top = sta.pop();//ԭջpop�ᵼ������Сֵ�ı仯
	    	if(top == sta_min.peek())
	    		sta_min.pop();
	    	
	    	//sta_min.pop();ͬ��ֱ��pop
	    		
    	}
    }
    
    public int top() {
    	return sta.peek();

    }
    
    public int getMin() {
    	if(!sta_min.isEmpty())
    		return sta_min.pop();
    	throw new RuntimeException("no elements");
    }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
