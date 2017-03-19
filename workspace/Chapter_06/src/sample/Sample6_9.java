package sample;

import lib.Input;

public class Sample6_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = Input.getString("文字列を入力 = ");
		char ch = str.charAt(0);
		String ss = str.toUpperCase();
		System.out.println("先頭の文字 = " + ch);
		System.out.println("大文字にした文字列 = " + ss);
	}

}
