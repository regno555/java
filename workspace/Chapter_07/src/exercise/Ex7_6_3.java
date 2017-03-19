package exercise;
import lib.TextReader;

public class Ex7_6_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TextReader in = new TextReader("today.txt");
		String today = in.readLine();
		System.out.println(today);
		in.close();
	}

}
