package Guvi;
import java.util.Scanner;
public class ascii {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String str=s.nextLine();
byte[] b=str.getBytes();
int i,sum=0,sum1=0;
for(i=0;i<b.length;i++){
	System.out.println(b[i]);
}
for(i=0;i<b.length-1;i++){
	sum=sum+(b[i+1]-b[i]);
}
sum1=sum-b[0];
int sum2=Math.abs(sum1);
System.out.println((char)sum2);

}
}
