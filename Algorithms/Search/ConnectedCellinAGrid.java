import java.util.*;
public class ConnectedCellinAGrid {
	public static class Point{
		int row;
		int col;
		public  Point(int a,int b){
			this.row=a;
			this.col=b;
		}
	}

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int ar[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				ar[i][j]=in.nextInt();
			}
		}
		boolean visited[][]=new boolean[m][n];
		int max=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				Queue<Point> queue=new LinkedList<>();
				if (ar[i][j]==1 && !visited[i][j]){
					Point temp= new Point(i,j);
					queue.add(temp);
					int count=0;
					while(!queue.isEmpty()){
						Point cur=queue.poll();
						count++;
						int row=cur.row;
						int col=cur.col;
						visited[row][col]=true;
						
						if (row-1>=0 && col-1>=0 && ar[row-1][col-1]==1 && !visited[row-1][col-1]){
							queue.add(new Point(row-1,col-1));
							visited[row-1][col-1]=true;
						}
						
						if (col-1>=0 && ar[row][col-1]==1 && !visited[row][col-1]){
							queue.add(new Point(row,col-1));
							visited[row][col-1]=true;
						}
						
						if (row-1>=0 && col>=0 && ar[row-1][col]==1 && !visited[row-1][col]){
							queue.add(new Point(row-1,col));
							visited[row-1][col]=true;
						}
						
						if (row+1<m && col+1<n && ar[row+1][col+1]==1 && !visited[row+1][col+1]){
							queue.add(new Point(row+1,col+1));
							visited[row+1][col+1]=true;
						}
						
						if (row<m && col+1<n && ar[row][col+1]==1 && !visited[row][col+1]){
							queue.add(new Point(row,col+1));
							visited[row][col+1]=true;
						}
						if (row+1<m && col<n && ar[row+1][col]==1 && !visited[row+1][col]){
							queue.add(new Point(row+1,col));
							visited[row+1][col]=true;
						}
						if (row+1<m && col-1>=0 && ar[row+1][col-1]==1 && !visited[row+1][col-1]){
							queue.add(new Point(row+1,col-1));
							visited[row+1][col-1]=true;
						}
						if (row-1>=0 && col+1<n && ar[row-1][col+1]==1 && !visited[row-1][col+1]){
							queue.add(new Point(row-1,col+1));
							visited[row-1][col+1]=true;
						}
					}
					if (count>max){
						max=count;
					}
					
				}
			}
		}
		System.out.println(max);
	}

}
