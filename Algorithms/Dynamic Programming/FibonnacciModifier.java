
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;
public class FibonnacciModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int first=in.nextInt();
		int second=in.nextInt();
		int n=in.nextInt();
		BigInteger f,s;
		f=BigInteger.valueOf(first);
		s=BigInteger.valueOf(second);
		
		for(int i=2;i<n;i++){
			BigInteger temp=s;
			s=s.multiply(s).add(f);
			f=temp;
		}
		System.out.println(s);

	}

}
