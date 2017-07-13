package hunter;
import java.util.*;
public class Gifts {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the gift price");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int d=s.nextInt();
	System.out.println("Enter the price for she have");
	int total=s.nextInt();
	int[] arr=new int[4];
	arr[0]=a;
	arr[1]=b;
	arr[2]=c;
	arr[3]=d;
	Arrays.sort(arr);
	int minimum=arr[0]+arr[1]+arr[2];
	int maximum1=arr[1]+arr[2]+arr[3];
	int maximum2=arr[2]+arr[3];
	int maximum3=arr[3];
	System.out.println("The minimum price is"+minimum);
	System.out.println("The maximum price of gitfs cost is");
	if(total>=maximum1){
		System.out.print(" "+maximum1);
	}else if(total>=maximum2){
		System.out.println(" "+maximum2);
	}else if(total>=maximum3){
		System.out.println(" "+maximum3);
	}
	
}

}
