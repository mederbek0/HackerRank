
import java.util.*;
public class Encryption {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String s=in.next();
		int len=s.length();
		int col=(int) Math.sqrt((double)len);
		int row=col;
		if (col*col!=len){
			col++;
		}
		if (col*row<len)
			row++;
		char ch[][]=new char[row][col];
		int count=0;
		for (int i=0;i<row;i++){
			for (int j=0;j<col;j++){
				if (count<s.length())
					ch[i][j]=s.charAt(count);
				else
					ch[i][j]='_';
				count++;
			}
		}
		for(int j=0;j<col;j++){
			for(int i=0;i<row;i++){
				if (ch[i][j]!='_')
					System.out.print(ch[i][j]);
			}
			System.out.print(" ");
		}
		
		

	}

}
