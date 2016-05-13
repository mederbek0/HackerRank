import java.util.*;

public class BFSShortestReach {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for (int r=0;r<t;r++){
			int n=in.nextInt();
			int m=in.nextInt();
			int ar[][] =new int[n][n];
			for (int i=0;i<m;i++){
				int x=in.nextInt();
				int y=in.nextInt();
				ar[x-1][y-1]=1;
				ar[y-1][x-1]=1;
			}
			int start=in.nextInt();
			Queue<Integer> q=new LinkedList<>();
			int res[]=new int[n];
			boolean visited[] =new boolean[n];
			q.add(start-1);
			for (int i=0;i<n;i++)
				visited[i]=false;
			while(!q.isEmpty()){
				int temp=q.poll();
				visited[temp]=true;
				for (int j=0;j<n;j++){
					if (ar[temp][j]==1 && !visited[j]){
						q.add(j);
						if (res[j]==0)
							res[j]=res[temp]+6;
					}
				}
				
			}
			for (int j=0;j<n;j++){
				if (j!=start-1){
					if (res[j]==0){
						System.out.print(-1+" ");
					}else
					{
						System.out.print(res[j]+" ");
					}
				}
			}
			System.out.println();
			
		}

	}

}
