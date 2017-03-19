package exercise;
import lib.Input;

public class Ex10_2_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = "";
		while((str = Input.getString("文字列を入力 = ")) != null){
			System.out.println("文字列 = " + str + " : 文字数 = " + str.length());
		}
	}

}
