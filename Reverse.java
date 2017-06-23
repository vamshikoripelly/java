import java.util.Scanner;
public class Reverse {

public static void main(String[] args){
int n;
	System.out.println("Enter a number:");
	Scanner in=new Scanner(System.in);
   n =in.nextInt();	
   Reverse out=new Reverse();
//System.out.println("reverse:"+out.reverse(n));
 
   int reverseNum=out.reverse(n);
  
   System.out.println(n==reverseNum);
   //reverse(n);
	
}
public int reverse(int num)
{

	int t,rev=0,rem;
	
	
	while(num>0)
	{
		t=num/10;
		rem=num%10;
		rev=rev*10+rem;
		num=t;
		System.out.println("Reverse of a number:"+rev);
		
	}
	return rev;
	}
/*
	public static void isPalindrone(int num){
	boolean result;
	String rev = null;
	String t = null;
	if(rev == t)
		System.out.println("Given number "+rev+" is Palindrome");
    
    else
    {
    	result=false;
        System.out.println("Given number "+rev+" is Not Paldrome");
    }
} */
}
	

