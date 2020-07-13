package first;
//分治
//1.递归
//2.迭代
//

public class ti_50 {
	
	//快速幂 + 递归
    public double myPow1(double x, int n) {
    	return n>0?mypow(x,n):1.0/mypow(x,-n);//分两种情况

    	
    }
    public double mypow(double x ,int n) {//正数时候计算
    	if(n == 0) return 1.0;
    	double y = mypow(x,n/2);//每次取一半向下取整
    	return n%2 == 0?y*y:y*y*x;
    	
    }
   
    
    //快速幂 + 迭代
        double quickMul(double x, long N) {
            double ans = 1.0;
            // 贡献的初始值为 x
            double x_contribute = x;
            // 在对 N 进行二进制拆分的同时计算答案
            while (N > 0) {
                if (N % 2 == 1) {
                    // 如果 N 二进制表示的最低位为 1，那么需要计入贡献
                    ans *= x_contribute;
                }
                // 将贡献不断地平方
                x_contribute *= x_contribute;
                // 舍弃 N 二进制表示的最低位，这样我们每次只要判断最低位即可
                N /= 2;
            }
            return ans;
        }

        public double myPow2(double x, int n) {
            long N = n;
            return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
        }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
