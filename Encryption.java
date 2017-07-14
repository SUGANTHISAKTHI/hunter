package milestone;
import java.util.*;
public class Encryption {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the input1");
	String str1=s.next();
	int len=str1.length();
	int i,j;
	int n;
	String str=" ";
	System.out.println("Enter the key");
	char k1=str1.charAt(len-1);
	char key=Character.toLowerCase(k1);
	int k=0;
	int value;
	if(key=='a'){
		k=1;
	}
	if(key=='b'){
		k=2;
	}if(key=='c'){
		k=3;
	}
	if(key=='d'){
		k=4;
	}
	if(key=='e'){
		k=5;
	}
	if(key=='f'){
		k=6;
	}
	if(key=='g'){
		k=7;
	}if(key=='h'){
		k=8;
	}
	if(key=='i'){
		k=9;
	}
	if(key=='j'){
		k=10;
	}
	if(key=='k'){
		k=11;
	}
	if(key=='l'){
		k=12;
	}if(key=='m'){
		k=13;
	}
	if(key=='n'){
		k=14;
	}
	if(key=='o'){
		k=15;
	}
	if(key=='p'){
		k=16;
	}
	if(key=='q'){
		k=17;
	}if(key=='r'){
		k=18;
	}
	if(key=='s'){
		k=19;
	}
	if(key=='t'){
		k=20;
	}
	if(key=='u'){
		k=21;
	}
	if(key=='v'){
		k=22;
	}if(key=='w'){
		k=23;
	}
	if(key=='x'){
		k=24;
	}
	if(key=='y'){
		k=25;
	}
	if(key=='z'){
		k=26;
	}
	
System.out.println(k);
int m;
char onech;
	for(i=0;i<len-1;i++){
		n=0;
		value=0;
		m=0;
		onech=' ';
		char ch1=str1.charAt(i);
		char ch=Character.toUpperCase(ch1);
		switch(ch){
        case  'A':
		    n=1;
		    break;
        case  'B':
		    n=2;
		    break;
        case  'C':
		    n=3;
		    break;
        case  'D':
		    n=4;
		    break;
        case  'E':
		    n=5;
		    break;
        case  'F':
		    n=6;
		    break;
        case  'G':
		    n=7;
		    break;
        case  'H':
		    n=8;
		    break;
		 case  'I':
		    n=9;
		    break;
        case  'J':
		    n=10;
		    break;
        case  'K':
		    n=11;
		    break;
        case  'L':
		    n=12;
		    break;
        case  'M':
		    n=13;
		    break;
        case  'N':
		    n=14;
		    break;
        case  'O':
		    n=15;
		    break;
        case  'P':
		    n=16;
		    break;
        case  'Q':
		    n=17;
		    break;
        case  'R':
		    n=18;
		    break;
        case  'S':
		    n=19;
		    break;
        case  'T':
		    n=20;
		    break;
        case  'U':
		    n=21;
		    break;
        case  'V':
		    n=22;
		    break;
        case  'W':
		    n=23;
		    break;
        case  'X':
		    n=24;
		    break;
        case  'Y':
		    n=25;
		    break;
        case  'Z':
		    n=26;
		    break;
		
		}
		value=n-k;
		if(value<=0){
			m=value+26;
		}if(value>0){
			m=value;
		}
		switch(m){
		case 1:
			onech='a';
			break;
		case 2:
			onech='b';
			break;
		case 3:
			onech='c';
			break;
		case 4:
		   onech='d';
		   break;
		case 5:
			onech='e';
			break;
		case 6:
			onech='f';
			break;
		case 7:
			onech='g';
			break;
		case 8:
			onech='h';
			break;
		case 9:
		   onech='i';
		   break;
		case 10:
			onech='j';
			break;
		case 11:
			onech='k';
			break;
		case 12:
			onech='l';
			break;
		case 13:
			onech='m';
			break;
		case 14:
		   onech='n';
		   break;
		case 15:
			onech='o';
			break;
		case 16:
			onech='p';
			break;
		case 17:
			onech='q';
			break;
		case 18:
			onech='r';
			break;
		case 19:
		   onech='s';
		   break;
		case 20:
			onech='t';
			break;
		case 21:
			onech='u';
			break;
		case 22:
			onech='v';
			break;
		case 23:
			onech='w';
			break;
		case 24:
		   onech='x';
		   break;
		case 25:
			onech='y';
			break;
		case 26:
			onech='z';
			break;
		
		}
		if(Character.isUpperCase(ch1)){
			str=str+Character.toUpperCase(onech);
		}
		if(Character.isLowerCase(ch1)){
			str=str+onech;
		}
		
	}
	System.out.println(str+str1.charAt(len-1));
	
	}

}
