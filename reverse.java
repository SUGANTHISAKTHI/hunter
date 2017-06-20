package guvi;
import java.util.Scanner;
public class reverse {
static  void display(){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=s.next();
	StringBuffer str1=new StringBuffer(str);
	str1.reverse();
	System.out.println("The reverse string is"+str1);
	
}public static void main(String[] args) {
		//reverse r=new reverse();
		display();
	}

}
