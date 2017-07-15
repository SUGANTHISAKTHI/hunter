package hunter;
import java.util.*;
public class Repeated {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String str1=s.next();
	int count=0;
	int len=str1.length();
	String str2=" ";
	StringBuffer str3=new StringBuffer(str1);
	str3.reverse();
	String str=str3.toString();
	char chone=' ';
	int oneposition=0;
	for(int k=0;k<len;k++){
		count=0;
		char ch2=str.charAt(k);
		for(int m=0;m<len;m++){
			char ch3=str.charAt(m);
			if(ch2==ch3){
			count=count+1;
			}
		}
		if(count==1){
			chone=ch2;
			oneposition=k;
		}
	}
	for(int i=0;i<len;i++){
		char ch=str.charAt(i);
		count=1;
		for(int j=i+1;j<len;j++){
			char ch1=str.charAt(j);
			//System.out.println(ch+" "+ch1);
			if(ch==ch1){
				count=count+1;
			}
		}
		if(count>=2 && count<=2){
			str2=str2+ch;
		}else if(oneposition==i){
			str2=str2+chone;
		}
	}
	System.out.println(str2);

	}

}
