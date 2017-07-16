package hunter;
import java.util.*;
public class neighbour {
	void repeated(String str){
	char[] ch=str.toCharArray();
	char temp;
	char ch1=' ';
	char ch2=' ';
	char ch3=' ';
	for(int i=0;i<ch.length-1;i++){
			ch1=ch[i];
			ch2=ch[i+1];
			if(ch1==ch2){
				for(int j=i+2;j<ch.length;j++){
	            ch3=ch[j];
	            if(ch2!=ch3){
				ch[i+1]=ch3;
				ch[j]=ch2;
				break;
	            }}
	}
	}
	String str2="";
	for(int j=0;j<ch.length;j++){
		str2=str2+ch[j];
	}
	if(str2.charAt(0)==str2.charAt(1)){
		System.out.println(str2+"not valid");
	}else if(str2.charAt(0)!=str2.charAt(1)){
		System.out.println(str2+" valid");
	}
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str1=s.next();
	neighbour n=new neighbour();
	n.repeated(str1);
	}

}
