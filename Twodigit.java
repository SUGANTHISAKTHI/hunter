package hunter;
import java.util.*;
public class Twodigit {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=s.nextInt();
	int i,j;
	int[] a=new int[30];
	int k=0;
	int count=0;
	for(i=10;i<99;i++){
		count=0;
		for(j=2;j<i;j++){
			if(i%j==0){
				count=count+1;
				break;
			}
		}
		if(count==0){
			a[k]=i;
			k++;
		}
	}
	for(i=0;i<a.length-1;i++){
		for(j=i+1;j<a.length;j++){
			if(a[i]+a[j]==num){
				System.out.println(a[i]+" "+a[j]);
			}
		}
	}

	}

}
