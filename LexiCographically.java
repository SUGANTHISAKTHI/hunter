package hunter;
import java.util.*;
public class LexiCographically {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the size");
int size=s.nextInt();
System.out.println("Enter the string one by one");
String[] string=new String[size];
for(int i=0;i<size;i++){
	string[i]=s.next();
}
for(int i=0;i<size;i++){
	String string3="";
	String string2=string[i];
	for(int j=0;j<string2.length()-1;j=j+2){
		char char1=string2.charAt(j);
		char char2=string2.charAt(j+1);
		int num1=(int)char1;
		int num2=(int)char2;
		if(num2>num1){
			string3=string3+char2+char1;
		}else if(num2<num1){
				string3=string3+char1+char2;
			}else if(num1==num2){
				string3="no answer";
		}
		}
	string[i]=string3;
}
for(int i=0;i<size;i++){
	System.out.println(string[i]);
}
}
	}


