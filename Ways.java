package hunter;
import java.util.*;
public class Ways {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int count1=0;
	int count2=0;
	for(int i=1;i<=n;i++){
		count1++;
		if(i==n){
			break;
		}
	}

	for(int i=1;i<n;i=i+2){
		count2++;
		if(i==n){
			break;
		}
		}
		
	
	System.out.println("The 1 stair count is "+count1);
	
	System.out.println("The 2 stair count is "+count2);
	}

}
