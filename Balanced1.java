package guvi;
import java.util.Scanner;
public class Balanced1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=str1.toLowerCase();
		int n=str2.length();
		int i;
		int flag=0,flag1=0;
		if(n%2==1){
			System.out.println("Not balanced");
		}
		if(n%2==0){
		for(i=0;i<n;i++){
			char ch1=str2.charAt(i);
			//char ch2=str2.charAt(i+1);
			//System.out.println(ch1+" "+ch2);
			if((ch1>='a'||ch1<='m')){
					flag+=1;
				
				}
			else if((ch1>='n'||ch1<='z')) {
					flag1+=1;
					
				}
		}
		if(flag==flag1){
			System.out.println("balanced");
		}
		if(flag!=flag1){
			System.out.println("Not balanced");
		}
		}

	}

}
