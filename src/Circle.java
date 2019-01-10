
public class Circle {

	private double radius; //variable for radius
	
	public Circle() {
		
		radius = 1.0;
		
		
	}//end-empty argument constructor
	
	public Circle(double radius) {
		
		setRadius(radius);
		//this.setRadius(radius);
	}//end preferred constructor
	
	public double calculateArea() {
		
		double area = Math.PI * Math.pow(radius, 2);
		
		return area;
		
		//return Math.PI * Math.pow(radius, 2);
		
	}//end calculateArea
	
	/**
	 * This method returns the value of
	 * the radius.
	 * @return - returns the value of the radius
	 */

	public double getRadius() {
		return radius;
	}//end getRadius

	/**
	 * This method sets the value of
	 * the radius. The method bounds
	 * checks the radius > 1.0.
	 * @param radius
	 */
	public void setRadius(double radius) {
		
		if(radius >= 1.0)
			this.radius = radius;//this refers to object
		else 
			this.radius=1.0;
		
	}//end setRadius

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}//end toString
	
	
}//end class
