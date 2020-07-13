package first;
import java.util.*;
import java.lang.String;

public class ti_20 {
    public boolean ti(String s) {
  
    	Stack<Character> stock = new Stack<>();
    	Map<Character,Character> match = new HashMap<>(); 
    	match.put(')','(');
    	match.put('}','{');
    	match.put(']','[');
    	for(char c:s.toCharArray())//转化数组遍历访问
    	{
    		if(c == '('||c == '{'|| c =='[')
    			stock.push(c);
    		else 
    		{

    			if(stock.size()==0 || (match.get(c)!=stock.pop()))
    			{
    				return false;
    				}

    		}
    				
    	}
    	return stock.isEmpty();//返回干净
    	
    	

    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ti_20 a = new ti_20();
		System.out.print(a.ti("{[]}"));

	}

}
