package exercise;
import lib.Input;

public class Ex6_5_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = Input.getString("文字列1 = ");
		String str2 = Input.getString("文字列2 = ");
		boolean result = str2.equals(str1);
		System.out.print("比較結果 = " + result);
	}

}
