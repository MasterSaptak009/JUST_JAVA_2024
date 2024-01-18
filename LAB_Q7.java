// Write a java Program to check whether a given number is peterson number or not.

import java.util.*;
public class LAB_Q7
{
   
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the number = ");
	    long num=sc.nextLong();
	    long temp=num;
	    long fact=1,sum=0;
	    while(temp!=0){
	        long rem=temp%10;
	        long f=1;
	        for(long i=1;i<=rem;i++){
	            f=f*i;
	        }
	        sum+=f;
	        temp/=10;
	    }
	    if(sum==num){
	        System.out.println("This is a peterson number");
	    }
	    else{
	        System.out.println("This is not a peterson number!!");
	    }
	}
}