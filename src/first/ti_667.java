package first;
//��ͣ��ת
//��  ˼��
public class ti_667 {
	
	    public int[] constructArray(int n, int k) {
	        int[] res = new int[n];
	        for(int i = 0; i < n; i++) res[i] = i + 1;  //����1~n����
	        if(k == 1) return res;  //k==1ֱ�ӷ���
	        //k != 1��Ҫ��תk - 1�Σ�ÿ�η�ת����ǰm����
	        for(int m = 1; m < k; m++)
	            reverse(res, m, n - 1); 
	        return res;
	    }
	    //��ת����[i,j]֮�����
	    void reverse(int[] res, int i, int j){
	        while(i < j){
	            int t = res[i];
	            res[i] = res[j];
	            res[j] = t;
	            i++;
	            j--;
	        }
	    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
