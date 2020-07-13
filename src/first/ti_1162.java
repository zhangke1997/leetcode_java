package first;
import java.util.*;
//多源bfs

public class ti_1162 {
    public int maxDistance(int[][] grid) {
    	Queue<int[]> que = new ArrayDeque<>();
    	int distance=-1; //记录最远的距离
    	
    	
    	//源点入队列
    	for(int i=0;i<grid.length;i++) {
    		for(int j =0 ;j<grid[0].length;j++) {
    			if(grid[i][j] == 1) que.add(new int[] {i,j});
    		}
    	}
    	//
    	//全为0  1时候没有距离
    	if(que.isEmpty() || que.size() == grid.length*grid[0].length)
    		return -1;
    	
    	//移动上下左右
    	int[][] move= {
    			{-1,0},{1,0},{0,-1},{0,1}
    			};
    	

    	
    	while(!que.isEmpty()) {
    		distance++;//记录层数，多个源点共同的最大层数
    		//把一层遍历掉
    		int n =que.size();//读取时候size在变化， 必须事先读取size
    		
    		for(int i=0;i<n;i++) {
    			//每层每个点取横纵坐标
    			int[] axis = que.poll();
    			int rr = axis[0];
    			int cc = axis[1];
    			//横纵坐标移动构建下一层
    			for(int[] mov:move) {
    				int r=rr+mov[0];
    				int c=cc+mov[1];
    				//从1出发找最远0  1不用问
    				if(inArea(grid,r,c) && grid[r][c]==0) {
    					grid[r][c] =2;//访问过就设置为2
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
