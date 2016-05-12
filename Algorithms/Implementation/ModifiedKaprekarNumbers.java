import java.util.*;
public class ModifiedKaprekarNumbers {
	public static int firstHalf(long a){
		long[] ar={1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000,10000000000L,100000000000L};
		int k=0;
		while(a/(long)ar[k]>0){
			k++;
			}
		if(k%2==0)
			return k/2;
		else
			return k/2+1;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int p=in.nextInt();
		int q=in.nextInt();
		long[] ar={1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000,10000000000L,100000000000L};
		boolean yes=false;
		for(int i=p;i<=q;i++){
			long f=(long)i*(long)i;
			int k=firstHalf(f);
			
			
			
			if ((f%(long)ar[k]>0 && f/(long)ar[k]+f%(long)ar[k]==i)||(i==1)){
				System.out.print(i+" ");
				yes=true;}
		}
		if (!yes){
			System.out.println("INVALID RANGE");
		}
		

	}

}
