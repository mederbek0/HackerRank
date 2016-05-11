
import java.util.*;
public class SherlockAndArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++){
			int n=in.nextInt();
			int ar[]=new int[n];
			for (int j=0;j<n;j++){
				ar[j]=in.nextInt();
			}
			long longAr1[]=new long[n];
			long sum=0;
			for(int j=0;j<n;j++){
				sum=sum+ar[j];
				longAr1[j]=sum;
			}
			
			long longAr2[]=new long[n];
			sum=0;
			for(int j=n-1;j>=0;j--){
				sum=sum+ar[j];
				longAr2[j]=sum;
			}
			boolean yes=false;
			for (int j=1;j<n-1;j++){
				if (longAr1[j-1]==longAr2[j+1])
					yes=true;
			}
			
			if (yes || n==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
