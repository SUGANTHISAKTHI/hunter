package player;
import java.util.*;
public class malayalam {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String str1=" ";
		char ch2=str.charAt(0);
		str1=str1+ch2;
		int len=str.length();
		int count=0;
		char ch,ch1;
		for(int i=0;i<len-1;i++){
			ch=' ';
			 ch=str.charAt(i);
			 count=1;
			for(int j=i+1;j<len;j++){
				ch1=' ';
				ch1=str.charAt(j);
				if(ch==ch1){
					count=count+1;
				}
			}
			if(count==1){
				str1=str1+ch;
			}
		}
		System.out.println(str1);

	}

}
