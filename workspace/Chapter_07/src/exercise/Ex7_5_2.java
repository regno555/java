package exercise;
import lib.Input;
import lib.TextWriter;

public class Ex7_5_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TextWriter out = new TextWriter("renshu.txt");
		String text = Input.getString("文字を入力 = ");
		out.println(text);
		out.close();
	}

}
