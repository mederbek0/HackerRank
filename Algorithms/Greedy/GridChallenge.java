import java.util.*;
public class GridChallenge {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		for (int k=0;k<t;k++){
			int n=in.nextInt();
			in.nextLine();
			String s[]=new String[n];
			char ch[][]=new char[n][n];
			for (int i=0;i<n;i++){
				s[i]=in.nextLine();
				ch[i]=s[i].toCharArray();
				Arrays.sort(ch[i]);
			}
			boolean yes=false;
			for (int i=1;i<n;i++){
				for (int j=0;j<n;j++){
					if (ch[i][j]<ch[i-1][j]){
						yes=true;
						break;
					}
					
				}
				if (yes)
					break;
			}
			if (yes)
				System.out.println("NO");
			else
				System.out.println("YES");
			
		}

	}

}
