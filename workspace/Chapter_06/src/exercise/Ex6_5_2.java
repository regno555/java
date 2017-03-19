package exercise;
import lib.Input;

public class Ex6_5_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = Input.getString("文字列 = ");
		int len = str.length();
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(len - 1);
		System.out.print("文字数 = " + len + "\n");
		System.out.print("先頭文字 = " + ch1 + "\n" + "末尾文字 = " + ch2);
	}

}
