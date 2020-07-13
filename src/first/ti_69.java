package first;

public class ti_69 {
    public int mySqrt(int x) {
    	if(x<=1) return x;
    	int pre=1,last=x/2,mid=pre;
    	while(pre <= last) {
    		mid=pre+(last-pre)/2;
    		if((long)mid*mid==x) return mid;
    		else if((long)mid*mid<x) pre=mid+1;
    		else last =mid-1;
    	}
    	return last;//跳出循环last>pre  取左值

    }
    
///官方 巧妙边界
    class Solution {
        public int mySqrt2(int x) {
            int l = 0, r = x, ans = -1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if ((long)mid * mid <= x) {
                    ans = mid;
                    l = mid + 1;
                }
                else {
                    r = mid - 1;
                }
            }
            return ans;
        }
    }

   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ti_69 a =new ti_69();
		System.out.print(a.mySqrt(2147395599));
		
	}

}
