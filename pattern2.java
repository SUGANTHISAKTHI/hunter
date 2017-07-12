package hunter;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int i,j,k;
		int len=str.length();
		int len1=len+len-1;
		char ch1=str.charAt(len-1);
	String str1="";
	String str2="";
	for(j=len-1;j>=0;j--){
		str2=str2+str.charAt(j);
	}
	for(i=len-1;i>=0;i--){
		str1=str1+str.charAt(i);
	}
	for(j=1;j<len;j++){
		str1=str1+str.charAt(j);
	}
	int len2=str1.length();
	int original=str.length();
	int l=len-1;
	int m=1;
	int n=1;
	int l1=0;
	int space;
	int n2=2;
	int len21=str.length()+str.length()-3;
	for(i=len2-1;i>=0;i--){
		System.out.print(str1.charAt(i)+" ");
	}	
	System.out.print("\n");
	for(k=0;k<str.length()-1;k++){
	for(i=l;i>l1;i--){
		System.out.print(str.charAt(i)+" ");
	}
	for(space=0;space<n;space++){
	System.out.print(" "+" ");
	}
	for(j=m;j<len;j++){
		System.out.print(str.charAt(j)+" ");
	}
	System.out.print("\n");
	n=n+2;
	m++;
	l1++;
	}
	int r=2;
	int size=n-2;
	int p=len-2;
	int q=2;
for(int c=0;c<str.length()-2;c++){
for(int b=0;b<r;b++){
	System.out.print(str2.charAt(b)+" ");
}
for(int z=q;z<size;z++){
	System.out.print(" "+" ");
}
for(int d=p;d<len;d++){
	System.out.print(str.charAt(d)+" ");
}
System.out.print("\n");
r++;
size--;
p--;
q++;
}
for(i=len2-1;i>=0;i--){
	System.out.print(str1.charAt(i)+" ");
}	
}	
	

}
