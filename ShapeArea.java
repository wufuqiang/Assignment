package Area;

import java.io.InputStream;
import java.util.Scanner;

public class ShapeArea {
public double area(float r){
	return Math.PI*r*r;
}
public double area(float a,float b){
	return a*b;
}
public double area(float a,float b,float c){
	float d;
	d=(a+b+c)/2;
	return Math.sqrt(d*(d-a)*(d-b)*(d-c));
	
}
public static void main(String[] args){
	ShapeArea sh=new ShapeArea();
	System.out.print("please input the number of circle");
    Scanner san=new Scanner(System.in);
    int a=san.nextInt();
    System.out.print("please input the number of square");
    Scanner sanner=new Scanner(System.in);
    int b=sanner.nextInt();
    System.out.print("please input the number of square");
    Scanner s=new Scanner(System.in);
    int c=s.nextInt();
    System.out.print("total area:"+(a*sh.area(2)+b*sh.area(2,4)+b*sh.area(3,4,5)));
    
    

	
	
	
	
}

}
