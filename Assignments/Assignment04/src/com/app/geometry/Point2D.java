package com.app.geometry;

public class Point2D {
	double x;
	double y;
	
	public Point2D(double x, double y) {
		
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String getDetails() {
		return "Point(x=" + x + "Y" + y + ")";
	}
	
	public boolean isEqual(Point2D O)
	{
		
		return this.x==O.x && this.y==O.y;
	}
	public double calculateDistance(Point2D O)
	{
		return Math.sqrt(Math.pow((this.x-O.x),2) + Math.pow(this.y-O.y,2));
	}
	
}
