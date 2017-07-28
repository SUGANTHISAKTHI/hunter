package hunter;
import java.util.*;
public class Arraysum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size");
	int n=s.nextInt();
	int[][] array=new int[n][n];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			array[i][j]=s.nextInt();
		}
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
	System.out.print(array[i][j]+" ");
		}
		System.out.println();
	}
	int sum1=0;
	int sum2=0;
	int middle=(n/2);
	for(int i=0;i<n;i++){
		sum1=sum1+array[i][middle];
		sum2=sum2+array[middle][i];
		System.out.println(array[i][middle]+" "+array[middle][i]);
	}
System.out.println("The middle sum value is"+(sum1+sum2));
	}

}
