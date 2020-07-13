package first;
import java.util.Stack;

public class ti_739 {
	
    public int[] dailyTemperatures(int[] T) {
    	int length =T.length;
    	Stack<Integer> index = new Stack<>();
    	int[] res = new int[length];
    	for(int now=0;now<length;now++) {
    		while(!index.isEmpty() && T[now]>T[index.peek()]) {
    			int pre = index.pop();
    			res[pre] = now - pre;
    		}
    		index.push(now);
    	}
    	return res;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ti_739 q =new ti_739();
		int []  a =new int[]{73, 74, 75, 71, 69, 72, 76, 73};
 		int []  b =q.dailyTemperatures(a);
 		for(int c:b) {
		System.out.println(c);
 		}
	}

}
