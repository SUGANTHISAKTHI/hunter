package guvi;
import java.util.Scanner;
public class palindrome {

	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	System.out.println("Enter the index position");
	int n=s.nextInt();
	StringBuilder str2=new StringBuilder(str);
	 str2.deleteCharAt(n);
	String str3=str2.toString();
	String str4=str3;
	StringBuffer str5=new StringBuffer(str3);
	str5.reverse();
	 System.out.println(str5);
	String str6=str5.toString();
	if(str4.equals(str6)){
		System.out.println("The string is palindrome");
	}
	if(!str4.equals(str6)){
		System.out.println("The string is not palindrome");
	}
	
	

	}

}
