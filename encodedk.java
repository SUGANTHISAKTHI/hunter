package hunter;
import java.util.*;
public class encodedk {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=s.next();
	int len=str.length();
	int num=0;
	String str1=" ";
	for(int i=0;i<len-2;i++){
		num=Character.getNumericValue(str.charAt(i));
		if(num>=0 && str.charAt(i+1)=='x'){
			for(int j=0;j<num;j++){
				str1=str1+str.charAt(i+2);
			}
		}
		else{
			str1=str1+str.charAt(i);
		}
	}
	System.out.println(str1);
}

}
