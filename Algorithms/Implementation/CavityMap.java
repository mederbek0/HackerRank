import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class CavityMap {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String grid[]=new String[n];
		
		for (int i=0;i<n;i++){
				grid[i]=in.next();
		}
		System.out.println(grid[0]);
		for (int i=1;i<n-1;i++){
			char ch[]=grid[i].toCharArray();
			for (int j=1;j<grid[i].length()-1;j++){
				if (ch[j-1]!='X' && ch[j+1]!='X' && ch[j]>ch[j-1] && ch[j]>ch[j+1] && grid[i-1].charAt(j)<ch[j] && grid[i+1].charAt(j)<ch[j] 
						&& grid[i-1].charAt(j)!='X'){
					ch[j]='X';
				}
			}
			for (int j=0;j<grid[i].length();j++){
				System.out.print(ch[j]);
			}
			System.out.println();
		}
		if (n-1>0)
			System.out.println(grid[n-1]);

	}

}
