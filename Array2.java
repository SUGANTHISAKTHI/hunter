package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the element");
int n=s.nextInt();
int[] a=new int[n];
int[] b=new int[n];
String str="";
int i,max=0,j,temp=0;
for(i=0;i<n;i++){
	a[i]=s.nextInt();
}for(j=0;j<n;j++){
	for(i=0;i<n;i++){
		if(a[j]>a[i]){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
for(i=0;i<n;i++){
	str=str+a[i];
}
int n1=str.length();
System.out.println(str);
System.out.println(n1);
	for(i=0;i<n1;i=i+3){
		if(n1%3==0){
	System.out.print(str.substring(i,i+3)+",");
	}
else{
	System.out.print(str.substring(i,i+1)+","+str.substring(i+1,i+4));
}
}
	}
}




