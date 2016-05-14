import java.util.*;
public class GridSearch {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		for(int g=0;g<t;g++){
			int rowNumber1=in.nextInt();
			int colNumber1=in.nextInt();
			String largeGrid[] =new String[rowNumber1];
			in.nextLine();
			for(int i=0;i<rowNumber1;i++){
				largeGrid[i]=in.nextLine();
			}
			int rowNumber2=in.nextInt();
			int colNumber2=in.nextInt();
			in.nextLine();
			String smallGrid[]=new String[rowNumber2];
			for(int i=0;i<rowNumber2;i++){
				smallGrid[i]=in.nextLine();
			}
			boolean yes1=false;
			for (int i=0;i<rowNumber1-rowNumber2+1;i++){
				for (int j=0;j<colNumber1-colNumber2+1;j++){
					
					if (largeGrid[i].charAt(j)==smallGrid[0].charAt(0)){
						boolean yes=false;
						for (int i1=0;i1<rowNumber2;i1++){
							for(int j1=0;j1<colNumber2;j1++){
								if (largeGrid[i+i1].charAt(j+j1)!=smallGrid[i1].charAt(j1)){
									yes=true;
									break;
								}
								if (yes)
									break;
							}
						}
						if(!yes){
							System.out.println("YES");
							yes1=true;
							break;
						}
					}
					
				}
				if(yes1)
					break;
			}
			if (!yes1)
				System.out.println("NO");
			
			
			
			
		}
	}
	

}
