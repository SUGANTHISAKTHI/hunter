package hunter;
import java.util.Scanner;
public class coprime {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=s.nextInt();
    int m=s.nextInt();
    int count1=0,count2=0;
    int i,j;
    for(i=2;i<n;i++){
    	if(n%i==0){
    		count1=count1+1;
    		break;
    	}
    }
    if(count1==0){
    	System.out.println(n+" is prime number");
    }
    if(count1!=0){
    	System.out.println(n+" is not prime number");
    }
    for(i=2;i<m;i++){
    	if(m%i==0){
    		count1=count1+1;
    		break;
    	}
    }
    if(count1==0){
    	System.out.println(m+" is prime number");
    }
    if(count1!=0){
    	System.out.println(m+" is not prime number");
    }
    int count3=0;
    int num=0;
	for(i=n+1;i<m;i++){
		for(j=2;j<i;j++){
			if(i%j==0){
				count3=count3+1;
				break;
			}
		}
		if(count3==0){
			num=i;
		}
	}
	if(num>0){
		System.out.println("The two number are not co prime number");
	}
	else{
		System.out.println("The number are coprime number");
	}
	}
}
