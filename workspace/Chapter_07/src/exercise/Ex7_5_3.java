package exercise;
import java.time.LocalDateTime;
import lib.TextWriter;

public class Ex7_5_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TextWriter out = new TextWriter("today.txt");
		LocalDateTime today = LocalDateTime.now();
		out.println(today);
		out.close();
	}

}
