// Write a java program to find maximum and minimum occuring character in a string.

import java.util.*;
public class LAB_Q6
{
    static char maxOccuring(String str,int[] arr){
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }
        int max=Integer.MIN_VALUE;
        char c=' ';
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)]>max){
                max=arr[str.charAt(i)];
                c=str.charAt(i);
            }
        }
        return c;
    }
    static char minOccuring(String str,int[] arr){
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }
        int min=Integer.MAX_VALUE;
        char d=' ';
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)]<min){
                min=arr[str.charAt(i)];
                d=str.charAt(i);
            }
        }
        return d;
    }
	public static void main(String[] args) {
	    int arr[]=new int[127];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String = ");
		String str=sc.next();
		str=str.toLowerCase();
		System.out.println("The max ocuring character is = "+maxOccuring(str,arr));
		System.out.println("The min ocuring character is = "+minOccuring(str,arr));
	}
}