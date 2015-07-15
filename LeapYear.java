package LeapYear;

import java.util.Scanner;

public class LeapYear
{

	public static void main(String[] args)
	{
		
		System.out.printf("please intput a positive integer as a yuar");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year>0)
		{
			
		    if((year % 100==0 && year % 400==0)||(year % 100!=0 && year % 4==0))
		    {
		    	
			   System.out.print("This is a leap yuar!");
			  
		    }
		    else System.out.print("This is not a leap yuar!");

	     }
		 else System.out.printf("please input a positive integer");
	}

}
