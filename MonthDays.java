
import java.util.Scanner;


public class MonthDays {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("please input month with english lowercase");
		Scanner sc=new Scanner(System.in);
		String month=sc.nextLine();
		     if(month=="february")
		     {
			     System.out.print("please input year");
			     Scanner s=new Scanner(System.in);
			     int year=s.nextInt();
			     if((year % 100==0 && year % 400==0)||(year % 100!=0 && year % 4==0))
			       {
			    	
				       System.out.print("29 days");
				  
			       }
			     else System.out.print("28 days");
		     }
		     else if((month=="january")||(month=="march")||(month=="may")||(month=="july")||
			        (month=="august")||(month=="october")||(month=="december"))
		     {
		               System.out.print("29 days");
	       	}
		     else if ((month=="april")||(month=="june")||(month=="september")||(month=="november"))
			{
			          System.out.print("28 days");
			}
	 // 	else System.out.print("your input is available");
	}

}
