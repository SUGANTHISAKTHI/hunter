package hunter;
import java.util.Arrays;
import java.util.Scanner;
public class greateset {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
String str=s.next();
int r;
char max='\u0000';
int len=str.length();
char[] a=new char[len];
int i,j;
for(i=0;i<len;i++){
	a[i]=str.charAt(i);
}
/*for(i=0;i<len;i++){
	System.out.println(a[i]);
}*/
char[] c=new char[len];
char[] ch=new char[len];
for(i=0;i<len;i++){
	for(j=i+1;j<len;j++){
		if(a[i]==a[j]){
			c[i]=a[i];
		}
	}
	}
for(i=0;i<len;i++){
	if(c[i]!=a[i]){
		ch[i]=a[i];
	}
}
for(i=0;i<len;i++){
	if(ch[i]!='\u0000'){
	if(max<ch[i]){
		max=ch[i];
	}
	}
}Arrays.sort(ch);
for(i=0;i<len;i++){
	if(ch[i]!='\u0000'){
		System.out.print(ch[i]+" ");
	}
}
System.out.println("\n");
System.out.println("maximum number"+max);
}

}
