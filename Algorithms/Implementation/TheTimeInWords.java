import java.util.*;

public class TheTimeInWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h=in.nextInt();
		int m=in.nextInt();
		String ones[]={"","one","two","three","four","five","six","seven","eight","nine","ten",
				"eleven","twelve","thirteen","fourteen","quarter","sixteen","seventeen","eighteen","nineteen","twenty"};
		String tens[]={"twenty","half"};
		boolean half=false;
		if (m>30){
			m=60-m;
			half=true;
		}
		boolean minute=false;
		if (m==1)
			minute=true;
		String mString="";
		if (m>20 && m<30){
			mString=tens[0]+" "+ones[m%10];
		}else if (m==30){
			mString="half";
		}else if (m<=20){
			mString=ones[m];
		}
		String m1="minute";
		String m2="past";
		if (m==0)
			System.out.println(ones[h]+" o' clock ");
		else{
			if (half){
				h++;
			}
			
			if (!minute){
				m1="minutes";
			}
			if (half){
				m2="to";
				
			}
			if (m!=30 && m!=15)
				System.out.println(mString + " "+m1+" "+m2+" "+ones[h]);
			else
				System.out.println(mString +" "+m2+" "+ones[h]);
			
		}
		

	}

}
