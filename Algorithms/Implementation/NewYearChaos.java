import java.util.*;
public class NewYearChaos {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int k=0;k<t;k++){
			int n=in.nextInt();
			int ar[]=new int[n];
			for (int i=0;i<n;i++){
				ar[i]=in.nextInt();
				}
			int count=0;
			boolean yes=false;
			for (int i=0;i<n;i++)
				if(ar[i]>i+3){
					System.out.println("Too chaotic");
					yes=true;
					break;
				}
			if (!yes)
			for (int i=0;i<n;i++){
				for(int j=i+1;j<n && j<i+100;j++){
					if(ar[i]>ar[j]){
						int temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
						count++;
						}
					}
				}
			if(!yes)System.out.println(count);
			}

	}

}
