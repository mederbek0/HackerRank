import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class IceCreamParlor {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		
		for (int i=0;i<t;i++){
			HashMap<Integer,Integer> hm=new HashMap();
			int sum=in.nextInt();
			int n=in.nextInt();
			int first=0;
			int second=0;
			for(int j=1;j<=n;j++){
				int current=in.nextInt();
				if (hm.containsKey(sum-current)){
					first=hm.get(sum-current);
					second=j;
				}else{
					hm.put(current, j);
				}
			}
			System.out.println(first+" "+second);
			
			
		}

	}

}
