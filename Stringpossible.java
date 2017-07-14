package hunter;
import java.util.*;
public class Stringpossible {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println("Enter the number");
		int n=s.nextInt();
		int len=str.length();
		int n1=1;
		int n2=0;
		int m=1;
		int p=(n-1);
		char ch=str.charAt(0);
		String str1=" ";
		for(int i=0;i<len-1;i++){
			str1=" ";
			for(int j=0;j<1;j++){
				str1=str1+ch+str.substring(n1,n);
			}
			n1=n1+(n-m);
			n=n+(n-m);
			m=m+p;
			System.out.println(str1);
		}
		

	}

}
