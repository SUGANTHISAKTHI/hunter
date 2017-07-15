package hunter;
import java.util.*;
public class rotatearray {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}int[] b=new int[n];
	System.out.println("Enter the rotae array");
	for(int i=0;i<n;i++){
		b[i]=s.nextInt();
	}
	int temp=0;
	int count1=0;
	int count2=0;
     for(int i=0;i<n-1;i++){
    	 temp=0;
    	temp=a[0];
    	count1=count1+1;
    	for(int j=1;j<n;j++){
    		a[j-1]=a[j];
    	}
    	a[n-1]=temp;
    	for(int k=0;k<n;k++){
    		if(b[k]==a[k]){
    			count2=count2+1;
    		}
    	}
    	if(count2==n){
    		System.out.println(" the count"+count1);
    		break;
    	}
    	 }
     
	
for(int j=0;j<n;j++){
	System.out.println(a[j]);
}
}
}


