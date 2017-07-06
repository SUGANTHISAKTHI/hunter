package hunter;
import java.util.Scanner;
public class Remove {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int n=str.length();
		int i,j;
		int count=0;
		String str1=" ";
		for(i=0;i<n;i++){
			count=0;
			for(j=0;j<n;j++){
				if(str.charAt(i)==str.charAt(j)){
					count=count+1;
				}
			}
			if(count==1){
				str1=str1+str.charAt(i);
			}
		}
		System.out.println(str1);
	}

}
