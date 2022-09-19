
public class Exp5_4 {
	public static void main(String[] args) {
		double triangle = calcTriangleArea(10.0, 5.0);
		System.out.println(triangle);

		double radius = calcCircleArea(5.0);
		System.out.println(radius);


	}
	public static double calcTriangleArea(double bottom, double height) {
		double triangle = bottom * height / 2;
		return triangle;
	}
	public static double calcCircleArea(double radius) {
		double circle = radius * radius * 3.14;
		return circle;
	}

}
