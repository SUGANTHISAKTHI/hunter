package hunter;
import java.util.*;
public class Binary {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the two number");
	int a=s.nextInt();
	int b=s.nextInt();
	int i,j;
	int flag1=0;
	int flag2=0;
	int count=0;
	for(i=a;i<=b;i++){
		flag1=0;
		for(j=2;j<i;j++){
			if(i%j==0){
				flag1=1;
				break;
			}
		} 
	
		if(flag1==0){
			//System.out.println(i);
			String str=Integer.toBinaryString(i);
			System.out.println(str+" "+i);
			int len=str.length();
			//System.out.println(str+" "+len);
			for(int k=0;k<len-1;k=k+2){
				if(str.charAt(k)=='1'&&str.charAt(k+1)=='0'){
				count=count+1;
				//System.out.println(count);
		}
		else if(str.charAt(k)=='0'&&str.charAt(k+1)=='1'){
			count=count+1;
	}
			}
	}
	
	}

	System.out.println(count);
	}
}
