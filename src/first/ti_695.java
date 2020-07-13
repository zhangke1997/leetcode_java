package first;

public class ti_695 {
    public int maxAreaOfIsland(int[][] grid) {
    	int res=0;
    	for(int i =0;i<grid.length;i++) {
    		for(int j =0;j<grid[0].length;j++) {
    			if(grid[i][j] == 1) {//遍历所有的陆地块
    				res =Math.max(res,area(grid,i,j));
    			}
    			
    		}
    	}
    	return res;

    }
    int area(int[][] grid,int i,int j) {
    	
    	if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1) return 0;
    	if(grid[i][j]!=1) return 0; //排除0 2 访问过和海洋
    	
    	grid[i][j] = 2;
    	return 1+area(grid,i-1,j)
    			+area(grid,i+1,j)
    			+area(grid,i,j-1)
    			+area(grid,i,j+1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
