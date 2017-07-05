package hunter;
import java.util.Scanner;
public class Double2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str2=s.next();
		int len=str2.length();
		int i,j;
		int count1=0,count2=0;
		for(i=0;i<len;i++){
			count1=0;
			char ch1=str2.charAt(i);
			for(j=0;j<len;j++){
				char ch2=str2.charAt(j);
				if(ch1==ch2){
					count1=count1+1;
				}
			}
			//System.out.println(count1);
			if(count1==2){
				count2=count2+1;
			}
		}
		//System.out.println(count2);
		if(count2==len){
			System.out.println("Double string");
		}
		if(count2!=len){
			System.out.println("Not double string");
		}

	}

}
