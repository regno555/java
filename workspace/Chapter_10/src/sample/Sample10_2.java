package sample;
import lib.Input;

public class Sample10_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str, result = "";
		while((str = Input.getString()) != null){
			result += str;
		}
		System.out.println("連結した文字列 = " + result);
	}

}
