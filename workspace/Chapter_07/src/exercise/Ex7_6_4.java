package exercise;
import lib.TextReader;

public class Ex7_6_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TextReader in = new TextReader("value.txt");
		String dt1 = in.readLine();
		String dt2 = in.readLine();
		String dt3 = in.readLine();
		System.out.println(dt1 + " " + dt2 + " " + dt3);
		in.close();
	}

}
