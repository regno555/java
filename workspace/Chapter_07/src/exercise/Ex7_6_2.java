package exercise;
import lib.TextReader;

public class Ex7_6_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TextReader in = new TextReader("renshu.txt");
		String str = in.readLine();
		System.out.println(str);
		in.close();
	}

}
