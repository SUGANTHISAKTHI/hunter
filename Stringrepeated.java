package hunter;
import java.util.*;
public class Stringrepeated {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.next();
		StringBuffer str1=new StringBuffer(str);
		str1.reverse();
		String str2=str1.toString();
		int len=str2.length();
		int count=0;
		String str3=" ";
		String str4=" ";
	
		char ch3=' ';
		for(int i=0;i<len;i++){
			count=0;
			for(int j=0;j<str3.length();j++){
				if(str2.charAt(i)!=str3.charAt(j)){
					count=count+1;
			}
			}
			if(count==str3.length()){
				str3=str3+str2.charAt(i);
			}
		}
		System.out.println(str3);
		

	}

}
