import java.util.*;
public class LarysArray {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		for(int k=0;k<t;k++){
			int n=in.nextInt();
			int ar[]=new int[n];
			for (int i=0;i<n;i++){
				ar[i]=in.nextInt();
			}
			int sum=0;
			for (int i=0;i<n;i++){
				int count=0;
				for (int j=i+1;j<n;j++){
					if (ar[i]>ar[j])
						count++;
				}
				sum+=count;
				
			}
			if (sum%2==0){
				System.out.println("YES");
			}else
				System.out.println("NO");
			
		}
		

	}

}
