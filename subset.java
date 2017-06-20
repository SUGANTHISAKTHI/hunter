package guvi;
import java.util.Scanner;
public class subset {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n1=s.nextInt(),n2=s.nextInt();
		int i,j,count1=0,count2=0;
		int[] a=new int[n1];
		int[] b=new int[n2];
		for(i=0;i<n1;i++){
			a[i]=s.nextInt();
			count1++;
		}
		for(i=0;i<n2;i++){
			b[i]=s.nextInt();
		}
		for(i=0;i<n1;i++){
			for(j=0;j<n2;j++){
				if(a[i]==b[j]){
				     count2++;
				     break;
				     }
			}
		}
		if(count1==count2){
			System.out.println("The a subset is there in b");
		}else{
			System.out.println("a is not a subset of b");
		}
	}

}
