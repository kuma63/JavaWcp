
public class Method5_10 {
    //	1つめのaddメソッド
	public static int add(int x, int y) {
		return x + y;
	}
    //	2つめのaddメソッド
	public static double add(double x, double y) {
		return x + y;
	}
    //	3つめのaddメソッド
	public static String add(String x, String y) {
		return x + y;
	}
	public static void main(String[] args) {
		System.out.println(add(10, 20));
		System.out.println(add(3.5, 2.7));
		System.out.println(add("Hello", "World"));
	}
}
