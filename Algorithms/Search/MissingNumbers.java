import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int arrA[]=new int[n];
		for (int i=0;i<n;i++){
			arrA[i]=in.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int m=in.nextInt();
		int arrB[]=new int[m];
		for(int i=0;i<m;i++){
			arrB[i]=in.nextInt();
			if (arrB[i]>max)
				max=arrB[i];
			if (arrB[i]<min)
				min=arrB[i];
		}
		int arr[]=new int[max-min+1];
		for(int i=0;i<m;i++){
			arr[arrB[i]-min]++;
		}
		for (int i=0;i<n;i++){
				arr[arrA[i]-min]--;
			
		
		}
		for (int i=0;i<max-min+1;i++){
			for (int j=0;j<arr[i];i++){
				System.out.print(i+min+" ");
			}
		}

	}

}
