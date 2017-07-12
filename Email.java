package hunter;
import java.util.*;
public class Email {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the mail id");
		String str=s.next();
		int len=str.length();
		String str1="";
		int len1=len-10;
		for(int i=len1;i<len;i++){
			str1=str1+str.charAt(i);
		}
		String str2="@gmail.com";
		if(str1.equals(str2)){
			System.out.println("The email is valid");
		}else{
			System.out.println("The email is not valid");
		}

	}

}
