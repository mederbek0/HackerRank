import java.util.*;
public class TheMaximumSubarray {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		for (int k=0;k<t;k++){
			int n=in.nextInt();
			int ar[] = new int[n];
			for(int i=0;i<n;i++){
				ar[i]=in.nextInt();
			}
			int max=Integer.MIN_VALUE+100000;
			int maxCons=Integer.MIN_VALUE+10000;
			int prev=Integer.MIN_VALUE+10000;
			for(int i=0;i<n;i++){
			 if (ar[i]>0 && max>0){
					max=ar[i]+max;
					}else if (ar[i]>max && max<0){
					max=ar[i];
				}
					
				
				if (prev+ar[i]>ar[i]){
					prev=prev+ar[i];
				}else
					prev=ar[i];
				if (prev>maxCons)
					maxCons=prev;
			}
			System.out.println(maxCons+" "+max);
			
		}

	}

}
