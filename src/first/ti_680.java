package first;

public class ti_680 {
    public boolean validPalindrome(String s) {
    	boolean flag=true,flag2=true;
    	
    	int i=0,j=s.length()-1;
    	while(i<j) {
    		if(s.charAt(i)==s.charAt(j)) {
    			i++;
    			j--;
    		}else {
    			for(int m=i+1,n=j;m<n;m++,n-- ) {
    				if(s.charAt(m)!=s.charAt(n))
    				{
    					flag=false;
    					break;
    				}
    			}
    			for(int m=i,n=j-1;m<n;m++,n-- ) {
    				if(s.charAt(m)!=s.charAt(n))
    				{
    					flag2=false;
    					break;
    				}
    			}
    			return flag||flag2;
    		}
    	}
    	
//法二递归判断  c++    	
//    	 boolean is(string a,int i,int j)
//    	    {
//    	        while(i<j)
//    	        {
//    	            if(a[i++]!=a[j--])
//    	                 return false;
//    	        }
//    	        return true;
//    	    }
//    	    boolean validPalindrome(string s) {
//    	        for(int i=0,j=s.size()-1;i<j;i++,j--)
//    	        {
//    	            if(s[i]!=s[j])
//    	                return is(s,i+1,j)||is(s,i,j-1);//非等则跳过一个判断回文
//    	        }              
//    	                return true;
//    	    }
//    	
    	
    	
    	return true;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
