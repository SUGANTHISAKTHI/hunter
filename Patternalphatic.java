package hunter;
import java.util.*;
public class Patternalphatic {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int len=str.length();
		int len1=(len-2)/2;
		String str1="";
		for(int i=len-1;i>=0;i--){
			str1=str1+str.charAt(i);	
	}
		for(int j=1;j<len;j++){
			str1=str1+str.charAt(j);
		}
		int m=0;
		int space=1;
		int n=0;
		for(int i=0;i<str1.length();i++){
			System.out.print(str1.charAt(i)+" ");
		}
		System.out.println("\n");
		for(int i=0;i<len-2;i++){
			for(int a=0;a<len1;a++){
				for(int b=len-1;b>=m;b--){
					System.out.print(str.charAt(b)+" ");
				}
				for(int c=0;c>space;c++){
					System.out.print(" "+" ");
				}
				for(int d=n;d<len;d++){
					System.out.print(str.charAt(d)+" ");
				}
				System.out.println("\n");
				m--;
				space++;
				n++;
			}
		}
}
}

