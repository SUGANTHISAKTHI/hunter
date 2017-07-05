package hunter;
import java.util.Scanner;
public class Substring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		int sum=0,max=0,i;
		String maxstring="";
		int len=str1.length();
		for(i=len-1;i>0;i--){
			sum=i;
			String substring=str1.substring(0,i);
			String str2=substring;
			StringBuffer str3=new StringBuffer(str2);
			str3.reverse();
			String str4=str3.toString();
	if(str2.equals(str4)){
				break;
			}
		if(max<sum){
			max=sum;
			maxstring=substring;
			
		}
		
		}
		System.out.println(max);
		System.out.println(maxstring);
		
	}

}
