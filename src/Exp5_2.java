
public class Exp5_2 {
	public static void main(String[] args) {
		String address = "aaa@aaa";
		String text = "こんにちは";
		email(address, text);
	}
	public static void email(String title, String address, String text) {

		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
    //	練習問題5-3
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + "無題");
		System.out.println("本文:" + text);
	}

}
