package Ques01;

public class Main {

	public static void main(String[] args) {
		
		  Shape circle = new Circle(5.0);
		  
	        System.out.println("Circle Area: " + circle.calculateArea());
	        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

	        Shape triangle = new Triangle(3.0, 4.0, 5.0);
	        
	        System.out.println("Triangle Area: " + triangle.calculateArea());
	        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
	        
	}

}
