package GuessNumber;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		int head=0;
		int tail=100;
		int count=0;
		int i=0;
		System.out.printf("please intput a positive integer");
		Scanner sc=new Scanner(System.in);
		int user_in=sc.nextInt();
		if(user_in<0)
		{
			System.out.print("please input a number from 0 to 100");
		}
        do
         {
        	int middle=((head+tail)/2);
        	if (middle==user_in)
        	{
        		count++;
        		break;
        	}
        	else if(user_in>middle)
        	 {
        		 head=middle;
        		 count++;
        	 }
        	else if(user_in<middle)
        	{
        		tail=middle;
        		count++;
        	}
        	
         } 
        while((head!=user_in||tail!=user_in)|| i>=100);
         
        // if(count<100)
        //	{
        		System.out.print("The time is :"+count);
        //	}
        //	    System.out.print("I can not get it");
	}

}
