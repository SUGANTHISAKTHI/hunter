package guvi;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		int n1=str1.length();
		int n2=str2.length();
		int i,j;
		String str3=" ";
		if(n1==n2){
		System.out.println(str1+str2);
		}
		if(n1>n2){
			for(i=0;i<n2;i++){
				str3=str3+str1.charAt(i)+str2.charAt(i);
			}j=1;
			for(i=n2;i<n1;i++){
				str3=str3+str1.charAt(i)+j;
				j++;
			}
		}
		if(n2>n1){
			for(i=0;i<n1;i++){
				str3=str3+str1.charAt(i)+str2.charAt(i);
			}
			j=1;
			for(i=n1;i<n2;i++){
				str3=str3+j+str2.charAt(i);
				j++;
			}
		}
		System.out.println(str3);
	}

}
