package first;
import java.util.*;
//���ȶ��� ���ѱ�����С�ģ�k����С����k�������ĵľ��ǵ�kС��ֵ���������ܵ�С�ģ� ���Ե����
//���ַ�

public class ti_378 {
    public int kthSmallest(int[][] matrix, int k) {
    	PriorityQueue<Integer> maxque = new PriorityQueue<>(Collections.reverseOrder());  //Ĭ����С�� ת��֮������
    	for(int[] m :matrix)
    		for(int n:m) {
    			if(maxque.size() == k && n>maxque.peek())
    				break;
    			maxque.add(n);
    			if(maxque.size() >k) maxque.remove();
    		}
    	return maxque.peek();

    }
    
    //����
    public int kthSmallest2(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int lo = matrix[0][0], hi = matrix[m - 1][n - 1];
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cnt = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n && matrix[i][j] <= mid; j++) {
                    cnt++;
                }
            }
            if (cnt < k) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
