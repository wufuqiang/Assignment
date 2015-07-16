import java.util.Scanner;


public class YearDays {
	
	public static int getLeapYear(int year)
	{
		if(((year%100==0)&&(year%400==0))||((year%100!=0)&&(year%4==0)))
			return 1;
		else return 0;
	}

	public static void main(String[] args) {
		System.out.print("please input year");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		if(year<0){
			System.out.print("please input a positive number as a year");
		}
		int flag=getLeapYear(year);
		if(flag==1){
			System.out.print("this year has 365 days");
		}
		System.out.print("this year has 364 days");
		

	}

}
