package first;
//dfs 200
public class ti_200 {
	
    public void dfs(char[][] grid,int i,int j)
    {
    	int nr = grid.length;
    	int nc = grid[0].length;
    	if(i>nr-1 || j>nc-1 ||i<0||j<0)
    		return;
    	if(grid[i][j]=='0')
    		return;
    	grid[i][j]='0';
    	dfs(grid,i+1,j);
    	dfs(grid,i,j+1);
    	dfs(grid,i,j-1);
    	dfs(grid,i-1,j);
    	
    	
    }
	public int numIslands(char[][] grid) {
		int count=0;
    	if(grid.length==0 || grid ==null) return 0;
    	for(int i=0;i<grid.length;i++)
    		for(int j=0;j<grid[0].length;j++)
    		{
    			if(grid[i][j]=='0') continue;
    			else dfs(grid,i,j);
    			count++;			
    		}
    	return count;
    	

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ti_200 test =new ti_200();
		char[][] a={{'1','0','0'},
					{'0','0','0'},
					{'0','0','1'}};
		System.out.println(a.length);
		System.out.println(a[0].length);		
		System.out.println(test.numIslands(a));
		

	}

}
