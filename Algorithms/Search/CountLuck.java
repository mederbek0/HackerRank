import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class CountLuck {
	public static class Point{
		int row;
		int col;
		public Point(int x,int y){
			this.row=x;
			this.col=y;
		}
	}
	public static Point find(char ch,String[] st){
		for (int i=0;i<st.length;i++){
			for(int j=0;j<st[i].length();j++){
				if (st[i].charAt(j)==ch)
					return new Point(i,j);
			}
		}
		
		return null;
	}
	public static int max(int a,int b,int c,int d){
		return Math.max(a, Math.max(b,Math.max(c, d)));
	}
	public static int CountWave(Point start,Point finish,String[] ar, boolean[][] visited,boolean yes,int sum){
		int rowStart=start.row;
		int colStart=start.col;
		int rowFinish=finish.row;
		int colFinish=finish.col;
		if (rowStart<0 || colStart<0 || rowStart>=ar.length || colStart>=ar[0].length() || ar[rowStart].charAt(colStart)=='X' 
				|| visited[rowStart][colStart])
			return -1;
		if (rowStart==rowFinish && colStart==colFinish)
			return 0;
		int count=0;
		if (colStart-1>=0 && !visited[rowStart][colStart-1] && (ar[rowStart].charAt(colStart-1)=='.' || ar[rowStart].charAt(colStart-1)=='*')){
			count++;
		}
		if (colStart+1<ar[rowStart].length() && !visited[rowStart][colStart+1] && (ar[rowStart].charAt(colStart+1)=='.' || ar[rowStart].charAt(colStart+1)=='*')){
			count++;
		}
		if (rowStart-1>=0 && !visited[rowStart-1][colStart] && (ar[rowStart-1].charAt(colStart)=='.' || ar[rowStart-1].charAt(colStart)=='*')){
			count++;
		}
		if (rowStart+1<ar.length && !visited[rowStart+1][colStart] && (ar[rowStart+1].charAt(colStart)=='.'|| ar[rowStart+1].charAt(colStart)=='*')){
			count++;
		}
		visited[rowStart][colStart]=true;
		if (count>1)
			sum+=1;
		int up=CountWave(new Point(rowStart-1,colStart),finish,ar,visited,true,sum);
		int down=CountWave(new Point(rowStart+1,colStart),finish,ar,visited,true,sum);
		int left=CountWave(new Point(rowStart,colStart-1),finish,ar,visited,true,sum);
		int right=CountWave(new Point(rowStart,colStart+1),finish,ar,visited,true,sum);
		int m=max(up,down,left,right);
		if (m==-1)
			return -1;
		else{
			if (count>1){
				return m+1;
			}else
				return m;
				
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int r=0;r<t;r++){
			int n=in.nextInt();
			int m=in.nextInt();
			String st[] =new String[n];
			in.nextLine();
			
			for (int i=0;i<n;i++){
				st[i]=in.nextLine();
			}
			int k=in.nextInt();
			Point start=find('M',st);
			Point finish=find('*',st);
			int f=CountWave(start,finish,st,new boolean[n][m],false,0);
			if (f==k)	
				System.out.println("Impressed");
			else
				System.out.println("Oops!");
			
			
		}

	}

}
