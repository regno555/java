package sample;
import lib.TextWriter;

public class Sample7_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TextWriter out = new TextWriter("mydata.txt");	//インスタンスを生成
		out.println("こんにちは。");
		out.println("さようなら");
		out.close();
	}

}
