package myjava;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the length of fibonacci \n");
		int num = sc.nextInt();
		int first=0;
		int second =1;
		int sum;
		System.out.print(first +" " +second);
		for (int i=0;i<num-2;i++)
		{
			sum = first+second;
			first = second;
			second = sum;
			System.out.print(" "+sum);
		}
		
	}

}
