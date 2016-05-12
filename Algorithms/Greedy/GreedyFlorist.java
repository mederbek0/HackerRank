import java.util.*;

public class GreedyFlorist {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int ar[] =new int[n];
		for (int i=0;i<n;i++){
			ar[i]=in.nextInt();
		}
		Arrays.sort(ar);
		int sum=0;
		for (int i=n-1;i>=0;i--){
			if (n-i-1<k){
				sum+=ar[i];
			}else{
				int temp=n-i-k-1;
				sum=sum+(((temp/k+1)+1)*ar[i]);
				//System.out.println(temp+" "+(((temp/k+1)+1)*ar[i]));
			}
		}
		System.out.println(sum);

	}

}
