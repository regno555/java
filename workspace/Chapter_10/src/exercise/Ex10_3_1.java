package exercise;
import lib.TextReader;

public class Ex10_3_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int total = 0;
		String text ;
		TextReader in = new TextReader("file03.txt");
		while((text = in.readLine()) != null){
			total += text.length();
		}
		System.out.println("合計文字数 = " + total);
	}

}
