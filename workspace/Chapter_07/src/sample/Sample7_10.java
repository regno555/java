package sample;
import lib.TextReader;

public class Sample7_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TextReader in = new TextReader("mydata.txt");
		String text1 = in.readLine();
		String text2 = in.readLine();
		System.out.println(text1);
		System.out.println(text2);
		in.close();
	}

}
