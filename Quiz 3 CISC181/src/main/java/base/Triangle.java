package base;

import java.lang.Math;

/**
 * @author DSzczechura
 * The Triangle subclass extends the GeometricObject Superclass
 */
public class Triangle extends GeometricObject {

	/**
	 * Attributes of the Triangle class
	 */
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	/**
	 * Default constructor for a Triangle
	 */
	public Triangle() {
	}

	/**
	 * Triangle constructor is made up of three doubles representing the side
	 * values of the Triangle.
	 * 
	 * @param side1
	 *            - represents the first side of the triangle
	 * @param side2
	 *            - represents the second side of the triangle
	 * @param side3
	 *            - represents the third side of the triangle
	 */
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/**
	 * Getter for Side1
	 * 
	 * @return - returns the value of a Triangle's first side
	 */
	public double getSide1() {
		return side1;
	}

	/**
	 * Setter for Side1
	 * 
	 * @param side1 - sets the value of a Triangle's first side
	 */
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	/**
	 * Getter for Side2
	 * 
	 * @return - returns the value of a Triangle's second side
	 */
	public double getSide2() {
		return side2;
	}

	/**
	 * Setter for Side2
	 * 
	 * @param side1 - sets the value of a Triangle's second side
	 */
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	/**
	 * Getter for Side3
	 * 
	 * @return - returns the value of a Triangle's third side
	 */
	public double getSide3() {
		return side3;
	}

	/**
	 * Setter for Side3
	 * 
	 * @param side3 - sets the value of a Triangle's third side
	 */
	public void setSide3(double side3) {
		this.side3 = side3;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see base.GeometricObject#getArea()
	 */
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see base.GeometricObject#getPerimeter()
	 */
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see base.GeometricObject#toString()
	 */
	public String toString() {
		return "The Triangle's side1 = " + side1 + "side2 = " + side2 + "side 3 = " + side3;
	}

}
