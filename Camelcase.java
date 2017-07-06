package hunter;
import java.util.Scanner;
public class Camelcase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Entre the string");
		String str=s.next();
		String str1[]=str.split(" ");
	    char ch=str.charAt(0);
	    char ch1=str1[0].charAt(0);
	    if((Character.isUpperCase(ch))&&(Character.isUpperCase(ch1))){
	    	System.out.println("The string is camel case");
	    }else{
	    	System.out.println("The string is not a camel case");
	    }
	}

}
