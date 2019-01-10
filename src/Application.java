
public class Application {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		
		Circle c = new Circle();
		
		System.out.println(c.toString());
		System.out.println(c.calculateArea());
		
		Circle Carl = new Circle(2.3);
		
		System.out.println(Carl.toString());
		System.out.println(Carl.calculateArea());
		
		Circle CarlJr = new Circle(0.9);
		
		System.out.println(CarlJr.toString());
		System.out.println(CarlJr.calculateArea());

	}//end main

}//end class
