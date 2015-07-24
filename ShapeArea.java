
package com.shape;

public abstract class ShapeArea {
	public abstract double getArea();
}



package com.shape;

public class Rect extends ShapeArea {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double get_Area() {       
		return length * width;
	}
}




package com.shape;

public class Cir extends ShapeArea {
	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double get_Area() { 
		return Math.PI * r * r;
	}
}



package com.shape;

public class Squ extends ShapeArea {
	private double length;
	public Square(double length) {
		this.length = length;
	}

	@Override
	public double get_Area() {     
		return length * length;
	}
}


package com.shape;

public class Triangle extends ShapeArea {
	private double length;
	private double height;
	public Triangle(double length, double height) {
		this.length = length;
		this.height = height;
	}

	@Override
	public double get_Area() {       
		return 0.5 * length * height;
	}
}





package com.shape;

import java.util.ArrayList;

public class Test {

	public static void main(String[] arg) {
        ArrayList<ShapeArea> shapes = new ArrayList<ShapeArea>();
		shapes.add(new Rec(2, 4));
		shapes.add(new Cir(5));
		shapes.add(new Squ(4));
		shapes.add(new Triangle(5, 6));
		System.out.println("Total Area:" + get_Total(shapes));
	}

	private static double get_Total(ArrayList<ShapeArea> shapes) {
		double total = 0;
		for (int i = 0; i < shapes.size(); i++) {
			total = total + ( shapes.get(i)).get_Area();
		}
		return total;
	}
}

