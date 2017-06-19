package Guvi;
import java.util.Scanner;
public class Duplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=s.next();
	int i;
	for(i=0;i<str.length();i++){
		if((str.charAt(i)!=str.charAt(i+1))&&(str.charAt(i)!=str.charAt(i-1))){
			System.out.println(str.charAt(i));
		}
	}
	

	}

}
