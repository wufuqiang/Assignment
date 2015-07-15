import java.util.Scanner;
public class CricleArea {
	public static double PI = 3.1415926;
	static double r,area;
	public  CricleArea(double r)
      {    
       if(r>=0)
       {
         area=PI*r*r;
       }
        else
       {
        area=0;
       }  
      }
	public static void main(String[] args) {
	     
	       System.out.println("Please enter the radius of the circle : ");
	       Scanner input=new Scanner(System.in);
	       r=input.nextDouble();
	       new CricleArea(r);
	       System.out.println("The area of a circle is : "+area);
	    }
    }
