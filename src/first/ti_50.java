package first;
//����
//1.�ݹ�
//2.����
//

public class ti_50 {
	
	//������ + �ݹ�
    public double myPow1(double x, int n) {
    	return n>0?mypow(x,n):1.0/mypow(x,-n);//���������

    	
    }
    public double mypow(double x ,int n) {//����ʱ�����
    	if(n == 0) return 1.0;
    	double y = mypow(x,n/2);//ÿ��ȡһ������ȡ��
    	return n%2 == 0?y*y:y*y*x;
    	
    }
   
    
    //������ + ����
        double quickMul(double x, long N) {
            double ans = 1.0;
            // ���׵ĳ�ʼֵΪ x
            double x_contribute = x;
            // �ڶ� N ���ж����Ʋ�ֵ�ͬʱ�����
            while (N > 0) {
                if (N % 2 == 1) {
                    // ��� N �����Ʊ�ʾ�����λΪ 1����ô��Ҫ���빱��
                    ans *= x_contribute;
                }
                // �����ײ��ϵ�ƽ��
                x_contribute *= x_contribute;
                // ���� N �����Ʊ�ʾ�����λ����������ÿ��ֻҪ�ж����λ����
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
