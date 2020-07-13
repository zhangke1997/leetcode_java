package first;
import java.util.*;
//��Դbfs

public class ti_1162 {
    public int maxDistance(int[][] grid) {
    	Queue<int[]> que = new ArrayDeque<>();
    	int distance=-1; //��¼��Զ�ľ���
    	
    	
    	//Դ�������
    	for(int i=0;i<grid.length;i++) {
    		for(int j =0 ;j<grid[0].length;j++) {
    			if(grid[i][j] == 1) que.add(new int[] {i,j});
    		}
    	}
    	//
    	//ȫΪ0  1ʱ��û�о���
    	if(que.isEmpty() || que.size() == grid.length*grid[0].length)
    		return -1;
    	
    	//�ƶ���������
    	int[][] move= {
    			{-1,0},{1,0},{0,-1},{0,1}
    			};
    	

    	
    	while(!que.isEmpty()) {
    		distance++;//��¼���������Դ�㹲ͬ��������
    		//��һ�������
    		int n =que.size();//��ȡʱ��size�ڱ仯�� �������ȶ�ȡsize
    		
    		for(int i=0;i<n;i++) {
    			//ÿ��ÿ����ȡ��������
    			int[] axis = que.poll();
    			int rr = axis[0];
    			int cc = axis[1];
    			//���������ƶ�������һ��
    			for(int[] mov:move) {
    				int r=rr+mov[0];
    				int c=cc+mov[1];
    				//��1��������Զ0  1������
    				if(inArea(grid,r,c) && grid[r][c]==0) {
    					grid[r][c] =2;//���ʹ�������Ϊ2
    					que.add(new int[] {r,c});
    				}
    					
    			}
    		}
    	}

    	return distance;
    	

    }

	private boolean inArea(int[][] grid, int r, int c) {
    	  return  r>-1
    			  && r < grid.length 
    	          &&  c>-1 
    	          && c < grid[0].length;
    	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
