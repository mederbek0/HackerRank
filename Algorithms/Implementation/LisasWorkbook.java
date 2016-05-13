import java.util.*;
public class LisasWorkbook {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int ar[] =new int[n];
		int chapterPages[]=new int[n];
		for(int i=0;i<n;i++){
			chapterPages[i]=in.nextInt();
		}
		int page=1;
		int count=0;
		int chapter=1;
		int problem=1;
		while(chapter<=n){
			if (problem<=page && page<=Math.min(problem+k-1, chapterPages[chapter-1])){
				count++;
			}
			problem+=k;
			page++;
			if (problem>chapterPages[chapter-1]){
				chapter++;
				problem=1;
			}
		}
		System.out.println(count);
		

	}

}
